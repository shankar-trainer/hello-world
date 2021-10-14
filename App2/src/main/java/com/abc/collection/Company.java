package com.abc.collection;

import java.util.HashSet;
import java.util.Set;

public class Company {

	private String name;
	Set<Customer> customerSet;
	
	Set<Item> itemSet;
	
	public Company(String name) {
		super();
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public Customer  getCustomerById(long id) {
		return null;
	}
	
	public float getTotalWorthOfOrdersPlaced() {
		 return 0.0f;
	}
	
}
