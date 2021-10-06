package org.com.controller;

import javax.servlet.http.HttpServletRequest;

import org.com.dto.Customer;
import org.com.exception.CustomerException;
import org.com.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Controller
@RequestMapping("/customer")
@EnableWebMvc
public class CustomerController {

	@Autowired
	CustomerService service;

	
	@RequestMapping("/searchcustomer")
	public @ResponseBody Customer  searchCustomner(@RequestParam("cstid") int cstid) throws CustomerException{
		Customer cst=new Customer();
		System.out.println("search param is ...."+cstid);
		cst.setId(cstid);
	Customer cst1=service.findCustomer(cst);
	System.out.println(cst1);
	return 	cst1;
	}	
	
	@RequestMapping("/allcustomer")
	public String getCustomerList(ModelMap map) {
		System.out.println("getCustomerList called");
		service.getAllCustomer().forEach(System.out::println);
		map.addAttribute("list", service.getAllCustomer());
		// map.addAttribute(msg, "all records displayed ");
		return "customer_list";
	}

	@RequestMapping("/addCustomerForm")
	public String addCustomerForm(ModelMap map) {
		Customer customer = new Customer();
		map.addAttribute("cst", customer);
		return "addcustomerform";
	}

	@RequestMapping("/addCustomer")
	public String addCustomer(@ModelAttribute("cst") Customer cst, Model model, HttpServletRequest request)
			throws CustomerException {
		service.saveCustomer(cst);
		return "redirect:/customer/allcustomer";
	}

	@RequestMapping("/delete")
	public String deleteCustomer(@RequestParam("id") int id) throws CustomerException {
		Customer customer = new Customer();
		customer.setId(id);
		service.deleteCustomer(customer);

		return "redirect:/customer/allcustomer";
	}
	

	@RequestMapping("/updateCustomerPage")
	public String   updateCustomerPage(ModelMap map) {
		map.addAttribute("list", service.getAllCustomer());

		Customer customer = new Customer();
		map.addAttribute("cst", customer);
		
		return "updateCustomerPage";
	}

	
	@RequestMapping("/update")
	//@ModelAttribute("person1") @Valid  Person person1, BindingResult result
	public String updateCustomer
	(@ModelAttribute("cst") Customer cst,@RequestParam("id") int id,@RequestParam("name") String name, @RequestParam("salary") float salary) throws CustomerException {
		Customer customer = new Customer();
		System.out.println("id is "+id);
		customer.setId(id);
		customer.setName(name);
		customer.setSalary(salary);
		
		service.changeCustomer(customer);

		return "redirect:/customer/allcustomer";
	}

	@RequestMapping("/delCustomerPage")
	public String delCustomerPage(ModelMap map) {
		map.addAttribute("list", service.getAllCustomer());

		return "delCustomerPage";
	}
	
	
}
