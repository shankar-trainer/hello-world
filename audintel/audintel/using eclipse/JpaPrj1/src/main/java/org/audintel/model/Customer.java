package org.audintel.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "customer1")
public class Customer {
    @Id 
    @Column(name = "Id",nullable = false)
	private int customerId;
	
    @Column(name = "name", length = 30, nullable = false)
    private String customerName;

    @Column(name = "salary", length = 10, nullable = false)
	private  float  customerSalary;
	
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
