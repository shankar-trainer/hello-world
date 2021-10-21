package com.capegemini.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CustomerDao {

	Map<Integer, Customer> cust_map;

	public CustomerDao() {
		cust_map = new HashMap<Integer, Customer>();
	}

	public void addCustomer(Customer customer) {
		cust_map.put(customer.getCust_Id(), customer);
	}

	public Map<Integer, Customer> getAllCustomer() {
		return cust_map;
	}

	public Customer searchCustomer(int id) {
		Set<Integer> set2 = cust_map.keySet();
		for (Integer integer : set2) {
			if (integer == id)
				return cust_map.get(id);
		}
		return null;
	}

	public boolean removeCustomer(int id) {
		Customer customer = searchCustomer(id);
		if (customer != null) {
			cust_map.remove(id);
			return true;
		}
		return false;
	}
}
