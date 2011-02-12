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

package org.eclipse.etrice.ui.behavior.support;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.etrice.core.naming.RoomNameProvider;
import org.eclipse.etrice.core.room.ChoicePoint;
import org.eclipse.etrice.core.room.RoomFactory;
import org.eclipse.etrice.core.room.State;
import org.eclipse.etrice.core.room.StateGraph;
import org.eclipse.etrice.ui.behavior.ImageProvider;
import org.eclipse.etrice.ui.behavior.NoResizeFeature;
import org.eclipse.graphiti.dt.IDiagramTypeProvider;
import org.eclipse.graphiti.features.IAddFeature;
import org.eclipse.graphiti.features.ICreateConnectionFeature;
import org.eclipse.graphiti.features.ICreateFeature;
import org.eclipse.graphiti.features.IDeleteFeature;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.IMoveShapeFeature;
import org.eclipse.graphiti.features.IReason;
import org.eclipse.graphiti.features.IRemoveFeature;
import org.eclipse.graphiti.features.IResizeShapeFeature;
import org.eclipse.graphiti.features.IUpdateFeature;
import org.eclipse.graphiti.features.context.IAddContext;
import org.eclipse.graphiti.features.context.ICreateContext;
import org.eclipse.graphiti.features.context.IDeleteContext;
import org.eclipse.graphiti.features.context.IMoveShapeContext;
import org.eclipse.graphiti.features.context.IPictogramElementContext;
import org.eclipse.graphiti.features.context.IRemoveContext;
import org.eclipse.graphiti.features.context.IResizeShapeContext;
import org.eclipse.graphiti.features.context.IUpdateContext;
import org.eclipse.graphiti.features.context.impl.CreateConnectionContext;
import org.eclipse.graphiti.features.context.impl.RemoveContext;
import org.eclipse.graphiti.features.impl.AbstractAddFeature;
import org.eclipse.graphiti.features.impl.AbstractCreateFeature;
import org.eclipse.graphiti.features.impl.AbstractUpdateFeature;
import org.eclipse.graphiti.features.impl.DefaultMoveShapeFeature;
import org.eclipse.graphiti.features.impl.DefaultRemoveFeature;
import org.eclipse.graphiti.features.impl.Reason;
import org.eclipse.graphiti.mm.algorithms.Ellipse;
import org.eclipse.graphiti.mm.algorithms.GraphicsAlgorithm;
import org.eclipse.graphiti.mm.algorithms.Rectangle;
import org.eclipse.graphiti.mm.algorithms.Text;
import org.eclipse.graphiti.mm.algorithms.styles.Color;
import org.eclipse.graphiti.mm.algorithms.styles.Orientation;
import org.eclipse.graphiti.mm.pictograms.Anchor;
import org.eclipse.graphiti.mm.pictograms.AnchorContainer;
import org.eclipse.graphiti.mm.pictograms.ChopboxAnchor;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.mm.pictograms.Shape;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipse.graphiti.services.IGaService;
import org.eclipse.graphiti.services.IPeCreateService;
import org.eclipse.graphiti.tb.ContextButtonEntry;
import org.eclipse.graphiti.tb.DefaultToolBehaviorProvider;
import org.eclipse.graphiti.tb.IContextButtonPadData;
import org.eclipse.graphiti.tb.IToolBehaviorProvider;
import org.eclipse.graphiti.ui.features.DefaultDeleteFeature;
import org.eclipse.graphiti.ui.features.DefaultFeatureProvider;
import org.eclipse.graphiti.util.ColorConstant;
import org.eclipse.graphiti.util.IColorConstant;

public class ChoicePointSupport {
	
	public static final int ITEM_SIZE = StateGraphSupport.MARGIN;

	protected static final int LINE_WIDTH = 2;
	protected static final IColorConstant DARK_COLOR = new ColorConstant(0, 0, 0);
	protected static final IColorConstant INHERITED_COLOR = new ColorConstant(100, 100, 100);
	protected static final IColorConstant BRIGHT_COLOR = new ColorConstant(255, 255, 255);
	protected static final String PROP_KIND = "item-kind";
	
	private static class FeatureProvider extends DefaultFeatureProvider {
		
		private static class CreateFeature extends AbstractCreateFeature {
	
			public CreateFeature(IFeatureProvider fp, String name, String description) {
				super(fp, name, description);
			}
			
			@Override
			public String getCreateImageId() {
				return ImageProvider.IMG_CP;
			}
	
			@Override
			public Object[] create(ICreateContext context) {
				StateGraph sg = (StateGraph) context.getTargetContainer().getLink().getBusinessObjects().get(0);

				// create choice point
		    	ChoicePoint cp = RoomFactory.eINSTANCE.createChoicePoint();
				String name = RoomNameProvider.getUniqueChoicePointName(sg);
				cp.setName(name);
				sg.getChPoints().add(cp);
		        
		        // do the add
		        addGraphicalRepresentation(context, cp);
	
		        // return newly created business object(s)
		        return new Object[] { cp };
			}
	
			@Override
			public boolean canCreate(ICreateContext context) {
				if (context.getTargetContainer().getLink()!=null)
					if (context.getTargetContainer().getLink().getBusinessObjects().size()==1) {
						EObject obj = context.getTargetContainer().getLink().getBusinessObjects().get(0);
						if (obj instanceof StateGraph) {
							return true;
						}
					}
				return false;
			}
		}
		
		private class AddFeature extends AbstractAddFeature {
	
			public AddFeature(IFeatureProvider fp) {
				super(fp);
			}
			
			@Override
			public boolean canAdd(IAddContext context) {
				if (context.getNewObject() instanceof ChoicePoint) {
					if (context.getTargetContainer().getLink().getBusinessObjects().size()==1) {
						EObject obj = context.getTargetContainer().getLink().getBusinessObjects().get(0);
						if (obj instanceof StateGraph) {
							return true;
						}
					}
				}
				return false;
			}
	
			@Override
			public PictogramElement add(IAddContext context) {
				ChoicePoint cp = (ChoicePoint) context.getNewObject();
				ContainerShape sgShape = context.getTargetContainer();
				Object bo = getBusinessObjectForPictogramElement(sgShape);
				boolean inherited = isInherited(cp, bo, sgShape);
	
				// CONTAINER SHAPE WITH RECTANGLE
				IPeCreateService peCreateService = Graphiti.getPeCreateService();
				ContainerShape containerShape =
					peCreateService.createContainerShape(sgShape, true);
	
				Graphiti.getPeService().setPropertyValue(containerShape, Constants.TYPE_KEY, Constants.TRP_TYPE);
				
				int x = context.getX()-ITEM_SIZE;
				int y = context.getY()-ITEM_SIZE;
				
				Color dark = manageColor(inherited? INHERITED_COLOR:DARK_COLOR);
				IGaService gaService = Graphiti.getGaService();
				{
					final Rectangle invisibleRectangle = gaService.createInvisibleRectangle(containerShape);
					gaService.setLocationAndSize(invisibleRectangle, x, y, 2*ITEM_SIZE, 2*ITEM_SIZE);
	
					createFigure(cp,
							containerShape,
							invisibleRectangle,
							dark,
							manageColor(BRIGHT_COLOR));
	
					// create link and wire it
					link(containerShape, cp);
				}
				
				{
					Shape labelShape = peCreateService.createShape(containerShape, false);
					Text label = gaService.createDefaultText(labelShape, "C");
					label.setForeground(dark);
					label.setBackground(dark);
					label.setHorizontalAlignment(Orientation.ALIGNMENT_CENTER);
					label.setVerticalAlignment(Orientation.ALIGNMENT_CENTER);
					gaService.setLocationAndSize(label, 0, ITEM_SIZE/2, 2*ITEM_SIZE, ITEM_SIZE);
				}

				// call the layout feature
				layoutPictogramElement(containerShape);
	
				return containerShape;
	
			}

		}
		
		protected class MoveShapeFeature extends DefaultMoveShapeFeature {
	
			public MoveShapeFeature(IFeatureProvider fp) {
				super(fp);
			}
	
			@Override
			public boolean canMoveShape(IMoveShapeContext context) {
				boolean canMove = super.canMoveShape(context);
	
				if (canMove) {
					Object bo = getBusinessObjectForPictogramElement(context.getPictogramElement());
					if (bo instanceof ChoicePoint) {
						ChoicePoint cp = (ChoicePoint) bo;
						
						ContainerShape acShape = context.getTargetContainer();
						Object parentBO = getBusinessObjectForPictogramElement(acShape);
						if (isInherited(cp, parentBO, acShape))
							return false;
						
						return true;
					}
					return false;
				}
				
				return canMove;
			}
		}
		
		private class UpdateFeature extends AbstractUpdateFeature {

			public UpdateFeature(IFeatureProvider fp) {
				super(fp);
			}

			@Override
			public boolean canUpdate(IUpdateContext context) {
				Object bo = getBusinessObjectForPictogramElement(context.getPictogramElement());
				if (bo instanceof EObject && ((EObject)bo).eIsProxy())
					return true;
				
				return bo instanceof ChoicePoint;
			}

			@Override
			public IReason updateNeeded(IUpdateContext context) {
				Object bo = getBusinessObjectForPictogramElement(context.getPictogramElement());
				if (bo instanceof EObject && ((EObject)bo).eIsProxy()) {
					return Reason.createTrueReason("ChoicePoint deleted from model");
				}
				
				// check if cp still owned/inherited
				// TODOHRR-B check inheritance
//				ChoicePoint cp = (ChoicePoint) bo;
//				ContainerShape containerShape = (ContainerShape)context.getPictogramElement();
//				bo = getBusinessObjectForPictogramElement(containerShape);
//				if (bo instanceof StateGraph) {
//					StateGraph sg = (StateGraph) bo;
//					boolean found = false;
//					do {
//						if (sg==cp.eContainer())
//							found = true;
//						sg = sg.getBase();
//					}
//					while (!found && sg!=null);
//					
//					if (!found)
//						return Reason.createTrueReason("TransitionPoint not inherited anymore");
//				}
				
				return Reason.createFalseReason();
			}

			@Override
			public boolean update(IUpdateContext context) {
				ContainerShape containerShape = (ContainerShape)context.getPictogramElement();
				Object bo = getBusinessObjectForPictogramElement(containerShape);
				if (bo instanceof EObject && ((EObject)bo).eIsProxy()) {
					IRemoveContext rc = new RemoveContext(containerShape);
					IFeatureProvider featureProvider = getFeatureProvider();
					IRemoveFeature removeFeature = featureProvider.getRemoveFeature(rc);
					if (removeFeature != null) {
						removeFeature.remove(rc);
					}
					EcoreUtil.delete((EObject) bo);
					return true;
				}
				ChoicePoint cp = (ChoicePoint) bo;
				
				boolean inherited = isInherited(cp, bo, containerShape);
				
				Color dark = manageColor(inherited? INHERITED_COLOR:DARK_COLOR);
				updateFigure(cp, containerShape, dark, manageColor(BRIGHT_COLOR));
				return true;
			}
			
		}
		
		protected static class RemoveFeature extends DefaultRemoveFeature {

			public RemoveFeature(IFeatureProvider fp) {
				super(fp);
			}

			public boolean canRemove(IRemoveContext context) {
				Object bo = getBusinessObjectForPictogramElement(context.getPictogramElement());
				if (bo instanceof ChoicePoint) {
					ChoicePoint cp = (ChoicePoint) bo;
					
					ContainerShape containerShape = (ContainerShape) context.getPictogramElement().eContainer();
					Object parentBO = getBusinessObjectForPictogramElement(containerShape);
					return !isInherited(cp, parentBO, containerShape);
				}
				return false;
			}
		}
		
		protected static class DeleteFeature extends DefaultDeleteFeature {

			public DeleteFeature(IFeatureProvider fp) {
				super(fp);
			}
			
			@Override
			public boolean canDelete(IDeleteContext context) {
				Object bo = getBusinessObjectForPictogramElement(context.getPictogramElement());
				if (bo instanceof ChoicePoint) {
					ChoicePoint cp = (ChoicePoint) bo;
					
					ContainerShape containerShape = (ContainerShape) context.getPictogramElement().eContainer();
					Object parentBO = getBusinessObjectForPictogramElement(containerShape);
					return !isInherited(cp, parentBO, containerShape);
				}
				return false;
			}
		}
		
		protected IFeatureProvider fp;
		
		protected FeatureProvider(IDiagramTypeProvider dtp, IFeatureProvider fp) {
			super(dtp);
			this.fp = fp;
		}
		
		@Override
		public ICreateFeature[] getCreateFeatures() {
			return new ICreateFeature[] {
					new CreateFeature(fp, "Choice Point", "Create Choice Point")
				};
		}
		
		@Override
		public IAddFeature getAddFeature(IAddContext context) {
			return new AddFeature(fp);
		}
	
		@Override
		public IMoveShapeFeature getMoveShapeFeature(IMoveShapeContext context) {
			return new MoveShapeFeature(fp);
		}
		
		@Override
		public IResizeShapeFeature getResizeShapeFeature(IResizeShapeContext context) {
			return new NoResizeFeature(fp);
		}
		
		@Override
		public IUpdateFeature getUpdateFeature(IUpdateContext context) {
			return new UpdateFeature(fp);
		}

		@Override
		public IRemoveFeature getRemoveFeature(IRemoveContext context) {
			return new RemoveFeature(fp);
		}

		@Override
		public IDeleteFeature getDeleteFeature(IDeleteContext context) {
			return new DeleteFeature(fp);
		}
		
		protected static void createFigure(ChoicePoint cp, 
				ContainerShape containerShape,
				GraphicsAlgorithm invisibleRectangle, Color darkColor, Color brightColor) {

			IGaService gaService = Graphiti.getGaService();
			
			Ellipse circle = gaService.createEllipse(invisibleRectangle);
			circle.setForeground(darkColor);
			circle.setBackground(brightColor);
			circle.setLineWidth(LINE_WIDTH);
			int s2 = ITEM_SIZE/2;
			gaService.setLocationAndSize(circle, s2, s2, ITEM_SIZE, ITEM_SIZE);

			if (containerShape.getAnchors().isEmpty()) {
				// here we place our anchor
				IPeCreateService peCreateService = Graphiti.getPeCreateService();
				// TODOHRR:  EllipseAnchor would be nice
				ChopboxAnchor anchor = peCreateService.createChopboxAnchor(containerShape);
				anchor.setReferencedGraphicsAlgorithm(circle);
			}
			else {
				// we just set the referenced GA
				//containerShape.getAnchors().get(0).setReferencedGraphicsAlgorithm(rect);
			}
		}

		private static void updateFigure(ChoicePoint cp, PictogramElement pe, Color dark, Color bright) {
			ContainerShape container = (ContainerShape)pe;
			
			// we clear the figure and rebuild it
			GraphicsAlgorithm invisibleRect = pe.getGraphicsAlgorithm();
			invisibleRect.getGraphicsAlgorithmChildren().clear();
			
			createFigure(cp, container, invisibleRect, dark, bright);
		}
		
		protected static boolean isInherited(ChoicePoint cp, Object container, ContainerShape cs) {
			if (container instanceof StateGraph) {
				StateGraph sg = (StateGraph) container;
				return cp.eContainer()!=sg;
			}
			else if (container instanceof State) {
				// have to check whether the State is inherited
				State s = (State) container;
				ContainerShape sCont = cs.getContainer();
				EObject cls = sCont.getLink().getBusinessObjects().get(0);
				return s.eContainer()!=cls;
			}

			return false;
		}
		
	}

	private class BehaviorProvider extends DefaultToolBehaviorProvider {

		public BehaviorProvider(IDiagramTypeProvider dtp) {
			super(dtp);
		}
		
		@Override
		public GraphicsAlgorithm[] getClickArea(PictogramElement pe) {
            GraphicsAlgorithm invisible = pe.getGraphicsAlgorithm();
            GraphicsAlgorithm rectangle =
                            invisible.getGraphicsAlgorithmChildren().get(0);
            return new GraphicsAlgorithm[] { rectangle };
		}
		
		@Override
		public GraphicsAlgorithm getSelectionBorder(PictogramElement pe) {
            GraphicsAlgorithm invisible = pe.getGraphicsAlgorithm();

            GraphicsAlgorithm rectangle =
                invisible.getGraphicsAlgorithmChildren().get(0);
            return rectangle;
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
				// our transition point has four fixed point anchor - we choose the first one
				anchor = ((ContainerShape)pe).getAnchors().get(0);
			}
			ccc.setSourceAnchor(anchor);
			
			ContextButtonEntry button = new ContextButtonEntry(null, context);
			button.setText("Create Transition");
			button.setIconId(ImageProvider.IMG_TRANSITION);
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
	
	public ChoicePointSupport(IDiagramTypeProvider dtp, IFeatureProvider fp) {
		pfp = new FeatureProvider(dtp,fp);
		tbp = new BehaviorProvider(dtp);
	}
	
	public IFeatureProvider getFeatureProvider() {
		return pfp;
	}
	
	public IToolBehaviorProvider getToolBehaviorProvider() {
		return tbp;
	}
}
