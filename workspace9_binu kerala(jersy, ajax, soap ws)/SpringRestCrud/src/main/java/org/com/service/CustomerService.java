package org.com.service;

import java.util.List;

import org.com.dto.Customer;

public interface CustomerService {

	Customer saveCustomer(Customer customer) ;
	Customer deleteCustomer(int id);
	Customer changeCustomer(Customer customer);
	Customer findCustomer(int id) ;
	List<Customer> getAllCustomer();
	
}
