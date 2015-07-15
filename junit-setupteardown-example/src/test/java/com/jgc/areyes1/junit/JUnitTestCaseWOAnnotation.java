package com.jgc.areyes1.junit;

import com.jgc.areyes1.junit.obj.Account;

import junit.framework.TestCase;

public class JUnitTestCaseWOAnnotation extends TestCase {
	
	private AccountService accountService = new AccountService();
	private Account dummyAccount;
	
	
	@Override
	protected void setUp() throws Exception {
		System.out.println("Setting it up!");
		dummyAccount = accountService.getAccountDetails();
	}
	
	public void testDummyAccount() {
		System.out.println("Running: testDummyAccount");
		assertNotNull(dummyAccount.getAccountCode());
	}
	public void testDummyAccountTransactions() {
		System.out.println("Running: testDummyAccountTransactions");
		assertEquals(dummyAccount.getAccountTransactions().size(),3);
	}
	
	@Override
	protected void tearDown() throws Exception {
		System.out.println("Running: tearDown");
		dummyAccount = null;
		assertNull(dummyAccount);
	}

}
