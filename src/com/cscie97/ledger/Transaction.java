package com.cscie97.ledger;

public class Transaction {
	private int transactionId;
	private int amount;
	private int fee;
	private String payload;
	private Account receiver;
	private Account payer;
	
	public Transaction(int transactionId, int amount, int fee, String payload, Account receiver, Account payer) {
		this.transactionId = transactionId;
		this.amount = amount;
		this.fee = fee;
		this.payload = payload;
		this.receiver = receiver;
		this.payer = payer;
	}

	public int getTransactionId() {
		return transactionId;
	}

	
	
}
