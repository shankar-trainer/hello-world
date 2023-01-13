package org.tvscreditserviceltd.model;

public class Customer {
	private int customerId;
	private String customerName;
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
	public float getCustomerSalary() {
		return customerSalary;
	}
	public void setCustomerSalary(float customerSalary) {
		this.customerSalary = customerSalary;
	}
}
