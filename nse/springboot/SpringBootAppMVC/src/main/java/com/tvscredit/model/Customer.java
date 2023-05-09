package com.tvscredit.model;

public class Customer {

	private int customerId;
	private String  customerName;
	private int customerAge;
	private float customerSalary;
	
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
	public int getCustomerAge() {
		return customerAge;
	}
	public void setCustomerAge(int customerAge) {
		this.customerAge = customerAge;
	}
	public float getCustomerSalary() {
		return customerSalary;
	}
	public void setCustomerSalary(float customerSalary) {
		this.customerSalary = customerSalary;
	}
}
