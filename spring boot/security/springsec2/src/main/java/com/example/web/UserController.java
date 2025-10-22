package com.example.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping("/")
    public String  index(){
        return  "index";
    }

    @GetMapping("/hello")
    public String  hello(){
        return  "hello";
    }

    @GetMapping("/test")
    public String  test(){
        return  "test";
    }

    @GetMapping("/welcome")
    public String  welcome(){
        return  "welcome";
    }
}
