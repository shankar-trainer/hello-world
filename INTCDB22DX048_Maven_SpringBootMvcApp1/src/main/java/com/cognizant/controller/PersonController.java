package com.cognizant.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.cognizant.model.Book;
import com.cognizant.model.Person;

@Controller
@RequestMapping("/")
@SessionAttributes(names={"person","book"})
public class PersonController {

	@RequestMapping(value =   "/empform",method = RequestMethod.GET)
	public String personForm() {
		return "PersonForm";
	}
	
	@RequestMapping(value =   "/empform",method = RequestMethod.POST)
	public String personSubmit(@RequestParam("id") int id,@RequestParam("name") String name,@RequestParam("salary") float salary,ModelMap map) {
		Person person=new Person();
		person.setId(id);
		person.setName(name);
		person.setSalary(salary);
		
		map.addAttribute("person", person);
		return "PersonResult";
	}
	
	@RequestMapping(value =   "/bookaction",method = RequestMethod.POST)
	public String bookSubmit(@RequestParam("isbn") int isbn,@RequestParam("bname") String bname,@RequestParam("cost") float cost,ModelMap map) {
		Book b1=new Book();
		b1.setIsbn(isbn);
		b1.setBname(bname);
		b1.setCost(cost);
		
		map.addAttribute("book", b1);
		return "BookResult";
	}
	
	
	
	
}
