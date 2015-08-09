package com.jgc.areyes1.junit.obj;

public class AccountTransaction {
	
	private String transactionType;
	private Float amount;
	
	public String getTransactionType() {
		return transactionType;
	}

	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}

	public Float getAmount() {
		return amount;
	}

	public void setAmount(Float amount) {
		this.amount = amount;
	}

	public AccountTransaction(String transactionType, Float amount) {
		this.setAmount(amount);
		this.setTransactionType(transactionType);
	}

}
