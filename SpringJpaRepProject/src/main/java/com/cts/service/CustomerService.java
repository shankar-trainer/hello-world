package com.cts.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.model.Customer;
import com.cts.repo.CustomerRepository;

@Service
public class CustomerService {

	@Autowired
	CustomerRepository repository;

	public Customer addCustomer(Customer customer) {
	         Optional<Customer> findById = repository.findById(customer.getId());
	         
	         if(findById.isPresent())
	        	 return  null;
	         else {
	        	 repository.save(customer);
	        	 return customer;
	         }
	}
	
	
     public List<Customer> getAllCustomer(){
    	  return  repository.findAll();
     }
	
	
     public boolean searchCustomer(Customer customer) {
    	//repository.getCustomerbyIdandName(id, name)   
     }
	
	
}
