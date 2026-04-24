package com.cts.dao;

import java.util.List;

import com.cts.model.Customer;

import jakarta.jws.WebService;

@WebService
public interface CustomerDao {

	public boolean addCustomer(Customer c) throws Exception;
	public List<Customer> getAllCustomer() throws Exception;
	
}
