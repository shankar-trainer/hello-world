package com.capgemini.collection;

import java.util.Arrays;
import java.util.Comparator;

class CustomerSortById implements Comparator<Customer> {
	@Override
	public int compare(Customer o1, Customer o2) {
		/*
		 * if (o1.getId() > o2.getId()) return 1; if (o1.getId() < o2.getId()) return
		 * -1; else return 0;
		 */
		return new Integer(o1.getId()).compareTo(new Integer(o2.getId()));
	}
}

class CustomerSortByName implements Comparator<Customer> {
	@Override
	public int compare(Customer o1, Customer o2) {
		return o1.getName().compareTo(o2.getName());
	}
}
class CustomerSortBySalary implements Comparator<Customer> {
	@Override
	public int compare(Customer o1, Customer o2) {
		return new Float(o1.getSalary()).compareTo(new Float(o2.getSalary()));
	}
}

public class CustomerMain {

	public static void main(String[] args) {
		Customer customer[] = new Customer[4];

		int id[] = { 675, 789, 1001, 901 };
		String name[] = { "upendra kumar", "bipin kumar", "ashok kumar", "suresh kumar" };
		float salary[] = { 45000, 34000, 80000, 12000 };

		for (int i = 0; i < customer.length; i++) {
			customer[i] = new Customer();
			customer[i].setId(id[i]);
			customer[i].setName(name[i]);
			customer[i].setSalary(salary[i]);
		}

		Arrays.sort(customer, new CustomerSortById());
		System.out.println("sorted by id ");
		for (Customer c : customer) {
			System.out.println(c.getId() + "  " + c.getName() + "  " + c.getSalary());
		}

		Arrays.sort(customer, new CustomerSortByName());
		System.out.println("sorted by name ");
		for (Customer c : customer) {
			System.out.println(c.getId() + "  " + c.getName() + "  " + c.getSalary());
		}

		Arrays.sort(customer, new CustomerSortBySalary());
		System.out.println("sorted by salary ");
		for (Customer c : customer) {
			System.out.println(c.getId() + "  " + c.getName() + "  " + c.getSalary());
		}

	}
}
