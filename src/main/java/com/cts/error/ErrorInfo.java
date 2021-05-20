package com.cts.error;

public class ErrorInfo {
	private String uri, message;

	public ErrorInfo(String uri, String message) {
		super();
		this.uri = uri;
		this.message = message;
	}

	public String getUri() {
		return uri;
	}

	public String getMessage() {
		return message;
	}

	
}
