package org.com;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.model.Customer;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping
public class CustomerController {

	@ModelAttribute("hobby")
	public List<String> hobby() {
		hblist=null;
		hblist= new ArrayList<String>();

		hblist.add("Swimming");
		hblist.add("Reading");
		hblist.add("Music");
		hblist.add("Movie");
		hblist.add("Flowering");
		return hblist;
	}

	List<String> glist;
	List<String> hblist; 
	@ModelAttribute("gender")
	public List<String> gender() {
		glist = null;
		glist = new ArrayList<String>();
		glist.add("Male");
		glist.add("Female");
		return glist;
	}

	@RequestMapping(value = "/cstForm")
	public String customerForm(ModelMap map) {
		Customer customer = new Customer();
		customer.setId(1001);
		customer.setName("pankaj from HP ");

		map.addAttribute("cst", customer);

		return "CustomerForm";
	}

	@RequestMapping(value = "/cstResult")
	public String customerData(@ModelAttribute("cst") @Valid Customer customer, BindingResult result, ModelMap map) {

		if (result.hasErrors())
			return "CustomerForm";
		else {
			map.addAttribute("cst", customer);
			return "customerData";
		}
	}

}
