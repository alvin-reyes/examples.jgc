package com.jgc.areyes1.junit.obj;

import java.util.List;

public class Account {
	
	private String accountCode;
	private String accountName;
	private List<AccountTransaction> accountTransactions;
	public String getAccountCode() {
		return accountCode;
	}
	public void setAccountCode(String accountCode) {
		this.accountCode = accountCode;
	}
	public String getAccountName() {
		return accountName;
	}
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}
	public List<AccountTransaction> getAccountTransactions() {
		return accountTransactions;
	}
	public void setAccountTransactions(List<AccountTransaction> accountTransactions) {
		this.accountTransactions = accountTransactions;
	}
	
	
}
