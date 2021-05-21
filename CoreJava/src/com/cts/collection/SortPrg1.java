package com.cts.collection;

import java.util.Arrays;

class Customer implements Comparable<Customer> {

	private int custId;
	private String custName;
	private float custSalary;

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

	public float getCustSalary() {
		return custSalary;
	}

	public void setCustSalary(float custSalary) {
		this.custSalary = custSalary;
	}

	@Override
	public String toString() {
		return "Customer Info \n custId=" + custId + ", custName=" + custName + ", custSalary=" + custSalary;
	}

	@Override
	public int compareTo(Customer o) {
		if (this.getCustId() > o.getCustId())
			return 1;
		else if (this.getCustId() < o.getCustId())
			return -1;
		// else if(this.getCustId()==o.getCustId())
		else
			return 0;

	}

}

public class SortPrg1 {

	public static void main(String[] args) {
		int id[] = { 1009, 1001, 1002 };
		String name[] = { "pankaj kumar", "harendra kumar", "amrendra kumar" };
		float salary[] = { 20000, 12000, 15000 };

		Customer customer[] = new Customer[3];

		for (int i = 0; i < customer.length; i++) {
			customer[i] = new Customer();
			customer[i].setCustId(id[i]);
			customer[i].setCustName(name[i]);
			customer[i].setCustSalary(salary[i]);
		}

		Arrays.sort(customer);
		for (int i = 0; i < customer.length; i++) {
			System.out.println(customer[i]);
		}

	}
}
