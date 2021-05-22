package com.cts.error;

import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.http.HttpStatus;;

//@ResponseStatus(HttpStatus.NOT_FOUND)
@ResponseStatus(value = HttpStatus.NOT_FOUND, reason = "Reason  Id not found")
public class RecordNotFoundException extends Exception {

	public RecordNotFoundException(String s) {
		super(s);
	}
}
