package com.example.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class TestController {

    @GetMapping("/hello")
    public String hello(){
        return  "hello world";
    }

    @GetMapping("/greeting")
    public String greeting(){
        return  "greeting";
    }
}
