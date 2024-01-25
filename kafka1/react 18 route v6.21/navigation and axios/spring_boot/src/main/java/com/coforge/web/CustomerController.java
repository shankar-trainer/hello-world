package com.coforge.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.coforge.exception.CustomerException;
import com.coforge.model.Customer;
import com.coforge.service.CustomerService;
import com.coforge.dao.CustomerDao;

@RestController
@RequestMapping("/customer")
@CrossOrigin("http://localhost:3000")
//@CrossOrigin(origins = "http://localhost:3000")
public class CustomerController {

	@Autowired
	CustomerService service;
	
	@Autowired
	CustomerDao dao;
	
	@GetMapping("/all")
	public ResponseEntity<List<Customer>> getAllCustomer() {
		try {
		return  new ResponseEntity<List<Customer>>( service.getAllCustomer(),HttpStatus.OK) ;
		}
		catch (CustomerException e) {
			return new ResponseEntity(e.getMessage(),HttpStatus.NOT_FOUND);
		}
	}
/*
@GetMapping("/employees/{id}")
	public ResponseEntity<Employee> getEmployeeById(@PathVariable Long id) {
		Employee employee = employeeRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Employee not exist with id :" + id));
		return ResponseEntity.ok(employee);
	}
*/


	@GetMapping("/search/{id}")
	public ResponseEntity<Customer> searchCustomer(@PathVariable("id") Long id) {
		try {
		//return new ResponseEntity<Customer> (service.searchCustomer(id), HttpStatus.FOUND);
		return new ResponseEntity<Customer> (service.searchCustomer(id), HttpStatus.OK);
		}
		catch (CustomerException e) {
			return new ResponseEntity(e.getMessage(),HttpStatus.NOT_FOUND);
		}
	}
	
	
	/*
	@GetMapping("/search/{id}")
	public ResponseEntity<Customer> searchCustomer(@PathVariable("id") Long id) {
		 Customer customer= dao.findById(id).get();
		 return ResponseEntity.ok(customer);
	}
*/
	
	@PostMapping("/add")
	public ResponseEntity<Customer> addCustomer(@RequestBody Customer customer) {
		try {
		return  new ResponseEntity<Customer> (service.addCustomer(customer),HttpStatus.OK);
		}
		catch (CustomerException e) {
			return new ResponseEntity(e.getMessage(),HttpStatus.NOT_FOUND);
		}
		
		
	}
	
	@DeleteMapping("/remove/{id}")
	public ResponseEntity<Customer> removeCustomer(@PathVariable("id") long id) {
		try {
			return  new ResponseEntity<Customer> (
		 service.removeCustomer(id), HttpStatus.OK);
		}
		catch (CustomerException e) {
			return new ResponseEntity(e.getMessage(),HttpStatus.NOT_FOUND);
		}
		
	}

	@PutMapping("/update")
	public ResponseEntity<Customer> updateCustomer(@RequestBody Customer customer) {
		try {
			return  new ResponseEntity<Customer> (
		service.updateCustomer(customer),HttpStatus.CREATED);
		}
		catch (CustomerException e) {
			return new ResponseEntity(e.getMessage(),HttpStatus.NOT_FOUND);
		}
		
	}
}
