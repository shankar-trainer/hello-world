package com.cognizant.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cognizant.model.User;

@Controller
@RequestMapping("/")
public class UserController {
    
	@RequestMapping("/form")
	public String goTouserForm(Model model) {
		User user=new User();
		model.addAttribute("user", user);
		return "UserForm";
	}
	
	
}
