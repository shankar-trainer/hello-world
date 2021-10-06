package org.com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/emp")
public class EmployeeController {

	@RequestMapping("/login")
	//@RequestMapping(value="/login",method=RequestMethod.GET )
	public String empLogin(){
		System.out.println("empLogin called ................");
		return "login";
	}
}
