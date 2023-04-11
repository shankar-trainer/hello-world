package com.nec.io;

import java.io.Serializable;

public class Customer  implements Serializable{

	 private int customerId; 
	 private String customerName; 
	 private transient float customerSalary; 
	 private static String customerCountry="India";

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
	public String getCustomerCountry() {
		return customerCountry;
	}
	public void setCustomerCountry(String customerCountry) {
		this.customerCountry = customerCountry;
	} 
	 
	 
}
