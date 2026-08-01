package com.coforge;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UseController {
    @RequestMapping("/hello")
    public String hello(){
        return  "hello world";
    }

}
