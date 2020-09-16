package com.cscie97.ledger;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.regex.Matcher;
import java.util.regex.Pattern;



public class CommandProcessor {
	public void processCommand(String command) throws IllegalArgumentException{
		String[] parts = command.split(" ");
		String[] quotedParts = null;
		
		Pattern p = Pattern.compile("\"([^\"]*)\"");
		Matcher m = p.matcher(command);
		int count = 2;
		while (m.find()) {
			quotedParts[count]=m.group(count-1);
			count++;
		}

		
		//check first word in array to determine which method is being called
		switch(parts[0]) {
			case "create-ledger":
				try {
					Ledger ledger = new Ledger(parts[1], quotedParts[2], quotedParts[3]);
				} catch (IllegalArgumentException iae) {
					System.out.println("Illegal Argument");
				}
				break;
			case "create-account":
				try {
					//create account which is a method in Ledger
					Ledger.createAccount(parts[1]); 
					
				} catch (IllegalArgumentException iae) {
					System.out.println("Illegal Argument");
				}
				break;
			case "create-account-balance":
				//create-account-balance
				break;
			case "get-account-balance":
				try {
					Account account = new Account(parts[1]);
				} catch (IllegalArgumentException iae) {
					System.out.println("Illegal Argument");
				}
				break;
			case "get-account-balances":
				//get-account-balances
				break;
			case "process-transaction":
				break;
			case "get-transaction":
				break;
			case "get-block":
				break;
			case "validate":
				break;
			default:
				System.out.println("Invalid Command!");
				break;
		}
		
		
		
		
	}
	public void processCommandFile(String file) throws IOException {
		FileReader fr = new FileReader(file);
		BufferedReader bufr = new BufferedReader(fr);

		String line;
		do {
			line = bufr.readLine();
			processCommand(line);
		}
		while((line != null));

		bufr.close();
	}

}
