package com.capgemini.collection;

import java.util.Arrays;
import java.util.Comparator;

class CustomerSortById implements Comparator<Customer>{

	@Override
	public int compare(Customer o1, Customer o2) {
		/*if(o1.getId()<o2.getId())
			return -1;
		else if(o1.getId()>o2.getId())
			return 1;
		else
		return 0;
		*/
		return new Integer(o1.getId()).compareTo(new Integer(o2.getId()));
	}
	
}
class CustomerSortByName implements Comparator<Customer>{
	
	@Override
	public int compare(Customer o1, Customer o2) {
		return  o1.getName().compareTo(o2.getName());
	}
	
}
public class CustomerMain {

	static void display(Customer cust[]) {
		System.out.println("\n====================");
		System.out.println("Id\tname\tsalary\n");
		for (Customer customer : cust) {
			System.out.println(customer.getId() + " " + customer.getName() + "  " + customer.getSalary());
		}
	}

	public static void main(String[] args) {

		int id1[] = { 1002, 1001, 1003 };
		float salary1[] = { 30000, 15000, 20000 };
		String nm[] = { "suresh kumar", "amit verma", "priyashu kumar" };

		Customer customer[] = new Customer[3];

		for (int i = 0; i < customer.length; i++) {
			customer[i] = new Customer();
			customer[i].setId(id1[i]);
			customer[i].setName(nm[i]);
			customer[i].setSalary(salary1[i]);
		}
		System.out.println("Unsorted Customer Records ");
		display(customer);
		
		Arrays.sort(customer,new CustomerSortById());
		System.out.println("\nSorted Customer Records  by Id");
		display(customer);
		
		Arrays.sort(customer,new CustomerSortByName());
		System.out.println("\nSorted Customer Records  by Name");
		display(customer);

	}
}
