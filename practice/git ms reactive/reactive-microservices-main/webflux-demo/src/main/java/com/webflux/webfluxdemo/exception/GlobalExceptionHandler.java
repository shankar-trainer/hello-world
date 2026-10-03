package com.webflux.webfluxdemo.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.webflux.webfluxdemo.dto.InputFailedValidation;

@ControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(InputValidationException.class)
	public ResponseEntity<InputFailedValidation> handleException(InputValidationException e) {
		InputFailedValidation inputFailedValidation = new InputFailedValidation(
				e.getErrorCode(), e.getMessage());

		return new ResponseEntity<>(inputFailedValidation, HttpStatus.BAD_REQUEST);
	}

	@ExceptionHandler(Exception.class)
	public ResponseEntity<InputFailedValidation> handleException(Exception e) {
		InputFailedValidation inputFailedValidation = new InputFailedValidation(
				HttpStatus.INTERNAL_SERVER_ERROR.value(), e.getMessage());

		return new ResponseEntity<>(inputFailedValidation, HttpStatus.INTERNAL_SERVER_ERROR);
	}

}
