package com.cts.collection;

public class Customer  implements Comparable<Customer>{

	private int customerId;
	private String customerName;
	private float customerSalary;

	public Customer(int customerId, String customerName, float customerSalary) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerSalary = customerSalary;
	}

	public int getCustomerId() {
		return customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public float getCustomerSalary() {
		return customerSalary;
	}

	@Override
	public int compareTo(Customer o) {
		if(this.customerId>o.customerId)
		return -1;
		
		else if(this.customerId<o.customerId)
			return 1;
		else 
			return 0;
	}

}
