package com.abc.collection;

public class Customer {

	private long customerId;
	private String name;
	public Customer(String name) {
		super();
		this.name = name;
	}
	
	public long getCustomerId() {
		return customerId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
