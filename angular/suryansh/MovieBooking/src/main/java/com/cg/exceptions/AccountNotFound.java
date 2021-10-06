package com.cg.exceptions;

@SuppressWarnings("serial")
public class AccountNotFound extends RuntimeException {
	

	public AccountNotFound(String message) {
		super(message);
	}
}