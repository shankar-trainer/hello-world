package com.senai.engSecurity.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:4200", methods = {RequestMethod.GET, RequestMethod.POST}) // Aplica CORS para todos os métodos desse controlador
public class WelcomeController {

    @GetMapping
    public String welcome() {
        return "Hello World";
    }

    @GetMapping("/user")
    public String user() {
        return "Authorize USER";
    }

    @GetMapping("/adm")
    public String adm() {
        return "Authorize ADM";
    }

}
