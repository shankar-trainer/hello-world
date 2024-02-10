package com.example.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class UserController2 {

	@GetMapping("/hello")
	public String hello() {
		return "hello to spring security";
		
	}
}
