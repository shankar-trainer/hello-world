package com.cts.dao;

import java.util.List;

import com.cts.model.Customer;

public interface CustomerDao {

	public boolean addCustomer(Customer cs);
	public boolean updateCustomer(Customer cs);
	public Customer searchCustomer(int id);
	public List<Customer> getAllCustomer();
	
	
}
