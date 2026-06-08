package com.example.accessingdatamysql.controller;
 
import java.util.List;
 

import jakarta.validation.Valid;
import org.springframework.validation.BindingResult;

 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.servlet.ModelAndView;

import com.example.accessingdatamysql.model.PersonEntity;
import com.example.accessingdatamysql.service.PersonService;


@Controller    
public class PersonMVCController {
	
	@Autowired
    private PersonService personService;
	
	//---------------------------------Use by MVC - JSP --------------------------------------------------
	// NOTE: The method is requested by both / and by "/demo/mvclistpersons" and 
	// when a user hit the domain-name and "List of Persons" will be the initial page! 
	// Show a list of Persons  in a JSP View.
	//@GetMapping({"/", "/demo/mvclistpersons"})
	@GetMapping("/demo/mvclistpersons")
	public ModelAndView mvclistpersons() {

	 ModelAndView model = new ModelAndView("person_list");
	 List<PersonEntity> personList = personService.getAll();
	 model.addObject("personList", personList);
	 
	 return model;
	}

	// Delete a Person by the ID and redirect to the JSP Viev representing a list of persons
	@RequestMapping(value="/demo/mvcdeleteperson/{id}", method=RequestMethod.GET)
	public ModelAndView delete(@PathVariable("id") long id) {
	 personService.deletePerson(id);
	 
	 return new ModelAndView("redirect:/demo/mvclistpersons");
	}

	// Display the Form used to Add or Update a Person 
	@RequestMapping(value="/demo/mvccreateperson/", method=RequestMethod.GET)
	public ModelAndView createPerson() {
	 ModelAndView model = new ModelAndView();
	 
	 PersonEntity person = new PersonEntity();
	 model.addObject("personForm", person);
	 model.setViewName("person_form");
	 
	 return model;
	}
	
	// This method Get a Person by Id and populate the fields of the Form by the data 
	// of the Person
	@RequestMapping(value="/demo/mvcupdateperson/{id}", method=RequestMethod.GET)
	public ModelAndView editPerson(@PathVariable long id) {
	 ModelAndView model = new ModelAndView();
	 
	 PersonEntity person = personService.getPersonById(id);
	 model.addObject("personForm", person);
	 model.setViewName("person_form");
	 
	 return model;
	}

	// This method save the data of the Person entered in the Form by Update or Create
	// and display Errors if any or redirect to the JSP View with the list of persons if success
	@RequestMapping(value="/demo/mvcsaveperson", method=RequestMethod.POST)
	public String save(@Valid @ModelAttribute("personForm") PersonEntity person, BindingResult bindingResult) {
	
		if (bindingResult.hasErrors()) {
			
	       return "person_form";
		}
		
		//System.out.println(person.toString());

	    personService.saveOrUpdate(person);
	    return "redirect:/demo/mvclistpersons";
	   
	}
	
	

}