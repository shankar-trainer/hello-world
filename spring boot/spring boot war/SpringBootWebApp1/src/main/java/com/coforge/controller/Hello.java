package com.coforge.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class Hello {
    @RequestMapping("/hello")
 public String hello(){
     return  "hello world";
 }
}
