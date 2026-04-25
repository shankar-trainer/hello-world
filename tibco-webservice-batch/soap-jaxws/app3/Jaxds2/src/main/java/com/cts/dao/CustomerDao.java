package com.cts.dao;

import com.cts.model.Customer;
import jakarta.jws.WebService;

import java.util.List;

@WebService
public interface CustomerDao {

	public boolean addCustomer(Customer c) throws Exception;
	public List<Customer> getAllCustomer() throws Exception;
	
}
