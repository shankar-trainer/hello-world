package com.cts.error;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class StudentGlobalExceptionHandler {
	@ExceptionHandler
//	public ResponseEntity<StudentErrorResponse> handleException(StudentNotFoundException e) {
	public ResponseEntity<StudentErrorResponse> handleException(StudentNotFoundException e) {
		StudentErrorResponse error = new StudentErrorResponse(HttpStatus.NOT_FOUND.value(), e.getMessage(), System.currentTimeMillis());
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(error);
	}

	@ExceptionHandler
	public ResponseEntity<StudentErrorResponse> handleException(StudentWithIdAlreadyExistsException e) {
		StudentErrorResponse error = new StudentErrorResponse(HttpStatus.CONFLICT.value(), e.getMessage(), System.currentTimeMillis());
		return ResponseEntity.status(HttpStatus.CONFLICT).body(error);
	}
}