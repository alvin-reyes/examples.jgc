package com.jgc.areyes1.junit;

import java.util.ArrayList;
import java.util.List;

import com.areyes1.jgc.dummydata.DummyDataGenerator;
import com.jgc.areyes1.junit.obj.Account;
import com.jgc.areyes1.junit.obj.AccountTransaction;

public class AccountService {
	
	public Account getAccountDetails() throws IllegalAccessException,InstantiationException{
		return DummyDataGenerator.getDummyDataGenerator(Account.class.newInstance());
	}
	
	public List<Account> getListOfAccounts() throws IllegalAccessException,InstantiationException {
		List<Account> listOfAccounts = new ArrayList<Account>();
		listOfAccounts.add(DummyDataGenerator.getDummyDataGenerator(Account.class.newInstance()));
		listOfAccounts.add(DummyDataGenerator.getDummyDataGenerator(Account.class.newInstance()));
		listOfAccounts.add(DummyDataGenerator.getDummyDataGenerator(Account.class.newInstance()));
		return listOfAccounts;
		
	}
	
	public List<AccountTransaction> getAccountTransactions(Account account) throws IllegalAccessException,InstantiationException{
		return DummyDataGenerator.getDummyDataGenerator(Account.class).newInstance().getAccountTransactions();
	}

}
