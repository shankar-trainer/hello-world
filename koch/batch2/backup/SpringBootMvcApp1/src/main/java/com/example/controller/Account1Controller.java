package com.example.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.model.Account;
import com.example.model.Account1;

@Controller
@RequestMapping("/account1")
public class Account1Controller {
	
	@Autowired
	Account1Validator validator;
	
	public Account1Controller(Account1Validator validator) {
		super();
		this.validator = validator;
	}

	@InitBinder
	public void initBinder(WebDataBinder binder) {
		binder.setValidator(validator);
	}


	@GetMapping("/form")
	public String form(ModelMap map) {
		
		Account1 account1=new Account1();
		map.addAttribute("act", account1);
		return "account/Account1Form";
	}
	
	@PostMapping("/accountProcess")
	public String accountProcess(@ModelAttribute("act") Account act, BindingResult result) {
		validator.validate(act, result);
		if (result.hasErrors()) {
			return "account/Account1Form";

		} else {
			return "account/accountResult";

		}
	}

	@ModelAttribute("gender")
	public List<String> getGenderValue() {
		List<String> genderList = new ArrayList<String>();
		genderList.add("Male");
		genderList.add("Female");
		return genderList;
	}

	@ModelAttribute("accountType")
	public List<String> getAccountType() {
		List<String> actList = new ArrayList<String>();
		actList.add("saving");
		actList.add("current");
		actList.add("fixed deposit");
		return actList;
	}


}
