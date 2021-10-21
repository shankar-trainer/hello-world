package com.flight.exceptions;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

import com.flight.service.UserService;

@ControllerAdvice
public class GlobalExceptionHandler {
	Logger logger = LoggerFactory.getLogger(UserService.class);
	
	@ExceptionHandler(RecordIsEmptyException.class)
	public ResponseEntity<?>RecordIsEmptyException(RecordIsEmptyException e , WebRequest request){
		ErrorDetails errorDetails = new ErrorDetails(new Date(), e.getMessage(), request.getDescription(false));
		logger.trace("RecordIsEmptyException thrown");
		return new ResponseEntity<>(errorDetails, HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(RecordNotFoundException.class)
	public ResponseEntity<?>RecordNotFoundException(RecordNotFoundException e , WebRequest request){
		ErrorDetails errorDetails = new ErrorDetails(new Date(), e.getMessage(), request.getDescription(false));
		logger.trace("RecordNotFoundException thrown");
		return new ResponseEntity<>(errorDetails, HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(RecordAlreadyPresentException.class)
	public ResponseEntity<?>RecordAlreadyPresentException(RecordAlreadyPresentException e , WebRequest request){
		ErrorDetails errorDetails = new ErrorDetails(new Date(), e.getMessage(), request.getDescription(false));
		logger.trace("RecordAlreadyPresentException thrown");
		return new ResponseEntity<>(errorDetails, HttpStatus.CONFLICT);
	}
	

}
