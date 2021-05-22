package com.cts.web;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
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
	
	AccountValidator validator;

	public AccountController(AccountValidator validator) {
		this.validator = validator;
	}

	@InitBinder
	public void InitBinder(WebDataBinder binder) {
		binder.setValidator(validator);

		binder.registerCustomEditor(Date.class, new CustomDateEditor(new SimpleDateFormat("dd/MM/yyyy"), true));
	}

	@GetMapping("/accountForm")
	public String accountFirstForm(ModelMap map) {
		map.addAttribute("account", new Account());
		return "AccountForm";
	}

	@PostMapping("/accountOperation")
	public String accountProcess(@ModelAttribute("account") Account account, BindingResult result) {
		validator.validate(account, result);
		if (result.hasErrors())
			return "AccountForm";
		else
			return "AccountPage";
	}
}
