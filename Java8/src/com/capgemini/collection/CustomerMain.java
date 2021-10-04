package com.capgemini.collection;

import java.util.Arrays;
import java.util.Comparator;

public class CustomerMain {

	static class SortById implements Comparator<Customer> {

		@Override
		public int compare(Customer o1, Customer o2) {
			if (o1.getId() < o2.getId())
				return -1;

			else if (o1.getId() > o2.getId())
				return 1;
			else
				return 0;
		}
	}

	public static void main(String[] args) {
		int id1[] = { 1003, 1001, 1002 };
		String nm[] = { "ashok kumar", "varun paratap", "akhilesh kumar" };
		float salary1[] = { 10000, 9000, 40000 };

		Customer customer[] = new Customer[3];
		for (int i = 0; i < customer.length; i++) {
			customer[i] = new Customer();
			customer[i].setId(id1[i]);
			customer[i].setName(nm[i]);

			customer[i].setSalary(salary1[i]);
		}

		Arrays.sort(customer, new SortById());

		System.out.println("After sorting  by id ");
		System.out.println();

		System.out.println("Id\tName\tSalary\n");
		for (Customer customer2 : customer) {
			System.out.println(customer2.getId() + " " + customer2.getName() + "  " + customer2.getSalary());
		}
	}
}
