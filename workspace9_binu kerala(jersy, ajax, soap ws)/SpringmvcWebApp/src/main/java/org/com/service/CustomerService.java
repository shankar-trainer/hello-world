package org.com.service;

import java.util.List;

import org.com.dto.Customer;
import org.com.exception.CustomerException;

public interface CustomerService {

	boolean saveCustomer(Customer customer) throws CustomerException;
	void deleteCustomer(Customer customer) throws CustomerException;
	void changeCustomer(Customer customer) throws CustomerException;
	Customer findCustomer(Customer customer) throws CustomerException;
	List<Customer> getAllCustomer();
	
}
