package com.abc.collection.main;

import java.util.Arrays;
import java.util.Comparator;

import com.abc.collection.bean.Customer;

class SortByName implements Comparator<Customer> {
	@Override
	public int compare(Customer o1, Customer o2) {
		return o1.getName().compareTo(o2.getName());
	}
}

class SortById implements Comparator<Customer> {
	@Override
	public int compare(Customer o1, Customer o2) {
		return new Integer(o1.getId()).compareTo(new Integer(o2.getId()));
	}
}

class SortBySalary implements Comparator<Customer> {
	@Override
	public int compare(Customer o1, Customer o2) {
		return Float.valueOf(o1.getSalary()).compareTo(Float.valueOf(o2.getSalary()));
	}
}

public class CustomerSorting {

	public static void displayCustomer(Customer cs[]) {

		for (Customer customer : cs)
			System.out.println("\t" + customer);
	}

	public static void main(String[] args) {
		int id[] = { 10002, 10001, 10003 };
		String name[] = { "amit kumar", "lalan kumar", "bablu kumar" };
		float salary[] = { 23000, 12000, 45000 };

		Customer customer[] = new Customer[3];

		for (int i = 0; i < customer.length; i++) {
			customer[i] = new Customer();
			customer[i].setId(id[i]);
			customer[i].setName(name[i]);
			customer[i].setSalary(salary[i]);
		}

		System.out.println("Unsorted Customer Data");
		displayCustomer(customer);

		System.out.println("\nSorted By Id Customer Data\n");
		Arrays.sort(customer, new SortById());
		displayCustomer(customer);

		System.out.println("\nSorted By Name Customer Data\n");
		Arrays.sort(customer, new SortByName());
		displayCustomer(customer);

		System.out.println("\nSorted By Salary Customer Data\n");
		Arrays.sort(customer, new SortBySalary());
		displayCustomer(customer);

	}

}
