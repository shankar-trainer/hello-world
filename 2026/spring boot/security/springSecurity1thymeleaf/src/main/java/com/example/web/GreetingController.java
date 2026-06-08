package com.example.web;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GreetingController {

    @GetMapping("/")
    public String greeting() {
        return "greeting";
    }

}

//INSERT INTO CUSTOM_USER (username, password)
//VALUES ('user','$2a$12$4leyAR.ClA1VZo.k7800NObq8ZRd5L13/5CeotFoHCZ1UH1BqClsa');