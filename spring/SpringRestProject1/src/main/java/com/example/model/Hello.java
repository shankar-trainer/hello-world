package com.example.model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by shankar on 4/14/2023.
 */
@RestController
@RequestMapping("/hello")
public class Hello {

    @RequestMapping("/hi")
    public String hello(){
        return "hello world";
    }

}
