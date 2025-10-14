package com.cts.error;

public class StudentWithIdAlreadyExistsException extends RuntimeException {
	public StudentWithIdAlreadyExistsException(String s) {
		super(s);
	}
}