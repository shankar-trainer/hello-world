package org.com.service;

import org.com.dto.Customer;
import org.com.exception.CustomerException;

public interface CustomerService {

	void saveCustomer(Customer customer) throws CustomerException;
	void deleteCustomer(Customer customer) throws CustomerException;
	void changeCustomer(Customer customer) throws CustomerException;
	void findCustomer(Customer customer) throws CustomerException;
	void getAllCustomer();
	
}
