package com.example.demo.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class UserController {

    @GetMapping("/user/hello")
    public String userHello() {
        return "Hello USER 👋 — You are authenticated!";
    }

    @GetMapping("/admin/hello")
    public String adminHello() {
        return "Hello ADMIN 🔐 — You have admin privileges!";
    }
}
