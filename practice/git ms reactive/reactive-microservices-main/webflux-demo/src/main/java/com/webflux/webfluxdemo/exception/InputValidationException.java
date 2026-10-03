package com.webflux.webfluxdemo.exception;

public class InputValidationException extends RuntimeException {

	private final String message;
	private final Integer errorCode;

	public InputValidationException(Integer errorCode, String message) {
		this.errorCode = errorCode;
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public Integer getErrorCode() {
		return errorCode;
	}

}
