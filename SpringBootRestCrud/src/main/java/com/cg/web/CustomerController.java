package com.cg.web;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.cg.error.CustomerException;
import com.cg.model.Customer;
import com.cg.service.CustomerService;

@RestController
@RequestMapping("/customer")
public class CustomerController {

	@Autowired
	CustomerService service;

	@GetMapping("/all")
	public List<Customer> getAllCustomer() throws CustomerException {
		return service.getAllCustomer();
	}

	@GetMapping("/search/{id}")
	public Customer searchCustomer(@PathVariable("id") Integer id) throws CustomerException {
		Customer customer = new Customer();
		customer.setCustomerId(id);
		return service.searchCustomer(customer);
	}

	@DeleteMapping("/delete/{id}")
	// @RequestMapping(value = "/save", method = RequestMethod.DELETE)
	public ResponseEntity<Customer> deleteCustomer(@PathVariable("id") Integer id) throws CustomerException {
		Customer customer = new Customer();
		customer.setCustomerId(id);

		if (service.searchCustomer(customer) != null) {
			service.deleteCustomer(customer);
			return new ResponseEntity<Customer>(service.searchCustomer(customer), HttpStatus.OK);
		} else
			return new ResponseEntity<Customer>(HttpStatus.NOT_FOUND);
	}

	// @PostMapping("/save")
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public Customer saveCustomer(@RequestBody Customer customer) throws CustomerException {
		return service.addCustomer(customer);
	}

}
