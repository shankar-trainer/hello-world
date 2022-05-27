package com.cts.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ProductException {

	@ExceptionHandler(value = ProductEmptyException.class)
	public String ProductExceptionhandler(ProductEmptyException  ex) {
              return  "error";		
	}

	@ExceptionHandler(value = Exception.class)
	public String ProductExceptionhandler(Exception  ex) {
		return  "error";		
	}
	
}
