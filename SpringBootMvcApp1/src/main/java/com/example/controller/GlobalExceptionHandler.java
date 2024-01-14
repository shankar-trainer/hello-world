package com.example.controller;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.example.exception.CustomerException;

@ControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(value = CustomerException.class)
	public String myexception() {
		return "CustomerError";
	}
	
	@ExceptionHandler(value = Exception.class)
	public String myexception1() {
		return "CustomerError";
	}
}
