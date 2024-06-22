package coforge.com.controller;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.View;

import coforge.com.model.Customer;
import coforge.com.model.User;

@Controller
@RequestMapping("/customer")
public class CustomerController {

//	@RequestMapping("/form")
//	public String form() {
//		return "CustomerForm";
//	}

//	@RequestMapping("/form")
	@GetMapping("/form")
	public ModelAndView form(ModelMap map) {
		Customer customer = new Customer();
//		customer.setId(10001);
//		customer.setName("ram kumar");
//		customer.setSalary(24000.0f);
		map.addAttribute("customer", customer);
		ModelAndView andView = new ModelAndView("CustomerForm", map);
		return andView;
	}

//	@RequestMapping( "/customerAction")
	// @RequestMapping(value = "/customerAction", method = RequestMethod.POST)

	@PostMapping("/customerAction")
	public String customerFormProcess(@ModelAttribute("customer") @Valid Customer customer, BindingResult result) {
		if (result.hasErrors())
			return "CustomerForm";
		else
			return "CustomerResult";
	}

	@ModelAttribute("cities")
	public List<String> getCities() {
		List<String> cities = new ArrayList<String>();
		cities.add("delhi");
		cities.add("mumbai");
		cities.add("lucknow");
		cities.add("balia");
		cities.add("kolkotta");
		return cities;
	}

	@ModelAttribute("hobbies")
	public List<String> getHobbies() {
		List<String> hobbies = new ArrayList<String>();
		hobbies.add("music");
		hobbies.add("reading");
		hobbies.add("radio");
		hobbies.add("touring");
		hobbies.add("dancing");
		return hobbies;
	}

	@ModelAttribute("gender")
	public List<String> getGender() {
		List<String> gender = new ArrayList<String>();
		gender.add("male");
		gender.add("female");

		return  gender;
	}
}
