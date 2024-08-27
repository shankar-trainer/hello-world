package com.ukg.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @RequestMapping("/")
    public String hello(){
        return "<h2>Hello World";
    }
    @RequestMapping("/welcome")
    public String display(){
        return "<h2>This is from welcome url</h2>";
    }
}
