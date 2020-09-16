package com.cscie97.ledger;

public class CommandProccessorException extends Exception{
	public static final String  INVALID_COMMAND = "Invalid command";
	public static final String INVALID_NUM_PARAMS = "Invalid number of parameters";
	
	String command;
	String reason;
	int lineNumber;
	
	public CommandProccessorException(String command, String reason, int lineNumber) {
		super();
		this.command = command;
		this.reason = reason;
		this.lineNumber = lineNumber;
	}

	public String getCommand() {
		return command;
	}

	public String getReason() {
		return reason;
	}

	public int getLineNumber() {
		return lineNumber;
	}

/* USING ENUM --- figure out Params!!
 * 
	public enum Command {

	    CREATE_LEDGER("create-ledger", 1),
	    CREATE_ACCOUNT("create-account", 1),
	    GET_ACCOUNT_BALANCE("get-account-balance", 1),
	    GET_ACCOUNT_BALANCES("get-account-balances", 0),
	    PROCESS_TRANSACTION("process-transaction ", 6);

	    private String cmd;
	    private int params;

	    Command(String cmd, int params) {
	        this.cmd = cmd;
	        this.params = params;
	    }

	    public String getCmd() {
	        return cmd;
	    }

	    public int getParams() {
	        return params;
	    }

	    public static Command fromCmd(String cmd) {
	        for (Command command : Command.values()) {
	            if (command.cmd.equals(cmd)) {
	                return command;
	            }
	        }
	        throw new IllegalArgumentException();
	    }
	    
	  
*/
	
	
}
