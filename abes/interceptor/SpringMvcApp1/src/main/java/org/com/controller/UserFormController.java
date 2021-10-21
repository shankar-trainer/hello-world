package org.com.controller;

import javax.validation.Valid;

import org.com.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserFormController {
	@RequestMapping("/uform")
	public String getuserForm(ModelMap map) {
		User user = new User();
		map.addAttribute("user1", user);
		return "UserForm";
	}

	@RequestMapping("/userLogin")
	public String userLogin(@ModelAttribute("user1") @Valid User user, BindingResult result) {
		System.out.println("... userLogin starts .." + result.toString());

		if (result.hasErrors()) {
			System.out.println("errors .............");
			return "UserForm";
		} else {

			return "userResult";
		}
	}
}
