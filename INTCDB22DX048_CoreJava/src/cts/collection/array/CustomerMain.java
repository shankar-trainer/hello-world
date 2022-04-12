package cts.collection.array;

import java.util.Arrays;
import java.util.Comparator;

import cts.collection.model.Customer;

class CustomerSortByName implements Comparator<Customer> {
	@Override
	public int compare(Customer o1, Customer o2) {
		return o1.getName().compareTo(o2.getName());
	}
}

class CustomerSortById implements Comparator<Customer> {
	@Override
	public int compare(Customer o1, Customer o2) {
		return Integer.valueOf(o1.getId()).compareTo(Integer.valueOf(o2.getId()));
	}
}

class CustomerSortBySalary implements Comparator<Customer> {
	@Override
	public int compare(Customer o1, Customer o2) {
		return o1.getName().compareTo(o2.getName());
	}
}

public class CustomerMain {

	public static void display(Customer cc[]) {
		for (Customer c : cc)
			System.out.println(c.getId() + "\t" + c.getName() + "\t" + c.getSalary());
	}

	public static void main(String[] args) {

		Customer customer[] = new Customer[3];

		int id1[] = { 1003, 1001, 1002 };
		float salary1[] = { 90000, 23000, 34000 };
		String nm[] = { "bhabesh kumar", "amitesh kumar", "chandrasekhar prasad" };

		for (int x = 0; x < customer.length; x++) {
			customer[x] = new Customer();
			customer[x].setId(id1[x]);
			customer[x].setName(nm[x]);
			customer[x].setSalary(salary1[x]);
		}

		System.out.println("before  sorting  \n ");

		display(customer);

		Arrays.sort(customer, new CustomerSortByName());

		System.out.println("after sorting  by name \n");
		display(customer);

		Arrays.sort(customer, new CustomerSortById());

		System.out.println("after sorting  by id \n");
		display(customer);
	}

}
