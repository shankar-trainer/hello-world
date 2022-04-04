package com.capgemini.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/hello")
public class MyController1 {
	
	@RequestMapping
	public String hello() {
		return "test1";
	}
}
