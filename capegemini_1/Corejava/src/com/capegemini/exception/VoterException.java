package com.capegemini.exception;

public class VoterException  extends Exception{
	
	public VoterException(String msg) {
	super("Error In Voter Class\n \t"+msg);
	}
}
