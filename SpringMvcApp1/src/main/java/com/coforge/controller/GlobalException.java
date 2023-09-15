package com.coforge.controller;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.coforge.exception.UserException;

@ControllerAdvice
public class GlobalException {

	@ExceptionHandler(value = UserException.class)
	public String userError() {
		return "error1";
	}

	@ExceptionHandler(value = Exception.class)
	public String userError1() {
		return "error2";
	}
}
