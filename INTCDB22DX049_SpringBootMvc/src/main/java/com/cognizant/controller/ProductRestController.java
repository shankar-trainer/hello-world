package com.cognizant.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

@RequestMapping("/product")
public class ProductRestController {

	public String welcome() {
		return "weclome to rest"; 
	}
	
	@RequestMapping("/hello")
	public String greeting() {
		return "greeting  to rest"; 
	}
}