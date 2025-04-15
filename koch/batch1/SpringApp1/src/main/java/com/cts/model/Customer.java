package com.cts.model;

public class Customer {

	private int customerId;
	private String customerName;
	private float customerSalary;
	
	// Customer has Address 
	
	private Address address;
	
	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", customerSalary="
				+ customerSalary + ", address=" + address + "]";
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
	
//
//	@Override
//	public String toString() {
//		//return super.toString();
//		return "Id is "+getCustomerId()+"\nname"+getCustomerName()+"\nsalary "+getCustomerSalary();
//	}
	
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public float getCustomerSalary() {
		return customerSalary;
	}
	public void setCustomerSalary(float customerSalary) {
		this.customerSalary = customerSalary;
	}
	
	
}
