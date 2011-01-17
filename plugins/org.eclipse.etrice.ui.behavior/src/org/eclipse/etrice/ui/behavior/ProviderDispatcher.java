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

package org.eclipse.etrice.ui.behavior;

import java.util.Arrays;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.etrice.core.naming.RoomFragmentProvider;
import org.eclipse.etrice.core.room.ChoicePoint;
import org.eclipse.etrice.core.room.State;
import org.eclipse.etrice.core.room.StateGraph;
import org.eclipse.etrice.core.room.TrPoint;
import org.eclipse.etrice.core.room.Transition;
import org.eclipse.etrice.core.room.util.RoomSwitch;
import org.eclipse.etrice.ui.behavior.support.ChoicePointSupport;
import org.eclipse.etrice.ui.behavior.support.InitialPointSupport;
import org.eclipse.etrice.ui.behavior.support.StateGraphSupport;
import org.eclipse.etrice.ui.behavior.support.StateSupport;
import org.eclipse.etrice.ui.behavior.support.TrPointSupport;
import org.eclipse.etrice.ui.behavior.support.TransitionSupport;
import org.eclipse.graphiti.dt.IDiagramTypeProvider;
import org.eclipse.graphiti.features.IAddFeature;
import org.eclipse.graphiti.features.ICreateConnectionFeature;
import org.eclipse.graphiti.features.ICreateFeature;
import org.eclipse.graphiti.features.IDeleteFeature;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.ILayoutFeature;
import org.eclipse.graphiti.features.IMoveShapeFeature;
import org.eclipse.graphiti.features.IRemoveFeature;
import org.eclipse.graphiti.features.IResizeShapeFeature;
import org.eclipse.graphiti.features.IUpdateFeature;
import org.eclipse.graphiti.features.context.IAddContext;
import org.eclipse.graphiti.features.context.ICustomContext;
import org.eclipse.graphiti.features.context.IDeleteContext;
import org.eclipse.graphiti.features.context.IDoubleClickContext;
import org.eclipse.graphiti.features.context.ILayoutContext;
import org.eclipse.graphiti.features.context.IMoveShapeContext;
import org.eclipse.graphiti.features.context.IPictogramElementContext;
import org.eclipse.graphiti.features.context.IRemoveContext;
import org.eclipse.graphiti.features.context.IResizeShapeContext;
import org.eclipse.graphiti.features.context.IUpdateContext;
import org.eclipse.graphiti.features.custom.ICustomFeature;
import org.eclipse.graphiti.mm.algorithms.GraphicsAlgorithm;
import org.eclipse.graphiti.mm.algorithms.styles.LineStyle;
import org.eclipse.graphiti.mm.pictograms.ConnectionDecorator;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.mm.pictograms.Shape;
import org.eclipse.graphiti.tb.DefaultToolBehaviorProvider;
import org.eclipse.graphiti.tb.IContextButtonPadData;
import org.eclipse.graphiti.tb.ISelectionInfo;
import org.eclipse.graphiti.tb.IToolBehaviorProvider;
import org.eclipse.graphiti.tb.SelectionInfoImpl;
import org.eclipse.graphiti.ui.features.DefaultFeatureProvider;
import org.eclipse.graphiti.util.IColorConstant;

public class ProviderDispatcher {

	private class FeatureProviderSwitch extends RoomSwitch<IFeatureProvider> {
		private ContainerShape parent = null;

		@Override
		public IFeatureProvider doSwitch(EObject theEObject) {
        	
			if (theEObject==null)
				return null;
			
			if (theEObject.eIsProxy()) {
        		if (RoomFragmentProvider.isState(theEObject))
        			return stateGraphSupport.getFeatureProvider();
        		if (RoomFragmentProvider.isTrPoint(theEObject))
        			return trPointSupport.getFeatureProvider();
        		if (RoomFragmentProvider.isChoicePoint(theEObject))
        			return choicePointSupport.getFeatureProvider();
        		if (RoomFragmentProvider.isStateGraph(theEObject))
        			return stateGraphSupport.getFeatureProvider();
        		if (RoomFragmentProvider.isTransition(theEObject))
        			return transitionSupport.getFeatureProvider();
        	}
			return super.doSwitch(theEObject);
		}
		
		@Override
		public IFeatureProvider caseStateGraph(StateGraph object) {
			if (parent!=null && parent.getLink()!=null) {
				if (parent.getLink().getBusinessObjects().size()>0) {
					EObject bo = parent.getLink().getBusinessObjects().get(0);
					if (bo instanceof StateGraph)
						return initialPointSupport.getFeatureProvider();
				}
				parent = null;
			}
			return stateGraphSupport.getFeatureProvider();
		}
		
		@Override
		public IFeatureProvider caseTrPoint(TrPoint object) {
			return trPointSupport.getFeatureProvider();
		}
		@Override
		public IFeatureProvider caseChoicePoint(ChoicePoint object) {
			return choicePointSupport.getFeatureProvider();
		}
		@Override
		public IFeatureProvider caseState(State object) {
			return stateSupport.getFeatureProvider();
		}
		
		@Override
		public IFeatureProvider caseTransition(Transition object) {
			return transitionSupport.getFeatureProvider();
		}
		
		@Override
		public IFeatureProvider defaultCase(EObject object) {
			return null;
		}
	
		public ICreateFeature[] getCreateFeatures() {
			return concatAll(
					stateSupport.getFeatureProvider().getCreateFeatures(),
					initialPointSupport.getFeatureProvider().getCreateFeatures(),
					trPointSupport.getFeatureProvider().getCreateFeatures(),
					choicePointSupport.getFeatureProvider().getCreateFeatures()
				);
		}

		public ICreateConnectionFeature[] getCreateConnectionFeatures() {
			return transitionSupport.getFeatureProvider().getCreateConnectionFeatures();
		}

		public ICustomFeature[] getCustomFeatures(ICustomContext context) {
			return concatAll(
					trPointSupport.getFeatureProvider().getCustomFeatures(context),
					stateSupport.getFeatureProvider().getCustomFeatures(context),
					transitionSupport.getFeatureProvider().getCustomFeatures(context)
				);
		}

		public void setParentContainer(ContainerShape parent) {
			this.parent  = parent;
		}
	}

	private class ToolBehaviorProviderSwitch extends RoomSwitch<IToolBehaviorProvider> {
		private ContainerShape parent = null;

		@Override
		public IToolBehaviorProvider doSwitch(EObject theEObject) {
        	
			if (theEObject==null)
				return null;
      	
			if (theEObject.eIsProxy()) {
        		if (RoomFragmentProvider.isState(theEObject))
        			return stateGraphSupport.getToolBehaviorProvider();
        		if (RoomFragmentProvider.isTrPoint(theEObject))
        			return trPointSupport.getToolBehaviorProvider();
        		if (RoomFragmentProvider.isChoicePoint(theEObject))
        			return choicePointSupport.getToolBehaviorProvider();
        		if (RoomFragmentProvider.isStateGraph(theEObject))
        			return stateGraphSupport.getToolBehaviorProvider();
        		if (RoomFragmentProvider.isTransition(theEObject))
        			return transitionSupport.getToolBehaviorProvider();
        	}
			
			return super.doSwitch(theEObject);
		}
		
		@Override
		public IToolBehaviorProvider caseStateGraph(StateGraph object) {
			if (parent!=null && parent.getLink()!=null) {
				if (parent.getLink().getBusinessObjects().size()>0) {
					EObject bo = parent.getLink().getBusinessObjects().get(0);
					if (bo instanceof StateGraph)
						return initialPointSupport.getToolBehaviorProvider();
				}
				parent = null;
			}
			return stateGraphSupport.getToolBehaviorProvider();
		}
		@Override
		public IToolBehaviorProvider caseTrPoint(TrPoint object) {
			return trPointSupport.getToolBehaviorProvider();
		}
		@Override
		public IToolBehaviorProvider caseChoicePoint(ChoicePoint object) {
			return choicePointSupport.getToolBehaviorProvider();
		}
		@Override
		public IToolBehaviorProvider caseState(State object) {
			return stateSupport.getToolBehaviorProvider();
		}
		
		@Override
		public IToolBehaviorProvider caseTransition(Transition object) {
			return transitionSupport.getToolBehaviorProvider();
		}

		@Override
		public IToolBehaviorProvider defaultCase(EObject object) {
			return null;
		}

		public void setParentContainer(ContainerShape parent) {
			this.parent  = parent;
		}
		
	}

	private class DispatchingFeatureProvider extends DefaultFeatureProvider {

		public DispatchingFeatureProvider(IDiagramTypeProvider dtp) {
			super(dtp);
		}
		
		@Override
	    public ICreateFeature[] getCreateFeatures() {
	        return getAllCreateFeatures();
	    }
		
		@Override
		public ICreateConnectionFeature[] getCreateConnectionFeatures() {
	        return getAllCreateConnectionFeatures();
		}
		
		@Override
		public IAddFeature getAddFeature(IAddContext context) {
			featureSwitch.setParentContainer(context.getTargetContainer());
			IFeatureProvider fp = featureSwitch.doSwitch(((EObject) context.getNewObject()));
			if (fp==null)
				return super.getAddFeature(context);
			else
				return fp.getAddFeature(context);
		}

		@Override
	    public ILayoutFeature getLayoutFeature(ILayoutContext context) {
			IFeatureProvider fp = getFeatureProvider(context);
			if (fp!=null)
				return fp.getLayoutFeature(context);
			else
				return super.getLayoutFeature(context);
	    }
		
		@Override
		public IMoveShapeFeature getMoveShapeFeature(IMoveShapeContext context) {
			IFeatureProvider fp = getFeatureProvider(context);
			if (fp!=null)
				return fp.getMoveShapeFeature(context);
			else
				return super.getMoveShapeFeature(context);
		}
		
		@Override
		public IResizeShapeFeature getResizeShapeFeature(IResizeShapeContext context) {
			IFeatureProvider fp = getFeatureProvider(context);
			if (fp!=null)
				return fp.getResizeShapeFeature(context);
			else
				return super.getResizeShapeFeature(context);
		}
		
		@Override
		public IUpdateFeature getUpdateFeature(IUpdateContext context) {
			IFeatureProvider fp = getFeatureProvider(context);
			if (fp!=null)
				return fp.getUpdateFeature(context);
			else
				return super.getUpdateFeature(context);
		}
		
		@Override
		public IDeleteFeature getDeleteFeature(IDeleteContext context) {
			IFeatureProvider fp = getFeatureProvider(context);
			if (fp!=null)
				return fp.getDeleteFeature(context);
			else
				return super.getDeleteFeature(context);
		}
		
		@Override
		public IRemoveFeature getRemoveFeature(IRemoveContext context) {
			IFeatureProvider fp = getFeatureProvider(context);
			if (fp!=null)
				return fp.getRemoveFeature(context);
			else
				return super.getRemoveFeature(context);
		}
		
		@Override
		public ICustomFeature[] getCustomFeatures(ICustomContext context) {
			return getAllCustomFeatures(context);
		}
		
		private EObject getBusinessObject(IPictogramElementContext context) {
			PictogramElement pictogramElement = context.getPictogramElement();
			EObject bo = (EObject) getBusinessObjectForPictogramElement(pictogramElement);
			return bo;
		}
		
		private IFeatureProvider getFeatureProvider(IPictogramElementContext context) {
			EObject eco = context.getPictogramElement().eContainer();
			if (eco instanceof ContainerShape) {
				featureSwitch.setParentContainer((ContainerShape) eco);
				IFeatureProvider fp = featureSwitch.doSwitch(getBusinessObject(context));
				if (fp!=null)
					return fp;
			}
			return null;
		}
	}
	
	private class DispatchingToolBehaviorProvider extends DefaultToolBehaviorProvider {

		public DispatchingToolBehaviorProvider(IDiagramTypeProvider diagramTypeProvider) {
			super(diagramTypeProvider);
		}

		@Override
	    public GraphicsAlgorithm[] getClickArea(PictogramElement pe) {
	        IToolBehaviorProvider bp = getToolBehaviorProvider(pe);
	        if (bp==null)
	        	return super.getClickArea(pe);
	        else
	        	return bp.getClickArea(pe);
	    }

		@Override
	    public GraphicsAlgorithm getSelectionBorder(PictogramElement pe) {
	        IToolBehaviorProvider bp = getToolBehaviorProvider(pe);
	        if (bp==null)
	        	return super.getSelectionBorder(pe);
	        else
	        	return bp.getSelectionBorder(pe);
	    }
		
		@Override
		public ICustomFeature getDoubleClickFeature(IDoubleClickContext context) {
	        IToolBehaviorProvider bp = getToolBehaviorProvider(context.getPictogramElements()[0]);
	        if (bp==null)
	        	return super.getDoubleClickFeature(context);
	        else
	        	return bp.getDoubleClickFeature(context);
		}
		
		protected IToolBehaviorProvider getToolBehaviorProvider(PictogramElement pe) {
			IFeatureProvider fp = getFeatureProvider();
			if (pe instanceof ConnectionDecorator)
				pe = (PictogramElement) pe.eContainer();
			EObject bo = (EObject) fp.getBusinessObjectForPictogramElement(pe);
			if (bo==null)
				return null;

			EObject eco = pe.eContainer();
			if (eco instanceof ContainerShape) {
				behaviorSwitch.setParentContainer((ContainerShape) eco);
				IToolBehaviorProvider bp = behaviorSwitch.doSwitch(bo);
				if (bp!=null)
					return bp;
			}
			
			IToolBehaviorProvider bp = behaviorSwitch.doSwitch(bo);
			return bp;
		}
		
		@Override
		public IContextButtonPadData getContextButtonPad(IPictogramElementContext context) {
	        IToolBehaviorProvider bp = getToolBehaviorProvider(context.getPictogramElement());
	        if (bp==null)
	        	return super.getContextButtonPad(context);
	        else
	        	return bp.getContextButtonPad(context);
		}

		public ISelectionInfo getSelectionInfoForShape(Shape shape) {
			ISelectionInfo si = new SelectionInfoImpl(IColorConstant.SHAPE_SELECTION_FG, IColorConstant.HANDLE_FG, IColorConstant.HANDLE_BG,
					LineStyle.DASH);
//			si.setPrimarySelectionBackgroundColor(IColorConstant.LIGHT_GRAY);
//			si.setSecondarySelectionBackgroundColor(IColorConstant.LIGHT_GRAY);
			return si;
		}
	}
	
	private StateGraphSupport stateGraphSupport;
	private TrPointSupport trPointSupport;
	private InitialPointSupport initialPointSupport;
	private ChoicePointSupport choicePointSupport;
	private StateSupport stateSupport;
	private TransitionSupport transitionSupport;
	
	private FeatureProviderSwitch featureSwitch;
	private ToolBehaviorProviderSwitch behaviorSwitch;
	
	private DispatchingFeatureProvider dispatchingFP;
	private DispatchingToolBehaviorProvider dispatchingBP;
	
	
	public ProviderDispatcher(IDiagramTypeProvider dtp) {
		// create those first before using them
		dispatchingFP = new DispatchingFeatureProvider(dtp);
		dispatchingBP = new DispatchingToolBehaviorProvider(dtp);

		stateGraphSupport = new StateGraphSupport(dtp, dispatchingFP);
		trPointSupport = new TrPointSupport(dtp, dispatchingFP);
		initialPointSupport = new InitialPointSupport(dtp, dispatchingFP);
		choicePointSupport = new ChoicePointSupport(dtp, dispatchingFP);
		stateSupport = new StateSupport(dtp, dispatchingFP);
		transitionSupport = new TransitionSupport(dtp, dispatchingFP);
		
		featureSwitch = new FeatureProviderSwitch();
		behaviorSwitch = new ToolBehaviorProviderSwitch();
	}

	public IFeatureProvider getFeatureProvider() {
		return dispatchingFP;
	}
	
	public IToolBehaviorProvider getToolBehaviorProvider() {
		return dispatchingBP;
	}

	private ICreateFeature[] getAllCreateFeatures() {
		return featureSwitch.getCreateFeatures();
	}

	private ICreateConnectionFeature[] getAllCreateConnectionFeatures() {
		return featureSwitch.getCreateConnectionFeatures();
	}
	
	private ICustomFeature[] getAllCustomFeatures(ICustomContext context) {
		return featureSwitch.getCustomFeatures(context);
	}
	
	private static <T> T[] concatAll(T[] first, T[]... rest) {
		int totalLength = first.length;
		for (T[] array : rest) {
			totalLength += array.length;
		}
		T[] result = Arrays.copyOf(first, totalLength);
		int offset = first.length;
		for (T[] array : rest) {
			System.arraycopy(array, 0, result, offset, array.length);
			offset += array.length;
		}
		return result;
	}
}
