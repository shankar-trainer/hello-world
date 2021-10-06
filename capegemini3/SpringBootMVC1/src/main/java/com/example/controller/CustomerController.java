package com.example.controller;


import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
//import com.example.dao.CustomerDao;


@Controller
@RequestMapping
public class CustomerController {

	@Autowired
	CustomerDao dao;

	@RequestMapping("/login")
	public String empForm(ModelMap map) {
		System.out.println("login called ");
		Customer customer = new Customer();
		map.addAttribute("customer", customer);
		return "emploginForm";
	}

	@PostMapping(value = "/login")
	public String empLogin(@RequestParam("operation") String operation, ModelMap map,
			@ModelAttribute("customer") @Valid Customer customer, BindingResult result
	) {
		if (result.hasErrors()) {
			return "emploginForm";
		} else {
			map.addAttribute("operation", operation);
			if (operation.equals("add")) {
				if (!dao.findById(customer.getId()).isPresent()) {
					dao.save(customer);
					map.addAttribute("result", "Record added");
				} else
					map.addAttribute("result", "Record already present");
			}
			
			else if (operation.equals("show all")) {
				map.remove("result");
				map.addAttribute("empresult", dao.findAll());
				map.addAttribute("result", "All Employee");
			}


			return "result";
		}
	}
}
