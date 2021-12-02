package com.capgemini.collection;

import java.util.TreeSet;


public class CustomerMainByTreeSet {

	public static void main(String[] args) {
		Customer customer[] = new Customer[4];

		int id[] = { 675, 789, 1001, 901 };
		String name[] = { "upendra kumar", "bipin kumar", "ashok kumar", "suresh kumar" };
		float salary[] = { 45000, 34000, 80000, 12000 };

		TreeSet<Customer> treeset=new TreeSet<>(new CustomerSortById());
		
		for (int i = 0; i < customer.length; i++) {
			customer[i] = new Customer();
			customer[i].setId(id[i]);
			customer[i].setName(name[i]);
			customer[i].setSalary(salary[i]);
			treeset.add(customer[i]);
		}

		for(Customer c:treeset) {
			System.out.println(c.getId()+"  "+c.getName()+" "+c.getName());
		}
		
	}
}
