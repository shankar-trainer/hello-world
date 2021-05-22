package org.cts.controller;

import java.util.ArrayList;
import java.util.List;

import org.cts.model.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.Errors;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.sun.org.apache.regexp.internal.recompile;

@Controller
@RequestMapping("/")
public class AcountController {

	AccountValidation validation;

	@InitBinder
	public void init(WebDataBinder binder) {
		binder.setValidator(validation);
	}

	@Autowired
	public AcountController(AccountValidation accountValidation) {
		this.validation = accountValidation;
	}

	@GetMapping("/actForm")
	public String accountInit(ModelMap map) {
		Account account = new Account();
		map.addAttribute(account);
		return "accountForm";
	}

	@GetMapping("/actProcess")
	public ModelAndView accountvalidate(@ModelAttribute("account") Account account, Errors errors) {
		validation.validate(account, errors);
		ModelAndView andView;
		if (errors.hasErrors()) {
			andView = new ModelAndView("accountForm");
		} else
			andView = new ModelAndView("accountResult");

		return andView;
	}

	List<String> hb;
	List<String> gender;

	@ModelAttribute("gndr")
	public List<String> gender() {
		gender = new ArrayList<String>();
		gender.add("Male");
		gender.add("Female");
		return gender;
	}

	@ModelAttribute("myhobby")
	public List<String> hobbies() {
		hb = new ArrayList<String>();
		hb.add("Music");
		hb.add("Movie");
		hb.add("Swimming");
		hb.add("Touring");
		hb.add("Marketting");
		return hb;
	}

}
