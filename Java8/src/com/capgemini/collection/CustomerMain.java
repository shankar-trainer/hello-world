package com.capgemini.collection;

import java.util.Arrays;
import java.util.Comparator;

public class CustomerMain {

	static class SortById implements Comparator<Customer> {

		@Override
		public int compare(Customer o1, Customer o2) {
			/*
			 * if (o1.getId() < o2.getId()) return -1;
			 * 
			 * else if (o1.getId() > o2.getId()) return 1; else return 0;
			 */
			return new Integer(o1.getId()).compareTo(new Integer(o2.getId()));
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

		Comparator<Customer> comparator = new Comparator<Customer>() {

			@Override
			public int compare(Customer o1, Customer o2) {

				return o1.getName().compareTo(o2.getName());
			}
		};

		Arrays.sort(customer, comparator);

		System.out.println("\nAfter sorting  by name ");
		System.out.println();

		System.out.println("Id\tName\tSalary\n");
		for (Customer customer2 : customer) {
			System.out.println(customer2.getId() + " " + customer2.getName() + "  " + customer2.getSalary());
		}

		Comparator<Customer> comparator1 = new Comparator<Customer>() {

			@Override
			public int compare(Customer o1, Customer o2) {

				//return new Float(o1.getSalary()).compareTo(new Float(o2.getSalary()));
				return Float.valueOf(o1.getSalary()).compareTo(Float.valueOf(o2.getSalary()));
			}
		};

		// Arrays.sort(customer, comparator1);
		Arrays.sort(customer, new Comparator<Customer>() {
			@Override
			public int compare(Customer o1, Customer o2) {
				//return new Float(o1.getSalary()).compareTo(new Float(o2.getSalary()));
				return Float.valueOf(o1.getSalary()).compareTo(Float.valueOf(o2.getSalary()));
			}
		});

		System.out.println("\nAfter sorting  by salary ");
		System.out.println();

		System.out.println("Id\tName\tSalary\n");
		for (Customer customer2 : customer) {
			System.out.println(customer2.getId() + " " + customer2.getName() + "  " + customer2.getSalary());
		}

	}
}
