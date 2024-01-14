package com.coforge.controller;

import java.util.List;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.coforge.model.Customer;

@RestController
@RequestMapping("/customer")
public class CustomerController {

	RestTemplate template = new RestTemplate();

	ParameterizedTypeReference<List<Customer>> ref1 = new ParameterizedTypeReference<List<Customer>>() {
	};

	@GetMapping("/getall")
	public List<Customer> getAllCustomer() {
		ResponseEntity<List<Customer>> list1 = template.exchange("http://localhost:8080/customer/all", HttpMethod.GET,
				null, ref1);
		List<Customer> body = list1.getBody();
		return body;
	}
	 
	
	@GetMapping("/search/{id}")
	public Customer searchCustomer(@PathVariable long  id) {
		ResponseEntity<Customer> forEntity = template.getForEntity("http://localhost:8080/customer/search/"+id,
				Customer.class);
		Customer body = forEntity.getBody();
		return body;
	}
	
	

}
