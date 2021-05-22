package com.cts.web;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.cts.model.Customer;

@Controller
@RequestMapping("/customer")
@SessionAttributes(value = {"customer","country"})
public class CustomerController {

//	@RequestMapping("/customerForm")
	//@RequestMapping(value = "/customerForm", method = RequestMethod.GET)
	@GetMapping("/customerForm")
	public String custForm() {
		return "CustomerForm";
	}
	
//	@RequestMapping("/Logout")
	@GetMapping("/Logout")
	public String customerLogoput(HttpServletRequest request) {
		request.getSession().invalidate();
		return "Logout";
	}
	

	//@RequestMapping(value = "/customerData",method = RequestMethod.POST)
	@PostMapping("/customerData")
	public String custResult(ModelMap map, @RequestParam("id") int id, @RequestParam("name") String name,
			@RequestParam("location") String location, HttpServletRequest req) {

		req.getSession().setMaxInactiveInterval(3);
		
		Customer customer=new Customer();
        customer.setId(id);
        customer.setName(name);
        customer.setLocation(location);
	
        map.addAttribute("customer",customer);
        map.addAttribute("country", "India");
        return "CustomerData";
	}

}
