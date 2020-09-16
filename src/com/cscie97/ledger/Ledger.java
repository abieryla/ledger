package com.cscie97.ledger;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Ledger {
	private String name;
	private String description;
	private String seed;
	
	private Map <Integer,Block> blockMap;
	private Block genesisBlock;	

	
	public Ledger(String name, String description, String seed) {
		this.name = name;
		this.description = description;
		this.seed = seed;
		
		blockMap = new HashMap<Integer,Block>(); 				//Instantiate blockMap	
		genesisBlock = new Block(null, null, 1);           		//Instantiate genesisBlock


	}

	
	public Account createAccount(String address ) {
		//create a new account with given address and set balance to zero
		Account account = new Account(address);
		account.setBalance(0);
		
		//get the most recent Block and set account balance in the AccountBalanceMap
		getBlock(blockMap.size()-1).getAccountBalanceMap().put(address, account);
		return account;
	}
	
	//
	public String processTransaction(Transaction transaction) {
		//subtract amount from payer and add to receiver
		//fee is subtracted from the payer account
		return someString;
	}
	
	//get the account balance from address
	public int getAccountBalance(String address) {
		return getBlock(blockMap.size()-1).getAccountBalanceMap().get(address).getBalance();
	}
	
	
	public Map <String, Account> getAccountBalances() {
		return getBlock(blockMap.size()-1).getAccountBalanceMap();
	}
		
	public Block getBlock(int blockNumber) {
		return blockMap.get(blockNumber);
	}
	
	public Transaction getTransaction(int transactionId) {
			return transactionList.get(transactionId);
	}
	
	public void validate() {
		//validate something
	}
	
	/*	public String calculateHash() {
	String calculatedhash = StringUtil.applySha256( 
			previousHash +
			Long.toString(timeStamp)
			);
	return calculatedhash;
}

public class StringUtil {
	//Applies Sha256 to a string and returns the result. 
	public static String applySha256(String input){		
		try {
			MessageDigest digest = MessageDigest.getInstance("SHA-256");	        
			//Applies sha256 to our input, 
			byte[] hash = digest.digest(input.getBytes("UTF-8"));	        
			StringBuffer hexString = new StringBuffer(); // This will contain hash as hexidecimal
			for (int i = 0; i < hash.length; i++) {
				String hex = Integer.toHexString(0xff & hash[i]);
				if(hex.length() == 1) hexString.append('0');
				hexString.append(hex);
			}
			return hexString.toString();
		}
		catch(Exception e) {
			throw new RuntimeException(e);
		}
	}	
}
*/	

}
