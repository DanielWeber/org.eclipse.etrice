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

package org.eclipse.etrice.generator;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashMap;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.etrice.generator.etricegen.ETriceGenPackage;
import org.eclipse.etrice.generator.etricegen.InterfaceItemInstance;
import org.eclipse.etrice.generator.etricegen.Root;
import org.eclipse.etrice.generator.etricegen.SAPInstance;
import org.eclipse.etrice.generator.etricegen.ServiceImplInstance;
import org.junit.Before;
import org.junit.Test;


public class TestLayers extends TestInstanceModelBuilderBase {
	
	private Root root;
	private HashMap<EClass, ArrayList<EObject>> instances;
	
	@Before
	public void setUp() {
		prepare();
		
		root = buildInstanceModel("layers.room");
		instances = collectInstances(root);
	}
	
	@Test
	public void testInstanceNumbers() {
		ArrayList<EObject> saps = instances.get(ETriceGenPackage.eINSTANCE.getSAPInstance());
		assertEquals("Number of SAPInstances", 6, saps.size());

		ArrayList<EObject> spps = instances.get(ETriceGenPackage.eINSTANCE.getSPPInstance());
		assertEquals("Number of SPPInstances", 7, spps.size());

		ArrayList<EObject> svcs = instances.get(ETriceGenPackage.eINSTANCE.getServiceImplInstance());
		assertEquals("Number of ServiceImplInstances", 3, svcs.size());
	}
	
	@Test
	public void testLayerConnections() {
		ArrayList<EObject> saps = instances.get(ETriceGenPackage.eINSTANCE.getSAPInstance());
		
		for (EObject obj : saps) {
			assertEquals("SAP has one peer", 1, ((SAPInstance)obj).getPeers().size());
		}
		
		SAPInstance sap = (SAPInstance) getInstance(saps, "/CMain/app/subsysA/userX/sap");
		assertNotNull("sap expected", sap);
		InterfaceItemInstance peer = ((SAPInstance)sap).getPeers().get(0);
		assertTrue("peer is a service", (peer instanceof ServiceImplInstance));
		ServiceImplInstance svc = (ServiceImplInstance) peer;
		assertEquals("number of serviceA peers", 3, svc.getPeers().size());
		assertEquals("sap and service have same protocol", sap.getSap().getProtocol(), svc.getSvcImpl().getSpp().getProtocol());
	}

}
