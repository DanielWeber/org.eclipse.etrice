/*******************************************************************************
 * Copyright (c) 2010 protos software gmbh (http://www.protos.de).
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * CONTRIBUTORS:
 * 		Thomas Schuetz and Henrik Rentz-Reichert (initial contribution)
 * 
 *******************************************************************************/

package org.eclipse.etrice.ui.common.dialogs;

import java.util.HashMap;
import java.util.List;

import org.eclipse.core.databinding.AggregateValidationStatus;
import org.eclipse.core.databinding.Binding;
import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.core.databinding.UpdateValueStrategy;
import org.eclipse.core.databinding.beans.PojoObservables;
import org.eclipse.core.databinding.conversion.Converter;
import org.eclipse.core.databinding.conversion.IConverter;
import org.eclipse.core.databinding.observable.ChangeEvent;
import org.eclipse.core.databinding.observable.IChangeListener;
import org.eclipse.core.databinding.validation.IValidator;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.jface.databinding.swt.ISWTObservable;
import org.eclipse.jface.databinding.swt.SWTObservables;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.fieldassist.ControlDecoration;
import org.eclipse.jface.fieldassist.FieldDecoration;
import org.eclipse.jface.fieldassist.FieldDecorationRegistry;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.forms.FormDialog;
import org.eclipse.ui.forms.IManagedForm;
import org.eclipse.ui.forms.widgets.Form;
import org.eclipse.ui.forms.widgets.FormToolkit;


public abstract class AbstractPropertyDialog extends FormDialog {

	static class Reference2StringConverter extends Converter {

		private EAttribute nameAttr;

		Reference2StringConverter(Object type, EAttribute nameAttr) {
			super(type, String.class);
			this.nameAttr = nameAttr;
		}
		
		@Override
		public Object convert(Object fromObject) {
			return ((EObject)fromObject).eGet(nameAttr);
		}
		
	}
	
	static class String2ReferenceConverter extends Converter {
		private List<? extends EObject> candidates;
		private EAttribute nameAttr;

		String2ReferenceConverter(Object type, List<? extends EObject> candidates, EAttribute nameAttr) {
			super(String.class, type);
			this.candidates = candidates;
			this.nameAttr = nameAttr;
		}

		@Override
		public Object convert(Object fromObject) {
			for (EObject obj : candidates) {
				if (obj.eGet(nameAttr).equals(fromObject))
					return obj;
			}
			return null;
		}
	}
	
	private String title;
	private FormToolkit toolkit;
	private DataBindingContext bindingContext;
	private HashMap<Control, ControlDecoration> decoratorMap = new HashMap<Control, ControlDecoration>();

	public AbstractPropertyDialog(Shell shell, String title) {
		super(shell);
		this.title = title;
	}

	abstract protected Image getImage();
	
	@Override
	protected void createFormContent(IManagedForm mform) {
		toolkit = mform.getToolkit();
		bindingContext = new DataBindingContext();

		Form form = mform.getForm().getForm();
		form.setText(title);

		form.setImage(getImage());
		mform.getToolkit().decorateFormHeading(form);

		Composite body = form.getBody();
		body.setLayout(new GridLayout(2, false));
		body.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));

        toolkit.createLabel(body, "", SWT.NONE)
                .setText("Validation Status:");

        Label validationErrorLabel = toolkit.createLabel(
                body, "", SWT.NONE);
        validationErrorLabel
                .setLayoutData(new GridData(
                        GridData.FILL_HORIZONTAL));

		createContent(mform, body, bindingContext);
		
        AggregateValidationStatus aggregateValidationStatus = new AggregateValidationStatus(
        		bindingContext.getBindings(),
                AggregateValidationStatus.MAX_SEVERITY);

		aggregateValidationStatus.addChangeListener(new IChangeListener() {
			public void handleChange(ChangeEvent event) {

				boolean ok = true;
				for (Object o : bindingContext.getBindings()) {
					Binding binding = (Binding) o;
					IStatus status = (IStatus) binding.getValidationStatus()
							.getValue();
					Control control = null;
					if (binding.getTarget() instanceof ISWTObservable) {
						ISWTObservable swtObservable = (ISWTObservable) binding
								.getTarget();
						control = (Control) swtObservable.getWidget();
					}
					ControlDecoration decoration = decoratorMap.get(control);
					if (decoration != null) {
						if (status.isOK()) {
							decoration.hide();
						} else {
							ok = false;
							decoration.setDescriptionText(status.getMessage());
							decoration.show();
						}
					}
				}
				Button okButton = getButton(IDialogConstants.OK_ID);
				if (okButton!=null)
					okButton.setEnabled(ok);
			}
		});

        bindingContext.bindValue(SWTObservables
                .observeText(validationErrorLabel),
                aggregateValidationStatus, null,
                null);

	}

	protected abstract void createContent(IManagedForm mform, Composite body,
			DataBindingContext bindingContext);
	
	protected Text createText(Composite parent, String label, EObject obj, EAttribute att) {
		return createText(parent, label, obj, att, null);
	}
	
	protected Text createText(Composite parent, String label, EObject obj, EAttribute att, IValidator validator) {
		return createText(parent, label, obj, att, validator, false);
	}
	
	protected Text createText(Composite parent, String label, EObject obj, EAttribute att, IValidator validator, boolean multiline) {
		return createText(parent, label, obj, att, validator, null, null, multiline);
	}
	
	protected Text createText(Composite parent, String label, EObject obj, EStructuralFeature feat, IValidator validator, IConverter s2m, IConverter m2s, boolean multiline) {
		Label l = toolkit.createLabel(parent, label, SWT.NONE);
		l.setLayoutData(new GridData(SWT.NONE));
		
		int style = SWT.BORDER;
		if (multiline)
			style |= SWT.MULTI;
		Text text = toolkit.createText(parent, "", style);
		text.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));

		UpdateValueStrategy t2m = null;
		UpdateValueStrategy m2t = null;
		if (validator!=null || s2m!=null || m2s!=null) {
			t2m = new UpdateValueStrategy();
			if (s2m!=null)
				t2m.setConverter(s2m);
			if (validator!=null) {
				t2m.setAfterConvertValidator(validator);
				t2m.setBeforeSetValidator(validator);
			}
			m2t = new UpdateValueStrategy();
			if (m2s!=null)
				m2t.setConverter(m2s);
			if (validator!=null) {
				m2t.setAfterConvertValidator(validator);
				m2t.setBeforeSetValidator(validator);
			}
		}
		bindingContext.bindValue(SWTObservables.observeText(text, SWT.Modify), PojoObservables.observeValue(
				obj, feat.getName()), t2m, m2t);
		
		return text;
	}
	
	protected Button createCheck(Composite parent, String label, EObject obj, EAttribute att) {
		return createCheck(parent, label, obj, att, null);
	}
	
	protected Button createCheck(Composite parent, String label, EObject obj, EAttribute att, IValidator validator) {
		Label l = toolkit.createLabel(parent, label, SWT.NONE);
		l.setLayoutData(new GridData(SWT.NONE));
		
		Button check = toolkit.createButton(parent, "", SWT.CHECK);
		check.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		
		UpdateValueStrategy t2m = null;
		UpdateValueStrategy m2t = null;
		if (validator!=null) {
			t2m = new UpdateValueStrategy();
			t2m.setAfterConvertValidator(validator);
			t2m.setBeforeSetValidator(validator);
			m2t = new UpdateValueStrategy();
			m2t.setAfterConvertValidator(validator);
			m2t.setBeforeSetValidator(validator);
		}
		bindingContext.bindValue(SWTObservables.observeSelection(check), PojoObservables.observeValue(
				obj, att.getName()), t2m, m2t);
		
		return check;
	}
	
	protected Combo createCombo(Composite parent, String label, EObject obj, Object type, EReference ref, List<? extends EObject> candidates, EAttribute nameAttr) {
		return createCombo(parent, label, obj, type, ref, candidates, nameAttr, null);
	}
	
	protected Combo createCombo(Composite parent, String label, EObject obj, Object type, EReference ref, List<? extends EObject> candidates, EAttribute nameAttr, IValidator validator) {
		Label l = toolkit.createLabel(parent, label, SWT.NONE);
		l.setLayoutData(new GridData(SWT.NONE));

		Combo combo = new Combo(parent, SWT.READ_ONLY);
		combo.setLayoutData(new GridData(SWT.HORIZONTAL));
		combo.setVisibleItemCount(10);
		toolkit.adapt(combo, true, true);
		
		Reference2StringConverter r2s = new Reference2StringConverter(type, nameAttr);
		for (EObject o : candidates) {
			combo.add((String) r2s.convert(o));
		}
		
		String2ReferenceConverter s2r = new String2ReferenceConverter(type, candidates, nameAttr);
		UpdateValueStrategy t2m = new UpdateValueStrategy().setConverter(s2r);
		UpdateValueStrategy m2t = new UpdateValueStrategy().setConverter(r2s);
		if (validator!=null) {
			t2m.setAfterConvertValidator(validator);
			t2m.setBeforeSetValidator(validator);
			m2t.setAfterConvertValidator(validator);
			m2t.setBeforeSetValidator(validator);
		}
		bindingContext.bindValue(SWTObservables.observeText(combo), PojoObservables.observeValue(obj, ref.getName()), t2m, m2t);
		
		return combo;
	}

	protected ControlDecoration createDecorator(Control ctrl, String message) {
		ControlDecoration controlDecoration = new ControlDecoration(ctrl, SWT.LEFT | SWT.TOP);
		controlDecoration.setDescriptionText(message);
		FieldDecoration fieldDecoration = FieldDecorationRegistry.getDefault().getFieldDecoration(
				FieldDecorationRegistry.DEC_ERROR);
		controlDecoration.setImage(fieldDecoration.getImage());
		controlDecoration.hide();
        
		decoratorMap.put(ctrl, controlDecoration);

        return controlDecoration;
	}
}
