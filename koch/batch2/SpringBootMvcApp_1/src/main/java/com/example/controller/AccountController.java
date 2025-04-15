package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.model.Account;
import com.example.model.Employee;

import jakarta.validation.Valid;

@Controller
@RequestMapping("/account")
public class AccountController {

	@RequestMapping("/accountForm")
	public String myaccount(ModelMap map) {
		Account account=new Account();
		map.addAttribute("account", account);
		return "AccountForm";
	}

	@PostMapping("/accountAction")
	public String result(@ModelAttribute("account")  @Valid Account account,
			BindingResult result
			) {
		if(result.hasErrors()) {
			return "AccountForm";
			
		}
		else {
			return "AccountResult";
		}
	}
	
}
