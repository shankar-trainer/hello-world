package com.cognizant.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cognizant.dao.UserDaoImpl;
import com.cognizant.model.User;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;


@Controller
@RequestMapping("/user")
public class UserController {

	@RequestMapping("/login")
	public String loginForm(Model model) {
		User user = new User();
		model.addAttribute("user", user);
		return "UserRegistrationForm";
	}

	@Autowired
	UserDaoImpl dao;
	
	@RequestMapping("/userRegistration")
	public String UserRegistration(@ModelAttribute("user")  User user , ModelMap map) {
         boolean status=dao.userRegistration(user);           
                    map.addAttribute("userregstatus", status);
 		return "UserRegistrationResult";
	}
}
