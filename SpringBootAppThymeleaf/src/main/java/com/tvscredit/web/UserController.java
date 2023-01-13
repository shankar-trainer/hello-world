package com.tvscredit.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.tvscredit.model.User;

@Controller
public class UserController {

	@GetMapping("/")
	public String home() {
		return "home";
	}

	@PostMapping("/register")
	public String userRegistration(@RequestParam("userId") int userId, @RequestParam("userName") String userName,
			@RequestParam("usersalary") float userSalary, ModelMap map) {
		User user = new User();
    
		 user.setUserId(userId);
		 user.setUserName(userName);
		 user.setUsersalary(userSalary);
		 
		 map.addAttribute("user", user);
		
		return "result";
	}
}
