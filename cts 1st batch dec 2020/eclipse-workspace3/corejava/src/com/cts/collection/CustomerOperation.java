package com.cts.collection;

import java.util.HashMap;

public class CustomerOperation {

	HashMap<Integer, Customer> customerMap;

	public CustomerOperation() {
		customerMap = new HashMap<Integer, Customer>();
	}

	public Customer addCustomer(Customer customer) {
		return customerMap.put(customer.getId(), customer);
	}
	
	public  Customer searchCustomer(Customer customer) {
		if( customerMap.containsKey(customer.getId()))
			return customerMap.get(customer.getId());
		else
			return null;
	}

	public  HashMap<Integer, Customer>   getAllCustomer(){
		return customerMap;
	}
	
}
