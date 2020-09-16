package com.cscie97.ledger.test;

import com.cscie97.ledger.*;
import java.io.IOException;

import com.cscie97.ledger.CommandProccessorException;
import com.cscie97.ledger.CommandProcessor;

public class TestDriver {
	public static void main(String[] args) {
		CommandProcessor cp = new CommandProcessor();
		try {
			cp.processCommandFile("/Users/abieryla/Documents/school/CSCI_97/ledger.script.txt");
		} catch (IOException ioe) {
			System.out.println("File not found!");
		}
/*		catch (CommandProccessorException cpe) {
			System.out.println("Exception " + cpe.getMessage()
					+ " at line numer " + cpe.getLineNumber()
					+ ": " + cpe.getCommand());
	}
*/	
	}
}
