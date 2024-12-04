package com.coforge.dao;

import java.util.List;

import com.coforge.model.Customer;

public interface CustomerDao {
	public List<Customer> getAllCustomer();

	public Customer saveCustomer(Customer c);

	public Customer searchCustomer(int id);

}
