package com.nec.collection.dao;

import java.util.HashMap;

import com.nec.collection.model.Customer;

public interface CustomerDao {

	public boolean addCustomer(Customer customer);
	
	public HashMap<Integer, Customer> getAllCustomer();
	public Customer searchCustomer(int id);
	public boolean updateCustomer(Customer customer);
	public boolean removeCustomer(int id);
	
}
