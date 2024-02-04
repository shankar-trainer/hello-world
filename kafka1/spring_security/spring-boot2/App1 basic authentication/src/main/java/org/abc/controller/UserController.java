package org.abc.controller;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMappping;
import org.springframework.web.bind.annotation.RestController;


@RestController
//@RequestMappping("/user")
public class UserController{
 
    @GetMapping("/hello")
    public String hello() {
        return "Hello  World!";
    }
}