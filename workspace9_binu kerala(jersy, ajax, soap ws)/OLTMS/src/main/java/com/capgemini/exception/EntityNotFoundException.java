package com.capgemini.exception;

public class EntityNotFoundException extends RuntimeException{
	public EntityNotFoundException(String msg) {
		super(msg);
	}

}
