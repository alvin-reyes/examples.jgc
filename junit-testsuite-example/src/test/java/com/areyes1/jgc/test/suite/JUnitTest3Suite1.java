package com.areyes1.jgc.test.suite;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.jgc.areyes1.junit.AccountService;
import com.jgc.areyes1.junit.obj.Account;

public class JUnitTest3Suite1 {
	
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
