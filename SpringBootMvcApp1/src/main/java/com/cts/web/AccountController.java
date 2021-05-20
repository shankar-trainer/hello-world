package com.cts.web;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cts.model.Account;

@Controller
@RequestMapping("/account")
public class AccountController {

	@Autowired
	AccountValidator validator;

	public AccountController(AccountValidator validator) {
		this.validator = validator;
	}

	@GetMapping("/form")
	public String accountForm(ModelMap map) {
		Account account = new Account();
		account.setName("suresh kumar");
		account.setBalance(200000.0F);
		account.setEquityAllocation(100000.0f);
		account.setLocation("chennai");
		account.setAccountCreationDate(new Date(1999, 10, 20));
		
		map.addAttribute("act", account);
		return "account/accountForm";
	}

	

	@InitBinder
	public void InitBinder(WebDataBinder binder) {
		binder.setValidator(validator);
		binder.registerCustomEditor(Date.class, new CustomDateEditor(new SimpleDateFormat("dd-MM-yyyy"), true));
	}

	@PostMapping("/accountProcess")
	public String accountProcess(@ModelAttribute("act") Account act, BindingResult result) {
		validator.validate(act, result);
		if (result.hasErrors()) {
			return "account/accountForm";

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

	@GetMapping("/view")
	public String jstlView() {
		return "view";
	}

}
