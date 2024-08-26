package com.ukg.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class Test1 {

    @RequestMapping("/hi")
    public String hi(){
        return  "hello";
    }
}
