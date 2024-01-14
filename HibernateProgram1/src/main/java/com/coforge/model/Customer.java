package com.coforge.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@NamedQueries({ @NamedQuery(name = "all", query = "from Customer") })

@Entity
@Table(name = "customer1")
public class Customer {

	@Id
	@GeneratedValue

	@Column(name = "id")
	private int customerId;

	@Column(name = "name", length = 30, nullable = false)
	private String customerName;

	@Column(name = "salary", nullable = false)
	private float customerSalary;

	@Column(name = "dob", nullable = false)
	private LocalDate customerDob;

	public LocalDate getCustomerDob() {
		return customerDob;
	}

	public void setCustomerDob(LocalDate customerDob) {
		this.customerDob = customerDob;
	}

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

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", customerSalary="
				+ customerSalary + ", customerDob=" + customerDob + "]";
	}

}
