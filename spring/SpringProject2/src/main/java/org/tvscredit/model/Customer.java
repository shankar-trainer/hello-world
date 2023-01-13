package org.tvscredit.model;

import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class Customer {
	private int custId;
	private String custName;
	private float custSalary;
	
	public float getCustSalary() {
		return custSalary;
	}

	public void setCustSalary(float custSalary) {
		this.custSalary = custSalary;
	}


	public int getCustId() {
		return custId;
	}

	public void setCustId(int custId) {
		this.custId = custId;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

}
