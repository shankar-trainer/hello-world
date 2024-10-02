package com.coforge.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.coforge.model.Person;

import jakarta.validation.Valid;

@Controller
@RequestMapping("/person")
public class PersonController {

	@RequestMapping("/pForm")
	public String personForm(ModelMap map) {
		Person person=new Person();
		map.addAttribute("person", person);
		
		return "personform";
	} 	
	
	@RequestMapping("/personAction")
	public String validatePerson(@ModelAttribute("person") @Valid Person person, 
			BindingResult result){
		if(result.hasErrors()) {
			return "personform";
		}
		else 
			return "personresult";
	}

}
