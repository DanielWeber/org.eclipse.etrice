package org.eclipse.etrice.ui.structure.commands;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.etrice.core.room.ActorClass;
import org.eclipse.etrice.ui.structure.DiagramAccess;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.Diagram;
import org.eclipse.graphiti.mm.pictograms.Shape;
import org.eclipse.graphiti.services.Graphiti;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestActorClass extends TestBase {

	@Before
	public void setUp() {
		loadModelFile();
	}
	
	@After
	public void tearDown() {
		removeDiagramsDirectory();
	}
	
	@Override
	protected String getModelFileName() {
		return "ActorClass.room";
	}
	
	@Test
	public void checkModel() {
		assertEquals("models read", 1, getModels().size());
		assertEquals("actor classes in our model", 1, getModels().get(0).getActorClasses().size());
	}
	
	@Test
	public void testActorClass() {
		 ActorClass ac = getModels().get(0).getActorClasses().get(0);
		 Diagram diagram = DiagramAccess.getDiagram(ac);
		 
		 assertEquals("diagram children", 1, diagram.getChildren().size());
		 
		 Shape shape = diagram.getChildren().get(0);
		 assertTrue("top level shape is container shape", shape instanceof ContainerShape);
		 
		 EObject bo = Graphiti.getLinkService().getBusinessObjectForLinkedPictogramElement(shape);
		 assertTrue("top level business object is ActorClass", bo instanceof ActorClass);
	}
}
