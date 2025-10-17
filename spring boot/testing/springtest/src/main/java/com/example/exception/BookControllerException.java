package com.example.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

//@RestControllerAdvice
@ControllerAdvice
public class BookControllerException {

    @ExceptionHandler(BookException.class)
    public ResponseEntity<ErrorInfo> bookException(BookException e){
        ErrorInfo errorInfo = new ErrorInfo(
                HttpStatus.NOT_FOUND.value(),e.getMessage()
        );
        return new ResponseEntity<ErrorInfo>(errorInfo, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<ErrorInfo> globalException(Exception e){
        ErrorInfo errorInfo = new ErrorInfo(
                HttpStatus.NOT_FOUND.value(),e.getMessage()
        );
        return new ResponseEntity<>(errorInfo, HttpStatus.NOT_FOUND);
    }

}
