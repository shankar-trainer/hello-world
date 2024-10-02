package com.coforge.controller;

import com.coforge.exception.*;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

@ControllerAdvice
public class GlobalException {

    @ExceptionHandler(UserException.class)
    public  String myerror(){
        return  "error1";
    }

    @ExceptionHandler(NumberFormatException.class)
    public  String myerror2(){
        return  "error2";
    }
}
