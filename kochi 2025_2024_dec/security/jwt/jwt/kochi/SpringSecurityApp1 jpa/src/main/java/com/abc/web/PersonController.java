package com.abc.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class PersonController {
    @GetMapping("/welcome")
 public String hello(){
     return  "hello world";
 }
}
