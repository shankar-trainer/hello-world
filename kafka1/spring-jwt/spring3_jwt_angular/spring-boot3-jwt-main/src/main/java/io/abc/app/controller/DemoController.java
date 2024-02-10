package io.abc.app.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;

@RestController
@RequestMapping("/api/v1/demo")
@CrossOrigin(origins="http://localhost:4200",maxAge = 3600)
public class DemoController {

    @GetMapping
    public ResponseEntity<String> hello(){
        return ResponseEntity.ok("Hello from secured endpoint");
    }
}
