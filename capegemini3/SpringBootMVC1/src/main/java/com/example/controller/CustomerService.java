//package com.example.service;
package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;

//import com.example.dao.CustomerDao;
//import com.example.model.Customer;

public class CustomerService {

	@Autowired
	CustomerDao dao;

	public boolean addCustomer(Customer customer){
		if(dao.findById(customer.getId()).isPresent())
			return false;
		else{
		dao.save(customer);
		return true;
		}
	}
	

	
}
