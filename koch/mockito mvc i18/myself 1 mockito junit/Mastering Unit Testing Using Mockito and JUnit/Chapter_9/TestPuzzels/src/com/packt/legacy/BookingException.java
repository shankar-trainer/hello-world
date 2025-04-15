package com.packt.legacy;

public class BookingException extends Exception {
	private static final long serialVersionUID = 1L;
	private final ErrorType type;

	public BookingException(ErrorType type) {
		super();
		this.type = type;
	}

	public ErrorType getType() {
		return type;
	}

}
