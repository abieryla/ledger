package com.cscie97.ledger;

public class Account {
	private String address;
	private int balance;
	

	
	public Account(String address) {
		this.address = address;
	}
	
	//standard getters and setters
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	



}
