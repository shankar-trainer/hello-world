package com.se.alaf.security.controller;

import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@RestController
public class DemoController {

	@GetMapping("/greet")
	public String printHello() {
		return "Hello from demo";
	} 
	
	@GetMapping("/admin")
	public String admin() {
		return "Hello Admin, You are logged in!";
	}
	
	@GetMapping("/staff")
	public String hejFromStaff() {
		return "Hello Staff, you are logged in";
	}
	
	@PostMapping("/logout")
	public String performLogout(Authentication authentication, HttpServletRequest request, HttpServletResponse response) {
	    
		System.out.println("Authorities: " +authentication.getAuthorities().toString() + " name: " +authentication.getName());
		// .. perform logout
	   // this.logoutHandler.doLogout(request, response, authentication);
	    return "redirect:/";
	}
}
