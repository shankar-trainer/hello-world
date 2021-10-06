package com.capgemini.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.service.LoginService;

@RestController
public class LoginController {
	
	@Autowired
	LoginService loginservice;
	@RequestMapping("/login/{email}/{pass}")
	public String login(@PathVariable(value = "email") String email, @PathVariable(value = "pass") String password){
		return loginservice.login(email, password);
	}
}
