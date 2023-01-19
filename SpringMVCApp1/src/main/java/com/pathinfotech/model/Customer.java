package com.pathinfotech.model;

public class Customer {

	private int CustomerId;
	private  String  CustomerName;
	private  float CustomerSalary;

	public int getCustomerId() {
		return CustomerId;
	}
	public void setCustomerId(int customerId) {
		CustomerId = customerId;
	}
	public String getCustomerName() {
		return CustomerName;
	}
	public void setCustomerName(String customerName) {
		CustomerName = customerName;
	}
	public float getCustomerSalary() {
		return CustomerSalary;
	}
	public void setCustomerSalary(float customerSalary) {
		CustomerSalary = customerSalary;
	}
	
}
