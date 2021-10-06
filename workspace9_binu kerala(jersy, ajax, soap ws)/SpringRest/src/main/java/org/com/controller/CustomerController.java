package org.com.controller;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.com.model.Customer;
import org.com.model.Employee;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cust")
public class CustomerController {

	// @RequestMapping("/hello")
	@GetMapping("/hello")
	public String hello() {

		return "hello";
	}

	@PostMapping("/addCustomer")
	public Customer addCustomer(@Valid @RequestBody Customer customer) {
		empList.add(customer);
		return customer;
	}
	

	@PutMapping("/custAll")
	public Customer updateCustomer(@Valid @RequestBody Customer customer) {
		Customer emp = null;
		for (Customer e : empList) {
			if (e.getId() == customer.getId())
			{	
				emp = e;
				empList.remove(e);
			    emp=customer;
			    empList.add(customer);
			    
			}
			break;
		}
		return emp;
	}


	@GetMapping("/custInfo")
	public Customer getEmployee() {
		Customer customer = new Customer();

		customer.setId(5466565);
		customer.setName("r kumar");
		customer.setSalary(78000);
		return customer;
	}

	@RequestMapping("/custAll")
	public List<Customer> getAllCustomer() {
		return empList;
	}

	@RequestMapping("/custAll/{id}")
	public Customer searchCustomer(@PathVariable("id") int id) {
		Customer emp = null;
		for (Customer e : empList) {
			if (e.getId() == id)
				emp = e;
			break;
		}
		return emp;
	}

	
	@DeleteMapping("/custAll/{id}")
	public Customer removeCustomer(@PathVariable("id") int id) {
		Customer emp = null;
		for (Customer e : empList) {
			if (e.getId() == id){
			     emp=e;
				empList.remove(e);
			
			}
			break;
		}
		return emp;
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	static List<Customer> empList = new ArrayList<Customer>();

	static {
		Customer custar[] = new Customer[5];
		int id[] = { 1001, 1002, 1003, 1004, 1005 };
		String name[] = { "suresh kumar", "mohan kumar", "p kumar", "r kumar", "prithviraj kumar" };
		float salary[] = { 12000, 45000, 67000, 90000, 34000 };

		for (int i = 0; i < salary.length; i++) {
			custar[i] = new Customer();
			custar[i].setId(id[i]);
			custar[i].setName(name[i]);
			custar[i].setSalary(salary[i]);
			empList.add(custar[i]);
		}
	}

}
