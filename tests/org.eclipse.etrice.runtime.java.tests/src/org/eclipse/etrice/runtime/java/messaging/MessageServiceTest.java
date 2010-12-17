/*******************************************************************************
 * Copyright (c) 2010 protos software gmbh (http://www.protos.de).
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/

package org.eclipse.etrice.runtime.java.messaging;

import org.eclipse.etrice.runtime.java.messaging.Address;
import org.eclipse.etrice.runtime.java.messaging.Message;
import org.eclipse.etrice.runtime.java.messaging.MessageService;

import junit.framework.TestCase;

public class MessageServiceTest extends TestCase {


	public void testRun() {
		
		// testing basic functionality of MessageService and Dispatcher
		Address addr = new Address(0,0,0);
		MessageService msg_service = new MessageService(null, addr, "MessageService1");

		DummyMessageReceiver receiver1 = new DummyMessageReceiver(new Address(0,0,1)); 
		DummyMessageReceiver receiver2 = new DummyMessageReceiver(new Address(0,1,1)); 
		DummyMessageReceiver receiver3 = new DummyMessageReceiver(new Address(1,1,1));
		DummyMessageReceiver receiver4 = new DummyMessageReceiver(new Address(0,0,2)); 
		DummyMessageReceiver receiver5 = new DummyMessageReceiver(new Address(0,1,2)); 
		DummyMessageReceiver receiver6 = new DummyMessageReceiver(new Address(1,1,2));
		
		
		msg_service.getMessageDispatcher().addMessageReceiver(receiver1);
		msg_service.getMessageDispatcher().addMessageReceiver(receiver2);
		msg_service.getMessageDispatcher().addMessageReceiver(receiver3);
		msg_service.getMessageDispatcher().addMessageReceiver(receiver4);
		msg_service.getMessageDispatcher().addMessageReceiver(receiver5);
		msg_service.getMessageDispatcher().addMessageReceiver(receiver6);
		
		Message msg1 = new Message(new Address(0,0,1));
		Message msg2 = new Message(new Address(0,1,1));
		Message msg3 = new Message(new Address(1,1,1));
		Message msg4 = new Message(new Address(0,0,2));
		Message msg5 = new Message(new Address(0,1,2));
		Message msg6 = new Message(new Address(1,1,2));

		msg_service.start();

		msg_service.receive(msg1);
		msg_service.receive(msg2);
		msg_service.receive(msg3);
		msg_service.receive(msg4);
		msg_service.receive(msg5);
		msg_service.receive(msg6);
		

		try {
			// give the other thread in MessageService a bit time to compute the queue
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		assertEquals(msg1, receiver1.getLastReceivedMessage());
		assertEquals(msg2, receiver2.getLastReceivedMessage());
		assertEquals(msg3, receiver3.getLastReceivedMessage());
		assertEquals(msg4, receiver4.getLastReceivedMessage());
		assertEquals(msg5, receiver5.getLastReceivedMessage());
		assertEquals(msg6, receiver6.getLastReceivedMessage());
		
		
	}
	
	public void testMassiveMessaging(){
		// testing massive use of messaging between two threads
		// current thread sends, MessageService has its own thread to dispatch the received messages
		// implicit test of race conditions -> test breaks if you take out the synchronized keywords from the MessageService
		
		Address addr = new Address(0,0,0);
		MessageService msg_service = new MessageService(null, addr, "MessageService1");

		int max=3000;
		int max_iter=10;
		
		// create and register message receivers
		DummyMessageReceiver receiver[]=new DummyMessageReceiver[max];
		for (int i=0; i<max; i++){
			receiver[i] = new DummyMessageReceiver(new Address(0,0,1+i));
			msg_service.getMessageDispatcher().addMessageReceiver(receiver[i]);
		}
		

		// Create all Messages
		Message msg[][]=new Message[max][max_iter];
		for (int j=0; j<max_iter; j++){
			for (int i=0; i<max; i++){
				msg[i][j] = new Message(new Address(0,0,i+1));
			}
		}

		// Start Message Service before sending the Messages to test the synchronization
		// This test fails without the synchronized keywords in the MessageService 
		msg_service.start();
		
		// send all messages
		for (int j=0; j<max_iter; j++){
			for (int i=0; i<max; i++){
				msg_service.receive(msg[i][j]);
			}
		}

		
		try {
			// give the other thread in MessageService a bit time to compute the queue
			// TODO: maybe not a good choice to make a sleep in a test, a better strategy for multi threaded unit tests is needed
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		for (int i=0; i<max; i++){
			assertEquals(msg[i][max_iter-1], receiver[i].getLastReceivedMessage());
		}
		
	}

	public void testMessageService() {
		Address addr = new Address(0,0,0);
		MessageService msg_service = new MessageService(null, addr, "MessageService1");
		assertEquals(addr, msg_service.getAddress());
		assertEquals(msg_service.getMessageDispatcher().getAddress().objectID, msg_service.getAddress().objectID+1);
	}

	public void testInstanceId() {
		Address addr = new Address(0,0,0);

		// setInstanceId via Constructor
		MessageService msg_service = new MessageService(null, addr, "MessageService1");
		assertEquals("/MessageService1", msg_service.getInstancePath());
		assertEquals("/MessageService1/Queue", msg_service.getMessageQueue().getInstancePath());
		assertEquals("/MessageService1/Dispatcher", msg_service.getMessageDispatcher().getInstancePath());
	}

	
}
