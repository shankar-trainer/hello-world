package com.cts.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cts.model.Product;
import com.cts.model.User;

import jakarta.validation.Valid;

@Controller
@RequestMapping("/user")
public class UserController {

	@GetMapping("/form")
	public String form(ModelMap map) {
		map.addAttribute("user", new User());
		map.addAttribute("product", new Product());
		return "userform";
	} 
	
	@PostMapping("/usersubmit")
	public String submitform(@ModelAttribute
			@Valid  User user, BindingResult result,
			@ModelAttribute
			 Product product
			) {
	
		if(result.hasErrors())
			return "userform";
		else 
		 return "productform";	
	}		
}
