package com.cts.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CustomerMain {

	public static void main(String[] args) {
		Customer customer[] = new Customer[3];
		customer[0] = new Customer(1004, "pravin kumar", 12000);
		customer[1] = new Customer(1001, "sharad kumar", 11000);
		customer[2] = new Customer(1003, "susheel kumar", 18000);

		Arrays.sort(customer);
		// n.Customer cannot be cast to java.lang.Comparable
		for (Customer customer2 : customer) {
			System.out.println(customer2.getCustomerId() + "  " + customer2.getCustomerName() + " "
					+ customer2.getCustomerSalary());
		}

		ArrayList<Customer> list1 = new ArrayList<Customer>();

		list1.add(customer[0]);
		list1.add(customer[1]);
		list1.add(customer[2]);

		Collections.sort(list1);
		System.out.println("\n using arrayList \n");

		for (Customer customer2 : list1) {
			System.out.println(customer2.getCustomerId() + "  " + customer2.getCustomerName() + " "
					+ customer2.getCustomerSalary());
		}

	}
}
