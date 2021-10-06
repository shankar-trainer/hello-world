package com.cg.web;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.cg.dto.ErrorMessage;
import com.cg.exceptions.QuestionAddException;

@RestControllerAdvice
public class QuestionAdvice {
	
	
	
	@ExceptionHandler(QuestionAddException.class)
	@ResponseStatus(code=HttpStatus.BAD_REQUEST)
	public ErrorMessage handleQuestionException(QuestionAddException ex) {
		
		return new ErrorMessage(HttpStatus.BAD_REQUEST.toString(),ex.getMessage(),LocalDateTime.now().toString());
	

}
}
