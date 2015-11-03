package com.areyes.junit.svc;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import static org.hamcrest.CoreMatchers.isA;

public class MessageServiceTest {

	private String CONST_MSG = "Message is me";
	private MessageService msgService = new MessageService(CONST_MSG);
	
	@Test
	public void testPrintMessage() {
		//	Check type return
		assertThat(msgService.printMessage(), isA(String.class));
		assertEquals(CONST_MSG, msgService.printMessage());
		
	}
	
	@Test
	public void testSalutationMessage() {
		String messageSal = msgService.salutationMessage();
		assertThat(messageSal, isA(String.class));
		assertEquals("Hi!" + CONST_MSG,messageSal);
	}
	
	@Ignore
	@Test
	public void testIgnoreMessage() {
		assertThat(msgService.salutationMessage(), isA(String.class));
		assertEquals(CONST_MSG, msgService.salutationMessage());
	}
}
