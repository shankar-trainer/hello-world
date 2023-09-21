package com.example.web;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.dao.CustomerRepository;
import com.example.model.Customer;

@RestController
@RequestMapping("/customer")
public class CustomerController {

	@Autowired
	CustomerRepository repository;

	@RequestMapping("/all")
	public List<Customer> getAllCustomer() {
		return (List<Customer>) repository.findAll();
	}

//	@RequestMapping(value = "/add",method = RequestMethod.POST)
	
	@PostMapping("/add")
	public Customer addCustomer(@RequestBody Customer customer) {
		return repository.save(customer);
	}
	
	@GetMapping("/search/{id}")
	public Customer searchCustomer(@PathVariable("id") int id) {
		 Optional<Customer> findById = repository.findById(id);
		 if(findById.isPresent())
			 return findById.get();
	
		 return null;
	}
	
	

}
