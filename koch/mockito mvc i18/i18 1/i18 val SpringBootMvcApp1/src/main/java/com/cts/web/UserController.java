package com.cts.web;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.cts.model.User;

@Controller
@RequestMapping("/user")
public class UserController {

	@GetMapping("/uform")
	public String userForm(Model model) {
		User user = new User();
		user.setUserId(0);
		user.setUserName("m kumar");
		user.setUserSalary(0.0f);
		model.addAttribute("user", user);
		return "user/userForm";
	}

	@GetMapping("/uaction")
	public String userFormAction(@ModelAttribute("user") @Valid User user, BindingResult result) {
		if(result.hasErrors())
			return "user/userForm";
		else
		return "user/userResult";
	}
}
