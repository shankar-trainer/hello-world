package com.capgemini.collection;

import java.util.Comparator;
import java.util.TreeSet;

public class CustomerMain1 {

	static class SortById implements Comparator<Customer> {

		@Override
		public int compare(Customer o1, Customer o2) {
			return new Integer(o1.getId()).compareTo(new Integer(o2.getId()));
		}
	}

	public static void main(String[] args) {
		int id1[] = { 1003, 1001, 1002 };
		String nm[] = { "ashok kumar", "varun paratap", "akhilesh kumar" };
		float salary1[] = { 10000, 9000, 40000 };

		TreeSet<Customer> set=new TreeSet<>(new SortById());
		
		Customer customer[] = new Customer[3];
		for (int i = 0; i < customer.length; i++) {
			customer[i] = new Customer();
			customer[i].setId(id1[i]);
			customer[i].setName(nm[i]);
			customer[i].setSalary(salary1[i]);
			set.add(customer[i]);
		}
		
		System.out.println("After sorting  by id ");
		System.out.println();

		System.out.println("Id\tName\tSalary\n");
		for (Customer customer2 : set) {
			System.out.println(customer2.getId() + " " + customer2.getName() + "  " + customer2.getSalary());
		}
	}
}
