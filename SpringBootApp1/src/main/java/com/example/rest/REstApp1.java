package com.example.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class REstApp1 {

	@RequestMapping("/hello")
	public String hello() {
		return "hello world";
	}
}
