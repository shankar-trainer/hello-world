package com.example.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class PersonController {

    @GetMapping("/welcome")
    public String welcome(){
        return "Welcome to the Spring Boot Application";
    }

    //http://localhost:8080/greeting?name=mohan kumar
@GetMapping("/greeting")
    public String greeting(@RequestParam String name){
        return "Greeting  to "+name;
    }


}
