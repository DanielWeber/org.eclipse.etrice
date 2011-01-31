package org.eclipse.etrice.ui.structure.commands;

import static org.junit.Assert.assertEquals;
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
import org.eclipse.graphiti.mm.pictograms.Connection;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.Diagram;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.mm.pictograms.Shape;
import org.eclipse.graphiti.services.Graphiti;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ActorClassWithBindings extends TestBase {

	private ActorClass ac = null;

	@Before
	public void setUp() {
		loadModelFile();

		assertEquals("models read", 1, getModels().size());
		assertEquals("actor classes in our model", 2, getModels().get(0).getActorClasses().size());

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
		return "ActorClassWithBindings.room";
	}
	
	@Test
	public void checkReferences() {
		Diagram diagram = DiagramAccess.getDiagram(ac);
		ContainerShape shape = (ContainerShape) diagram.getChildren().get(0);
		assertEquals("actor class child shapes", 5, shape.getChildren().size());

		int nRefs = 0;
		for (Shape childShape : shape.getChildren()) {
			EObject[] bos = Graphiti.getLinkService()
					.getAllBusinessObjectsForLinkedPictogramElement(childShape);
			assertEquals("business objects", 1, bos.length);
			if (!(bos[0] instanceof Port)) {
				assertTrue("bo is actor ref", bos[0] instanceof ActorRef);
				nRefs++;
			}
		}
		assertEquals("number of actor references", 2, nRefs);
	}

	@Test
	public void checkBindings() {
		Diagram diagram = DiagramAccess.getDiagram(ac);
		assertEquals("bindings", 2, diagram.getConnections().size());
		
		for (Connection conn : diagram.getConnections()) {
			EObject[] bos = Graphiti.getLinkService().getAllBusinessObjectsForLinkedPictogramElement(conn);
			assertEquals("business objects", 1, bos.length);
			assertTrue("binding", bos[0] instanceof Binding);
			
			Binding b = (Binding) bos[0];
			
			// the first port is part of the only MyActor instance
			List<PictogramElement> pes = Graphiti.getLinkService().getPictogramElements(diagram, b.getEndpoint1().getPort());
			assertEquals("instances of first port", 1, pes.size());
			
			// the second port is part of SubActor which has two instances
			pes = Graphiti.getLinkService().getPictogramElements(diagram, b.getEndpoint2().getPort());
			assertEquals("instances of second port", 2, pes.size());
			assertNull("first ref", b.getEndpoint1().getActorRef());

			// the second ref is represented once in the diagram
			assertNotNull("second ref", b.getEndpoint2().getActorRef());
			pes = Graphiti.getLinkService().getPictogramElements(diagram, ((ActorRef)b.getEndpoint2().getActorRef()));
			assertEquals("instances of second ref", 1, pes.size());
		}
	}
}
