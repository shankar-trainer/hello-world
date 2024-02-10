package com.example.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RequestMapping("/user")
@RequestMapping("/auth")

public class UserController {

	@GetMapping("/welcome")
	public String hello() {
		return "welcome to spring security";
		
	}
}
