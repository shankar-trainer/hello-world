package com.example.controller;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.example.exception.EmployeeException;

@ControllerAdvice
public class EmployeeExceptionController {


	@ExceptionHandler(value = Exception.class)
	public String exception1() {
		return "error";
	}
	@ExceptionHandler(value = EmployeeException.class)
	public String exception2() {
		return "error1";
	}

}
