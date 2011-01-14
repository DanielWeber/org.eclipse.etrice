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

package org.eclipse.etrice.ui.behavior.commands;

import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.etrice.core.room.ActorClass;
import org.eclipse.etrice.core.room.RoomFactory;
import org.eclipse.etrice.ui.behavior.support.StateGraphSupport;
import org.eclipse.graphiti.dt.IDiagramTypeProvider;
import org.eclipse.graphiti.features.IAddFeature;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.impl.AddContext;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.Diagram;
import org.eclipse.graphiti.ui.services.GraphitiUi;


public class PopulateDiagramCommand extends RecordingCommand {

	private ActorClass ac;
	private Diagram diagram;

	public PopulateDiagramCommand(Diagram diag, ActorClass ac, TransactionalEditingDomain domain) {
		super(domain);
		this.diagram = diag;
		this.ac = ac;
	}

	@Override
	protected void doExecute() {
		IDiagramTypeProvider dtp = GraphitiUi.getExtensionManager().createDiagramTypeProvider(diagram, "org.eclipse.etrice.ui.behavior.diagramTypeProvider"); //$NON-NLS-1$
		IFeatureProvider featureProvider = dtp.getFeatureProvider();
		
		if (ac.getStateMachine()==null)
			ac.setStateMachine(RoomFactory.eINSTANCE.createStateGraph());
		
		AddContext addContext = new AddContext();
		addContext.setNewObject(ac.getStateMachine());
		addContext.setTargetContainer(diagram);
		addContext.setX(StateGraphSupport.MARGIN);
		addContext.setY(StateGraphSupport.MARGIN);
		
		IAddFeature addFeature = featureProvider.getAddFeature(addContext);
		if (addFeature!=null && addFeature.canAdd(addContext)) {
			ContainerShape acShape = (ContainerShape) addFeature.add(addContext);
		}
	}
}
