package com.jgc.areyes1.junit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.jgc.areyes1.junit.obj.Account;

import static org.junit.Assert.*;

public class JUnitTestCaseWAnnotation {
	
	private AccountService accountService = new AccountService();
	private Account dummyAccount;
	
	
	@Before // setup()
	public void before() throws Exception {
		System.out.println("Setting it up!");
		dummyAccount = accountService.getAccountDetails();
	}
	
	@Test
	public void testDummyAccount() {
		System.out.println("Running: testDummyAccount");
		assertNotNull(dummyAccount.getAccountCode());
	}
	@Test
	public void testDummyAccountTransactions() {
		System.out.println("Running: testDummyAccountTransactions");
		assertEquals(dummyAccount.getAccountTransactions().size(),3);
	}
	
	@After // tearDown()
	public void after() throws Exception {
		System.out.println("Running: tearDown");
		dummyAccount = null;
		assertNull(dummyAccount);
	}

}
