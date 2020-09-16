package com.cscie97.ledger;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Block {
	private String hash;
	private String previousHash;
	private int blockNumber;
	private Block previousBlock;
	
	private Map <String, Account> accountBalanceMap;
	private List <String> transactionList;

	public Block(String hash, String previousHash, int blockNumber) {
		super();
		this.hash = hash;
		this.previousHash = previousHash;
		this.blockNumber = blockNumber;
		
		accountBalanceMap = new HashMap<>();
		transactionList = new ArrayList<>();
	}
	public String getHash() {
		return hash;
	}
	public void setHash(String hash) {
		this.hash = hash;
	}
	public String getPreviousHash() {
		return previousHash;
	}
	public void setPreviousHash(String previousHash) {
		this.previousHash = previousHash;
	}
	public int getBlockNumber() {
		return blockNumber;
	}
	public void setBlockNumber(int blockNumber) {
		this.blockNumber = blockNumber;
	}
	public Block getPreviousBlock() {
		return previousBlock;
	}
	public void setPreviousBlock(Block previousBlock) {
		this.previousBlock = previousBlock;
	}

	public Map<String, Account> getAccountBalanceMap() {
		return accountBalanceMap;
	}
	public void setAccountBalanceMap(Map<String, Account> accountBalanceMap) {
		this.accountBalanceMap = accountBalanceMap;
	}
/*	public List<Transaction> getTransactionList() {
		return transactionList;
	}
	public void setTransactionList(List<Transaction> transactionList) {
		this.transactionList = transactionList;
	}
*/
	

}
