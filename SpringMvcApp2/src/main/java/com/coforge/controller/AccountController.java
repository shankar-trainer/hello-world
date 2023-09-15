package com.coforge.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.coforge.model.Account;

@Controller
@RequestMapping("/account")
public class AccountController {

	@RequestMapping("/form")
	public String accountInit(ModelMap map) {
		Account account=new Account();
		map.put("account", account);
		return "AccountForm";
	}
	
	@RequestMapping("AccountAction")
	public String accountExecute(@ModelAttribute("account") @Valid Account account,BindingResult result) {
		if(result.hasErrors()) {
			return "AccountForm";
		}
		return "result/AccountResult";
	}
}
