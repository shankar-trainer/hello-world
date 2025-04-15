package com.cts.error;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ProductErrorHandler {

	@ExceptionHandler(value =ProductUpdateException.class )
	protected ErrorInfo myException(Exception e,HttpServletRequest request) {
		
		String msg=e.getMessage();
		String uri=request.getRequestURI();
		return new ErrorInfo(uri,msg);
	}
	
}
