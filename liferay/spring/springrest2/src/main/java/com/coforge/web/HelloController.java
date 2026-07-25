package com.coforge.web;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/api/hello")
    public String  sayHello(@RequestParam(value = "name", defaultValue = "World") String name) {
        return new String("Hello, " + name + "!");
    }
}
//http://localhost:8080/SpringRest1/api/hello
//http://localhost:8080/SpringRest1/api/hello?name=ram%20kumar