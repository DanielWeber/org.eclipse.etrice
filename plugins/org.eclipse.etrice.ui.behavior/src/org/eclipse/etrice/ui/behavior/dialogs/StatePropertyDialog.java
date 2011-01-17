package org.eclipse.etrice.ui.behavior.dialogs;

import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.core.databinding.validation.IValidator;
import org.eclipse.core.databinding.validation.ValidationStatus;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.etrice.core.room.BaseState;
import org.eclipse.etrice.core.room.RoomPackage;
import org.eclipse.etrice.core.room.State;
import org.eclipse.etrice.core.room.StateGraph;
import org.eclipse.etrice.ui.behavior.Activator;
import org.eclipse.etrice.ui.common.dialogs.AbstractPropertyDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.forms.IManagedForm;

public class StatePropertyDialog extends AbstractPropertyDialog {
	
	class NameValidator implements IValidator {

		@Override
		public IStatus validate(Object value) {
			if (value instanceof String) {
				String name = (String) value;
				
				if (name.isEmpty())
					return ValidationStatus.error("name must not be empty");

				for (State s : sg.getStates()) {
					if (s!=state && s.getName()!=null && s.getName().equals(name))
						return ValidationStatus.error("name already used");
				}
			}
			return Status.OK_STATUS;
		}
	}

	private State state;
	private StateGraph sg;

	public StatePropertyDialog(Shell shell, State s, StateGraph sg) {
		super(shell, "Edit State");
		this.state = s;
		this.sg = sg;
	}

	@Override
	protected Image getImage() {
		return Activator.getImage("icons/Behavior.gif");
	}

	@Override
	protected void createContent(IManagedForm mform, Composite body,
			DataBindingContext bindingContext) {

		if (state instanceof BaseState) {
			NameValidator nv = new NameValidator();
			
			Text name = createText(body, "Name:", state, RoomPackage.eINSTANCE.getBaseState_Name(), nv);
			
			createDecorator(name, "invalid name");
			
			name.setFocus();
		}
		else {
			Text name = mform.getToolkit().createText(body, "Name:", SWT.BORDER);
			name.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
			name.setEnabled(false);
		}

		DetailCodeToString m2s = new DetailCodeToString();
		StringToDetailCode s2m = new StringToDetailCode();
		
		{
			Text entry = createText(body, "&Entry Code:", state, RoomPackage.eINSTANCE.getState_EntryCode(), null, s2m, m2s, true);
			GridData gd = new GridData(GridData.FILL_HORIZONTAL);
			gd.heightHint = 100;
			entry.setLayoutData(gd);
		}
		
		{
			Text exit = createText(body, "E&xit Code:", state, RoomPackage.eINSTANCE.getState_ExitCode(), null, s2m, m2s, true);
			GridData gd = new GridData(GridData.FILL_HORIZONTAL);
			gd.heightHint = 100;
			exit.setLayoutData(gd);
		}
	}

}
