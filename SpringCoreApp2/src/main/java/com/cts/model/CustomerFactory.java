package com.cts.model;

public class CustomerFactory {

	Customer customer = null;

	public Customer createCustomer() {
		if (customer == null) {
			customer = new Customer();
			customer.setCustomerId(7787);
			customer.setCustomerName("s kumar");
			customer.setCustomerSalary(67000);
		}
		return customer;
	}
}
