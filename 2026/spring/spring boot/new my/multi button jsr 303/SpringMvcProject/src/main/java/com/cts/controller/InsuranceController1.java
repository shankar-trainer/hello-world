package com.cts.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cts.model.Insurance;
import com.cts.service.InsuranceService;

import jakarta.validation.Valid;

@Controller
@RequestMapping("/insurance1")
public class InsuranceController1 {

	@Autowired
	private InsuranceService service;

//	@RequestMapping("/form")
	@GetMapping("/form")
	public String hello(ModelMap map) {
		Insurance insurance = new Insurance();
		map.addAttribute("insurance", insurance);
		return "insuranceform";
	}

//	@GetMapping("/addRecord")
	@PostMapping("/addRecord")
	public String addRecord(@ModelAttribute @Valid Insurance insurance, BindingResult result,
			@RequestParam("submit") String submit, ModelMap map) {

		if (result.hasErrors()) {
			return "insuranceform";
		} else {
			System.out.println("submit is " + submit);
			switch (submit) {
			case "add record":
				service.addInsurance(insurance);
				break;

			case "show all":
				List<Insurance> allInsurance = service.getAllInsurance();
				map.addAttribute("allInsurance", allInsurance);

				break;

			case "search by id":
				int id = insurance.getId();
				Insurance insurance1 = service.searchById(id);
				map.addAttribute("insurance1", insurance1);
				break;
			case "delete by id":
				int id1 = insurance.getId();

				var ins = service.deleteById(id1);
				map.addAttribute("ins", ins);
				break;
				
			case "update record":
				var ins3 = service.updateRecord(insurance);

				map.addAttribute("ins3", ins3);
				break;

			default:
				break;
			}
			map.addAttribute("msg", submit);

			return "insuranceresult";
		}
	}

}
