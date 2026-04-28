package com.cts.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HelloController {

	@GetMapping("/hello")
	public String hello() {
		return "hello world";
	}
	
	@GetMapping("/welcome")
	public String welcome() {
		return "welcome to the world";
	}
	
}
