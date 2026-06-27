package com.cts.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.SmartValidator; // Add this import
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cts.model.Insurance;
import com.cts.service.InsuranceService;

@Controller
@RequestMapping("/insurance")
public class InsuranceController {

	@Autowired
	private InsuranceService service;

	@Autowired
	private SmartValidator validator; // Inject the validator manually

	@GetMapping("/form")
	public String hello(ModelMap map) {
		Insurance insurance = new Insurance();
		map.addAttribute("insurance", insurance);
		return "insuranceform";
	}

	@PostMapping("/addRecord")
	public String addRecord(@ModelAttribute Insurance insurance, BindingResult result,
			@RequestParam("submit") String submit, ModelMap map) {

		System.out.println("submit is " + submit);

		switch (submit) {
		case "add record":
			// Programmatically trigger validation ONLY for this action
			validator.validate(insurance, result);
			if (result.hasErrors()) {
				return "insuranceform";
			}
			service.addInsurance(insurance);
			break;
            
		case "update record":
			// Programmatically trigger validation ONLY for this action
			validator.validate(insurance, result);
			if (result.hasErrors()) {
				return "insuranceform";
			}
			var ins3 = service.updateRecord(insurance);
			map.addAttribute("ins3", ins3);
			break;

		case "show all":
			// Validation is completely bypassed here!
			List<Insurance> allInsurance = service.getAllInsurance();
			map.addAttribute("allInsurance", allInsurance);
			break;

		case "search by id":
			// Bypasses regular form validation
			int id = insurance.getId();
			Insurance insurance1 = service.searchById(id);
			map.addAttribute("insurance1", insurance1);
			break;
            
		case "delete by id":
			// Bypasses regular form validation
			int id1 = insurance.getId();
			var ins = service.deleteById(id1);
			map.addAttribute("ins", ins);
			break;

		default:
			break;
		}

		map.addAttribute("msg", submit);
		return "insuranceresult";
	}
}