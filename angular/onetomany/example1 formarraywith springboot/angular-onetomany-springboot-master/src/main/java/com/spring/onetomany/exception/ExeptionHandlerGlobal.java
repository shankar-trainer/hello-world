package com.spring.onetomany.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.spring.onetomany.ProductNotFoundException;

@ControllerAdvice
public class ExeptionHandlerGlobal {
	
	@ExceptionHandler(value = ProductNotFoundException.class)
	public ResponseEntity<String> productNotFoundException(ProductNotFoundException exception){
		return new ResponseEntity<String>("HIiiiii 404",HttpStatus.NOT_FOUND);
	}
}
