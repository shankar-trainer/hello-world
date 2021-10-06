package com.capgemini.exception;

public class EntityAlreadyExists extends RuntimeException {
	public EntityAlreadyExists(String msg) {
		super(msg);
	}

}
