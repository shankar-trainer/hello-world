package com.cognizant.controller;

import javax.security.auth.login.AccountException;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
//2nd way using @ControllerAdvice with multiple exception
//1st way using @ExceptionHandler in @Controller Page
 
@ControllerAdvice
public class ExceptionAdvice {

	@ExceptionHandler(value =AccountException.class )
	public String error(AccountException e) {
		return "error";
	}	
	
	@ExceptionHandler(Exception.class)
	public String error1() {
		return "error1";
	}
}
