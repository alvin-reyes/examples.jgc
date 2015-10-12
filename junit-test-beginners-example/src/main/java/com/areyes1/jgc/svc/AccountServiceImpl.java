
package com.areyes1.jgc.svc;

import java.util.ArrayList;
import java.util.List;

import com.areyes1.jgc.intf.AccountService;
import com.areyes1.jgc.obj.Account;
import com.areyes1.jgc.obj.Transaction;

public class AccountServiceImpl implements AccountService {
	public Account createNewAccount(Account account) {
		//	Dummy Dao! Database insert here.
		//	accountDao.insert(account);
		//	Ultimately return the account with the modification.
		return account;
		
	}

	public Account updateAccount(Account account) {
		//	Dummy Dao! Database insert here.
		//	accountDao.update(account);
		//	Ultimately return the account with the modification.
		account.setName("Alvin Reyes: New Name");
		return account;
	}

	public boolean removeAccount(Account account) {
		//	Dummy Dao! Database insert here.
		//	accountDao.delete(account);
		//	Ultimately return the account with the modification.
		//	if exception occurs, return false.
		return true;	
	}

	public List<Transaction> listAllTransactions(Account account) {
		// accountDao.loadAllTransactions(account);
		List<Transaction> listOfAllTransactions = new ArrayList<Transaction>();
		listOfAllTransactions.add(new Transaction());
		listOfAllTransactions.add(new Transaction());
		listOfAllTransactions.add(new Transaction());
		account.setTransactions(listOfAllTransactions);
		
		return listOfAllTransactions;
	}
}