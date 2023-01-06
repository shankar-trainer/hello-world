package com.cg.springwithangular.exceptions;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvice
public class DemoException {
	@ResponseBody
	@ResponseStatus(value=HttpStatus.NOT_FOUND)
	@ExceptionHandler(value = {Exception.class})
    protected ErrorInfo handleConflict(Exception ex, HttpServletRequest req) {
        String bodyOfResponse = ex.getMessage();// "Country with this id not present";
        String uri = req.getRequestURL().toString();
        return  new ErrorInfo(uri,bodyOfResponse);
    }
}
