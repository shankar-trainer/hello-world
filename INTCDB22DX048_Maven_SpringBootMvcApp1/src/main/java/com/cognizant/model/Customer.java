package com.cognizant.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:hello.properties")
//@ConfigurationProperties(value = "hello.properties")
public class Customer {

	@Value(value = "${customer.id}")
	private int customerId;
	
	@Value(value = "${customer.name}")
	private String customerName;

	@Value(value = "${customer.salary}")
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
