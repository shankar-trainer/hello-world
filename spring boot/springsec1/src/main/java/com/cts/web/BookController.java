package com.cts.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RequestMapping("/")
public class BookController {

    @GetMapping("/home")
    public String home() {
        return "home";
    }

    @GetMapping("/office")
    public String office() {
        return "office";
    }



}
