/*******************************************************************************
 * Copyright (c) 2010 protos software gmbh (http://www.protos.de).
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/

package org.eclipse.etrice.ui.structure.support;

import org.eclipse.etrice.core.validation.ValidationUtil;
import org.eclipse.etrice.ui.structure.ImageProvider;
import org.eclipse.etrice.ui.structure.dialogs.PortPropertyDialog;
import org.eclipse.graphiti.dt.IDiagramTypeProvider;
import org.eclipse.graphiti.features.IAddFeature;
import org.eclipse.graphiti.features.ICreateConnectionFeature;
import org.eclipse.graphiti.features.ICreateFeature;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.IUpdateFeature;
import org.eclipse.graphiti.features.context.IAddContext;
import org.eclipse.graphiti.features.context.ICreateContext;
import org.eclipse.graphiti.features.context.ICustomContext;
import org.eclipse.graphiti.features.context.IDoubleClickContext;
import org.eclipse.graphiti.features.context.IPictogramElementContext;
import org.eclipse.graphiti.features.context.IUpdateContext;
import org.eclipse.graphiti.features.context.impl.CreateConnectionContext;
import org.eclipse.graphiti.features.custom.ICustomFeature;
import org.eclipse.graphiti.mm.algorithms.Ellipse;
import org.eclipse.graphiti.mm.algorithms.GraphicsAlgorithm;
import org.eclipse.graphiti.mm.algorithms.Rectangle;
import org.eclipse.graphiti.mm.algorithms.Text;
import org.eclipse.graphiti.mm.algorithms.styles.Color;
import org.eclipse.graphiti.mm.pictograms.Anchor;
import org.eclipse.graphiti.mm.pictograms.AnchorContainer;
import org.eclipse.graphiti.mm.pictograms.ChopboxAnchor;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipse.graphiti.services.IGaService;
import org.eclipse.graphiti.services.IPeCreateService;
import org.eclipse.graphiti.tb.ContextButtonEntry;
import org.eclipse.graphiti.tb.IContextButtonPadData;
import org.eclipse.graphiti.tb.IToolBehaviorProvider;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.PlatformUI;

import org.eclipse.etrice.core.room.ActorClass;
import org.eclipse.etrice.core.room.ActorContainerClass;
import org.eclipse.etrice.core.room.InterfaceItem;
import org.eclipse.etrice.core.room.Port;
import org.eclipse.etrice.core.room.RoomFactory;
import org.eclipse.etrice.core.room.SubSystemClass;

public class PortSupport extends InterfaceItemSupport {
	
	private static final int REPL_OFFSET = ITEM_SIZE/8;
	private static final int REPL_OFFSET_SMALL = ITEM_SIZE_SMALL/8;
	
	private static class FeatureProvider extends InterfaceItemSupport.FeatureProvider {
		
		private class CreateFeature extends InterfaceItemSupport.FeatureProvider.CreateFeature {
	
			public CreateFeature(IFeatureProvider fp, boolean internal) {
				super(fp, internal, internal?"Internal Port":"Interface Port", internal?"create internal Port":"create interface Port");
			}
			
			@Override
			public String getCreateImageId() {
				return ImageProvider.IMG_PORT;
			}
	
			@Override
			public Object[] create(ICreateContext context) {
		        // create Port
		        Port port = RoomFactory.eINSTANCE.createPort();
		        port.setName("");
		    	
		        ActorContainerClass acc = (ActorContainerClass) context.getTargetContainer().getLink().getBusinessObjects().get(0);
		        
		        Shell shell = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell();
		        PortPropertyDialog dlg = new PortPropertyDialog(shell, port, acc, true, false, internal);
				if (dlg.open()!=Window.OK)
					// find a method to abort creation
					//throw new RuntimeException();
					return EMPTY;
				
				doneChanges = true;
				
		        if (acc instanceof ActorClass) {
		        	ActorClass ac = (ActorClass) acc;
		        	if (internal)
		        		ac.getIntPorts().add(port);
		        	else
		        		ac.getIfPorts().add(port);
		        }
		        else if (acc instanceof SubSystemClass) {
		        	SubSystemClass ssc = (SubSystemClass) acc;
		        	ssc.getRelayPorts().add(port);
		        }
		        else {
		        	assert(false): "ActorClass or SubSystemClass expected";
		        }
		        
		        // do the add
		        addGraphicalRepresentation(context, port);
	
		        // return newly created business object(s)
		        return new Object[] { port };
			}
		}
		
		private static class AddFeature extends InterfaceItemSupport.FeatureProvider.AddFeature {
	
			public AddFeature(IFeatureProvider fp) {
				super(fp);
			}

			@Override
			protected String getItemKind(InterfaceItem item) {
				if (item instanceof Port)
					return getPortKind((Port) item);
				
				return "";
			}

			@Override
			protected void createItemFigure(InterfaceItem item,
					boolean refitem, ContainerShape containerShape,
					GraphicsAlgorithm invisibleRectangle, Color darkColor,
					Color brightDolor) {
				
				if (item instanceof Port)
					createPortFigure((Port) item, refitem, containerShape, invisibleRectangle, darkColor, brightDolor);
			}
	
		}
		
		private static class PropertyFeature extends InterfaceItemSupport.FeatureProvider.PropertyFeature {

			public PropertyFeature(IFeatureProvider fp) {
				super(fp, "Edit Port...", "Edit Port Properties");
			}

			@Override
			public void execute(ICustomContext context) {
				Object bo = getBusinessObjectForPictogramElement(context.getPictogramElements()[0]);
				if (bo instanceof Port) {
					Port port = (Port) bo;
					Shell shell = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell();
					ActorContainerClass acc = (ActorContainerClass)port.eContainer();
					boolean internal = isInternal(port);
					boolean refport = isRefItem(context.getPictogramElements()[0]);
					
					PortPropertyDialog dlg = new PortPropertyDialog(shell, port, acc, false, refport, internal);
					if (dlg.open()!=Window.OK)
						// TODOHRR: introduce a method to revert changes
						//throw new RuntimeException();
						return;
					
					updatePortFigure(port, context.getPictogramElements()[0], manageColor(DARK_COLOR), manageColor(BRIGHT_COLOR));
				}
			}
			
		}
		
		private class UpdateFeature extends InterfaceItemSupport.FeatureProvider.UpdateFeature {

			public UpdateFeature(IFeatureProvider fp) {
				super(fp);
			}

			@Override
			protected String getItemKind(InterfaceItem item) {
				if (item instanceof Port)
					return getPortKind((Port)item);
				
				return "";
			}

			@Override
			protected void updateFigure(InterfaceItem item,
					PictogramElement pe, Color dark, Color bright) {
				updatePortFigure((Port)item, pe, dark, bright);
			}
			
		}
		
		public FeatureProvider(IDiagramTypeProvider dtp, IFeatureProvider fp) {
			super(dtp, fp);
		}
		
		@Override
		public ICreateFeature[] getCreateFeatures() {
			return new ICreateFeature[] { new CreateFeature(fp, true), new CreateFeature(fp, false) };
		}
		
		@Override
		public IAddFeature getAddFeature(IAddContext context) {
			return new AddFeature(fp);
		}
	
		@Override
		public ICustomFeature[] getCustomFeatures(ICustomContext context) {
			return new ICustomFeature[] { new PropertyFeature(fp) };
		}
		
		@Override
		public IUpdateFeature getUpdateFeature(IUpdateContext context) {
			return new UpdateFeature(fp);
		}

		protected static void createPortFigure(Port port, boolean refport,
				ContainerShape containerShape,
				GraphicsAlgorithm invisibleRectangle, Color darkColor, Color brightDolor) {

			boolean relay = ValidationUtil.isRelay(port);
			
			int size = refport?ITEM_SIZE_SMALL:ITEM_SIZE;
			int offset = refport?REPL_OFFSET_SMALL:REPL_OFFSET;
			int line = refport?LINE_WIDTH/2:LINE_WIDTH;
			
			Color bg = brightDolor;
			if (refport) {
				if (port.isConjugated())
					bg = brightDolor;
				else
					bg = darkColor;
			}
			else {
				if (!port.isConjugated() && !relay)
					bg = darkColor;
				else
					bg = brightDolor;
			}

			IGaService gaService = Graphiti.getGaService();
			if (port.getMultiplicity()>1) {
				Rectangle rect = gaService.createRectangle(invisibleRectangle);
				rect.setForeground(darkColor);
				rect.setBackground(brightDolor);
				rect.setLineWidth(line);
				gaService.setLocationAndSize(rect, size/2+offset, size/2-offset, size, size);
			}
			
			Rectangle rect = gaService.createRectangle(invisibleRectangle);
			rect.setForeground(darkColor);
			rect.setBackground(bg);
			rect.setLineWidth(line);
			gaService.setLocationAndSize(rect, size/2, size/2, size, size);

			if (containerShape.getAnchors().isEmpty()) {
				// here we place our anchor
				IPeCreateService peCreateService = Graphiti.getPeCreateService();
				ChopboxAnchor anchor = peCreateService.createChopboxAnchor(containerShape);
				anchor.setReferencedGraphicsAlgorithm(rect);
			}
			else {
				// we just set the referenced GA
				containerShape.getAnchors().get(0).setReferencedGraphicsAlgorithm(rect);
			}
			
			if (!refport) {
				if (port.isConjugated() || !relay) {
					// we have more details
					
					if (relay) {
						// conjugated relay
						Rectangle inset = gaService.createRectangle(invisibleRectangle);
						inset.setForeground(darkColor);
						inset.setBackground(darkColor);
						inset.setLineWidth(LINE_WIDTH);
						gaService.setLocationAndSize(inset, 3*size/4, 3*size/4, size/2, size/2);
					}
					else {
						Color fill = port.isConjugated()?darkColor:brightDolor;
						
						Ellipse inset = gaService.createEllipse(invisibleRectangle);
						inset.setForeground(fill);
						inset.setBackground(fill);
						inset.setLineWidth(LINE_WIDTH);
						gaService.setLocationAndSize(inset, 3*size/4, 3*size/4, size/2, size/2);
					}
				}
			}
		}

		private static void updatePortFigure(Port port, PictogramElement pe, Color dark, Color bright) {
			ContainerShape container = (ContainerShape)pe;
			
			// we clear the figure and rebuild it
			GraphicsAlgorithm invisibleRect = pe.getGraphicsAlgorithm();
			invisibleRect.getGraphicsAlgorithmChildren().clear();
			
			createPortFigure(port, false, container, invisibleRect, dark, bright);
			
			GraphicsAlgorithm ga = container.getChildren().get(0).getGraphicsAlgorithm();
			if (ga instanceof Text) {
				((Text)ga).setValue(port.getName());
			}

		}
		
	}

	private class BehaviorProvider extends InterfaceItemSupport.BehaviorProvider {

		public BehaviorProvider(IDiagramTypeProvider dtp) {
			super(dtp);
		}
		
		@Override
		public ICustomFeature getDoubleClickFeature(IDoubleClickContext context) {
			return new FeatureProvider.PropertyFeature(getDiagramTypeProvider().getFeatureProvider());
		}
		
		@Override
		public IContextButtonPadData getContextButtonPad(
				IPictogramElementContext context) {
			
			IContextButtonPadData data = super.getContextButtonPad(context);
			PictogramElement pe = context.getPictogramElement();

			CreateConnectionContext ccc = new CreateConnectionContext();
			ccc.setSourcePictogramElement(pe);
			Anchor anchor = null;
			if (pe instanceof AnchorContainer) {
				// our port has a chopbox anchor
				anchor = Graphiti.getPeService().getChopboxAnchor((AnchorContainer) pe);
			}
			ccc.setSourceAnchor(anchor);
			
			ContextButtonEntry button = new ContextButtonEntry(null, context);
			button.setText("Create Binding");
			button.setIconId(ImageProvider.IMG_BINDING);
			ICreateConnectionFeature[] features = getFeatureProvider().getCreateConnectionFeatures();
			for (ICreateConnectionFeature feature : features) {
				if (feature.isAvailable(ccc) && feature.canStartConnection(ccc))
					button.addDragAndDropFeature(feature);
			}

			if (button.getDragAndDropFeatures().size() > 0) {
				data.getDomainSpecificContextButtons().add(button);
			}

			return data;
		}
	}
	
	private FeatureProvider pfp;
	private BehaviorProvider tbp;
	
	public PortSupport(IDiagramTypeProvider dtp, IFeatureProvider fp) {
		pfp = new FeatureProvider(dtp,fp);
		tbp = new BehaviorProvider(dtp);
	}
	
	public IFeatureProvider getFeatureProvider() {
		return pfp;
	}
	
	public IToolBehaviorProvider getToolBehaviorProvider() {
		return tbp;
	}
	
	private static String getPortKind(Port port) {
		String kind = "";
		if (port.isConjugated())
			kind += "C";
		if (ValidationUtil.isRelay(port))
			kind += "R";
		if (port.getMultiplicity()>1)
			kind += "M";
		return kind;
	}
}
