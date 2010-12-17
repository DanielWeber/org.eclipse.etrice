/*******************************************************************************
 * Copyright (c) 2010 protos software gmbh (http://www.protos.de).
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/

package org.eclipse.etrice.runtime.java.modelbase;

import org.eclipse.etrice.runtime.java.messaging.Address;
import org.eclipse.etrice.runtime.java.modelbase.EventWithDataMessage;

import junit.framework.TestCase;

public class EventWithDataMessageTest extends TestCase {

	public void testSetGetNext() {
		EventWithDataMessage msg1 = new EventWithDataMessage(new Address(0, 0, 0), 123, "abc");
		EventWithDataMessage msg2 = new EventWithDataMessage(new Address(0, 0, 0), 456, "def");
		msg1.setNext(msg2);
		msg2.setNext(msg1);
		assertEquals(msg1.getNext(), msg2);
		assertEquals(msg2.getNext(), msg1);
		
		assertEquals(123, msg1.getEvtId());
		assertEquals(456, msg2.getEvtId());
		assertEquals("abc", msg1.getData()[0]);
		assertEquals("def", msg2.getData()[0]);
	}
	
	public void testToString() {
		EventWithDataMessage msg = new EventWithDataMessage(new Address(1,2,3), 789, "eTrice");
		assertEquals("EventWithDataMessage(Address(nodeID=1,threadID=2,objectID=3), evt=789, data=eTrice)", msg.toString());
	}
}
