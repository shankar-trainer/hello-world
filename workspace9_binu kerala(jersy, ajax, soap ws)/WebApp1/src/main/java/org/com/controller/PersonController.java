package org.com.controller;

import javax.validation.Valid;

import org.com.model.Person;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/person")
public class PersonController {
	
	@GetMapping("/personLogin")
	public String personLogin(ModelMap map){
		
		Person person1=new Person();
		person1.setId(10001);
		person1.setName("rajesh kumar");
		person1.setSalary(50000.0f);
		
		map.addAttribute("person1",person1);
		
		return "PersonLogin";
	}
	
	@PostMapping("/personLogin")
//	public String personResult(@ModelAttribute("person1") @Valid  Person person1, BindingResult result){
		public String personResult(@ModelAttribute("person1")  Person person1){
	
//		if(result.hasErrors())
//			return "PersonLogin";
//		else			
		return "personResult";
	}
	
	
	
	
	
}
