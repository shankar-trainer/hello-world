package org.com.service;

import org.com.dao.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("customerService")
public class CustomerService {
	@Autowired
	private CustomerRepository customerdao;
	
	
}
