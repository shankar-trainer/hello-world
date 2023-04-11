package com.nec.collection.dao;

import java.util.HashMap;

import com.nec.collection.model.Customer;

public class CustomerDaoImpl implements CustomerDao {
	HashMap<Integer, Customer> hashMap;

	public CustomerDaoImpl() {
		hashMap = new HashMap<>();

	}

	@Override
	public boolean addCustomer(Customer customer) {
		if (!hashMap.containsKey(customer.getId())) {
			hashMap.put(customer.getId(), customer);
			return true;
		}
		return false;
	}

	@Override
	public HashMap<Integer, Customer> getAllCustomer() {
		return hashMap;
	}

	@Override
	public Customer searchCustomer(int id) {
		if (hashMap.containsKey(id)) {
			return hashMap.get(id);
		} 
			return null;
	}

	@Override
	public boolean updateCustomer(Customer customer) {
		if (hashMap.containsKey(customer.getId())) {
			{
			 hashMap.put(customer.getId(), customer);	
			}
				return true;		
			}
		return false;
	}

	@Override
	public boolean removeCustomer(int id) {
		if (hashMap.containsKey(id)) {
			hashMap.remove(id);
			return true;
		}
		return false;
	}

}
