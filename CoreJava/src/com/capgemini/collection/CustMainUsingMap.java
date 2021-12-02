package com.capgemini.collection;

import java.util.TreeMap;
import java.util.TreeSet;

public class CustMainUsingMap {

	public static void main(String[] args) {
		Customer customer[] = new Customer[4];

		int id[] = { 675, 789, 1001, 901 };
		String name[] = { "upendra kumar", "bipin kumar", "ashok kumar", "suresh kumar" };
		float salary[] = { 45000, 34000, 80000, 12000 };

		TreeMap<Customer, Integer> map1 = new TreeMap<>(new CustomerSortById());
//		TreeMap<Integer, Customer> map1 = new TreeMap<>(new CustomerSortById());

		for (int i = 0; i < customer.length; i++) {
			customer[i] = new Customer();
			customer[i].setId(id[i]);
			customer[i].setName(name[i]);
			customer[i].setSalary(salary[i]);
			map1.put(customer[i], customer[i].getId());
		}

		for(Customer customer1:map1.keySet())
		{
		System.out.println(customer1.getId()+"  "+customer1.getName()+"  "+customer1.getSalary());	
		}
	}
}
