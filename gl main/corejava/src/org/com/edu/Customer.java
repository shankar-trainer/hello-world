package org.com.edu;

import java.util.Arrays;
import java.util.Comparator;

public class Customer // implements Comparable<Customer>
{

	int id;
	String name;

	/*
	 * @Override public int compareTo(Customer o) { int result = 0; if (o.id >
	 * this.id) result = 1; if (o.id < this.id) result = -1; if (o.id ==
	 * this.id) result = 0; return result; }
	 */

	public static void main(String[] args) {

		Customer customer[] = new Customer[3];
		int id1[] = { 1001, 1003, 100 };
		String name1[] = { "ram kumar", "arvind kumar", "pankaj kumar" };

		for (int i = 0; i < customer.length; i++) {
			customer[i] = new Customer();
			customer[i].id = id1[i];
			customer[i].name = name1[i];
		}

		Arrays.sort(customer, new Comparator<Customer>() {
			@Override
			public int compare(Customer o1, Customer o2) {
				return o1.name.compareTo(o2.name);
			}
		});
		System.out.println("sorted By name");
		System.out.println("\n");
		for (Customer cst : customer) {
			System.out.println(cst.id);
			System.out.println(cst.name);
		}

	}

}
