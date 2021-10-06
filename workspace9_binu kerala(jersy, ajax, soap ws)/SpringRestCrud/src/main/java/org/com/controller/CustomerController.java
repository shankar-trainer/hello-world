package org.com.controller;

import java.sql.DriverManager;
import java.util.List;

import javax.validation.Valid;

import org.com.dto.Customer;
import org.com.error.RecordNotFoundException;
import org.com.service.CustomerService;
import org.com.service.CustomerServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cst")
public class CustomerController {

	final String url = "/getAll";

	@Autowired
	CustomerService service;

	@RequestMapping(value = url, method = RequestMethod.GET)
	// @GetMapping(value = url)
	// @GetMapping("/getAll")
	public List<Customer> getAllCustomer() {
        return service.getAllCustomer();
	}

	@GetMapping(value = url + "/{id}")
	public Customer searchCustomer(@PathVariable("id") int id) {
		System.out.println("get all called  " + Customer.class.getName());
		return service.findCustomer(id);
	}

	@RequestMapping(value = url + "/{id}", method = RequestMethod.DELETE)
	// @DeleteMapping(value = url + "/{id}")
	@ExceptionHandler(value = RecordNotFoundException.class)
	public ResponseEntity<?> deleteCustomer(@PathVariable("id") int id) {
		try {
			if (service.findCustomer(id) != null) {
				Customer deleteCustomer = service.deleteCustomer(id);
				return new ResponseEntity<Customer>(deleteCustomer, HttpStatus.OK);
			} else
				throw new RecordNotFoundException("Record with id " + id + " is not present ");
		} catch (RecordNotFoundException e) {
			// e.printStackTrace();
			return new ResponseEntity<>(e.getMessage(), HttpStatus.NOT_FOUND);

		}

	}

	@RequestMapping(value = url, method = RequestMethod.POST)
	// @PostMapping(value = url )
	// @ExceptionHandler(value = RecordNotFoundException.class)
	public ResponseEntity<?> addCustomer(@Valid @RequestBody Customer customer) {
		try {
			if (service.findCustomer(customer.getId()) == null) {
				Customer cst = service.saveCustomer(customer);
				return new ResponseEntity<Customer>(cst, HttpStatus.OK);
			} else
				throw new RecordNotFoundException("Record with id " + customer.getId() + " already present ");
		} catch (RecordNotFoundException e) {
			return new ResponseEntity<>(e.getMessage(), HttpStatus.NOT_FOUND);
		}
	}

	@RequestMapping(value = url, method = RequestMethod.PUT)
	// @PutMapping(value = url )
	public ResponseEntity<?> updateCustomer(@Valid @RequestBody Customer customer) {

		try {
			if (service.findCustomer(customer.getId()) != null) {
				Customer cst = service.changeCustomer(customer);
				return new ResponseEntity<Customer>(cst, HttpStatus.OK);
			} else
				throw new RecordNotFoundException("Record Not Present  with id " + customer.getId());
		} catch (RecordNotFoundException e) {
			return new ResponseEntity<>(e.getMessage(), HttpStatus.NOT_FOUND);
		}
	}
}
