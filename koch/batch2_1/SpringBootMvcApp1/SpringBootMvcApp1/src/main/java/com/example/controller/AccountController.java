package com.example.controller;

import java.util.ArrayList;
import java.util.List;

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

	@RequestMapping("/jstl")
	public String myjstl() {
		return "myjstl";
	}
	
	@RequestMapping("/accountForm")
	public String myaccount(ModelMap map) {
		Account account = new Account();
		map.addAttribute("account", account);
		return "AccountForm";
	}

	@ModelAttribute("branches")
	public List<String> getrBranches(ModelMap map) {
		List<String> list1 = new ArrayList<String>();
		list1.add("madurai");
		list1.add("chennai");
		list1.add("coimbtore");
		list1.add("kanchipuram");
		map.addAttribute("list1", list1);
		return list1;
	}

	@ModelAttribute("states")
	public List<String> getStates(ModelMap map) {
		List<String> list1 = new ArrayList<String>();
		list1.add("karanata");
		list1.add("kerala");
		list1.add("tamil nadu");
		list1.add("andhra pardesh");
		list1.add("telengana");
		map.addAttribute("list2", list1);
		return list1;
	}

	@PostMapping("/accountAction")
	public String result(@ModelAttribute("account") @Valid Account account, BindingResult result) {
		if (result.hasErrors()) {
			return "AccountForm";
		} else {
			return "AccountResult";
		}
	}

}
