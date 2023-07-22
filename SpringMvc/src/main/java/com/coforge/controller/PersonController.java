package com.coforge.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.coforge.model.Person;

@Controller
@RequestMapping
public class PersonController {

	@RequestMapping("/pform")
	public String personForm(ModelMap model) {
		Person person = new Person();
		person.setPersonId(null);
		person.setPersonName(null);
		person.setPersonSalary(null);
		model.addAttribute("person", person);
		return "PersonForm";
	}

	@RequestMapping(value = "/personAction", method = RequestMethod.POST)
	// @PostMapping(value = "/personAction")

	public String personForm(@ModelAttribute("person") @Valid Person person, BindingResult result) {
		if (result.hasErrors()) {
			System.out.println("there is error");
			return "PersonForm";
		}
		return "result/PersonResult";
	}

}
