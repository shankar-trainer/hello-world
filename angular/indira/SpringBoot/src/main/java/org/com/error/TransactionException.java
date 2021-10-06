package org.com.error;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
public class TransactionException extends RuntimeException {

	public TransactionException(String s) {
		super(s);
	}
}
