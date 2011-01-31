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

package org.eclipse.etrice.ui.structure.commands;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.etrice.core.room.ActorClass;
import org.eclipse.etrice.core.room.ActorRef;
import org.eclipse.etrice.core.room.Binding;
import org.eclipse.etrice.core.room.Port;
import org.eclipse.etrice.ui.structure.DiagramAccess;
import org.eclipse.etrice.ui.structure.support.ActorContainerRefSupport;
import org.eclipse.etrice.ui.structure.support.BindingSupport;
import org.eclipse.graphiti.mm.algorithms.GraphicsAlgorithm;
import org.eclipse.graphiti.mm.algorithms.Rectangle;
import org.eclipse.graphiti.mm.algorithms.Text;
import org.eclipse.graphiti.mm.algorithms.styles.Color;
import org.eclipse.graphiti.mm.pictograms.Connection;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.Diagram;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.mm.pictograms.Shape;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipse.graphiti.util.IColorConstant;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestActorClassWithInheritance extends TestBase {

	private ActorClass ac = null;

	@Before
	public void setUp() {
		loadModelFile();

		assertEquals("models read", 1, getModels().size());
		assertEquals("actor classes in our model", 3, getModels().get(0).getActorClasses().size());

		for (ActorClass a : getModels().get(0).getActorClasses()) {
			if (a.getName().equals("MyActorClass")) {
				ac = a;
				break;
			}
		}
		assertNotNull("ActorClass expected", ac);
	}
	
	@After
	public void tearDown() {
		removeDiagramsDirectory();
	}
	
	@Override
	protected String getModelFileName() {
		return "ActorClassWithInheritance.room";
	}
	
	private boolean isEqual(Color c, IColorConstant cc) {
		if (c.getRed()!=cc.getRed())
			return false;
		if (c.getGreen()!=cc.getGreen())
			return false;
		if (c.getBlue()!=cc.getBlue())
			return false;
		return true;
	}
	
	@Test
	public void checkReferences() {
		Diagram diagram = DiagramAccess.getDiagram(ac);
		ContainerShape shape = (ContainerShape) diagram.getChildren().get(0);
		EObject bo = Graphiti.getLinkService().getBusinessObjectForLinkedPictogramElement(shape);
		assertTrue("bo is ActorClass", bo instanceof ActorClass);
		
		// re-assign this because the old Java object is another instance since it comes from another resource
		ac = (ActorClass) bo;
		
		assertEquals("actor class child shapes", 8, shape.getChildren().size());

		int nRefs = 0;
		for (Shape childShape : shape.getChildren()) {
			EObject[] bos = Graphiti.getLinkService()
					.getAllBusinessObjectsForLinkedPictogramElement(childShape);
			assertEquals("business objects", 1, bos.length);
			if (!(bos[0] instanceof Port)) {
				assertTrue("bo is actor ref", bos[0] instanceof ActorRef);
				nRefs++;
				
				ActorRef ar = (ActorRef) bos[0];
				boolean inherited = (ar.eContainer()!=ac);
					
				assertNotNull("ga is there (invisible rectangle)", childShape.getGraphicsAlgorithm());
				assertTrue("ga is invisible rectangle", childShape.getGraphicsAlgorithm() instanceof Rectangle);
				assertFalse("ga is invisible", childShape.getGraphicsAlgorithm().getFilled());
				assertFalse("ga is invisible", childShape.getGraphicsAlgorithm().getLineVisible());
				assertEquals("border rect", 1, childShape.getGraphicsAlgorithm().getGraphicsAlgorithmChildren().size());
				GraphicsAlgorithm borderRect = childShape.getGraphicsAlgorithm().getGraphicsAlgorithmChildren().get(0);
				if (inherited)
					assertTrue("border rect background", isEqual(borderRect.getForeground(), ActorContainerRefSupport.INHERITED_COLOR));
				else
					assertTrue("border rect background", isEqual(borderRect.getForeground(), ActorContainerRefSupport.LINE_COLOR));
				
				// ports of actor refs
				assertEquals("grand child shapes", 3, ((ContainerShape)childShape).getChildren().size());
				for (Shape grandChildShape : ((ContainerShape)childShape).getChildren()) {
					// skip the actor ref label
					if (grandChildShape.getGraphicsAlgorithm() instanceof Text)
						continue;
					
					bos = Graphiti.getLinkService()
						.getAllBusinessObjectsForLinkedPictogramElement(grandChildShape);
					assertEquals("business objects", 1, bos.length);
					assertTrue("bo is port", bos[0] instanceof Port);
				}
			}
		}
		assertEquals("number of actor references", 3, nRefs);
	}

	@Test
	public void checkBindings() {
		Diagram diagram = DiagramAccess.getDiagram(ac);
		ContainerShape shape = (ContainerShape) diagram.getChildren().get(0);
		EObject bo = Graphiti.getLinkService().getBusinessObjectForLinkedPictogramElement(shape);
		assertTrue("bo is ActorClass", bo instanceof ActorClass);
		
		// re-assign this because the old Java object is another instance since it comes from another resource
		ac = (ActorClass) bo;

		assertEquals("bindings", 4, diagram.getConnections().size());
		
		for (Connection conn : diagram.getConnections()) {
			EObject[] bos = Graphiti.getLinkService().getAllBusinessObjectsForLinkedPictogramElement(conn);
			assertEquals("business objects", 1, bos.length);
			assertTrue("binding", bos[0] instanceof Binding);
			
			Binding b = (Binding) bos[0];
			boolean inherited = (b.eContainer()!=ac);
			
			if (inherited)
				assertTrue("border rect background", isEqual(conn.getGraphicsAlgorithm().getForeground(), BindingSupport.INHERITED_COLOR));
			else
				assertTrue("border rect background", isEqual(conn.getGraphicsAlgorithm().getForeground(), BindingSupport.LINE_COLOR));
			
			// the first port is part of the only MyActor instance
			List<PictogramElement> pes = Graphiti.getLinkService().getPictogramElements(diagram, b.getEndpoint1().getPort());
			assertEquals("instances of first port", 1, pes.size());
			
			// the second port is part of SubActor which has three instances
			pes = Graphiti.getLinkService().getPictogramElements(diagram, b.getEndpoint2().getPort());
			assertEquals("instances of second port", 3, pes.size());
			assertNull("first ref", b.getEndpoint1().getActorRef());

			// the second ref is represented once in the diagram
			assertNotNull("second ref", b.getEndpoint2().getActorRef());
			pes = Graphiti.getLinkService().getPictogramElements(diagram, ((ActorRef)b.getEndpoint2().getActorRef()));
			assertEquals("instances of second ref", 1, pes.size());
		}
	}

}
