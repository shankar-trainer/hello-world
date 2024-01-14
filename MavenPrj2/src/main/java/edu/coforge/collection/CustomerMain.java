package edu.coforge.collection;

import java.util.Arrays;

public class CustomerMain {

	public static void main(String[] args) {
		
		Customer customer[]=new Customer[4];
		
		int id[]= {10002,10001,10003,10007,1006};
		String nm[]= {"suman kumar","aman kumar","ram kumar","anil kumar",	"sunil kumar"};
		float sal[]= {20000,34000,90000,12000,45000};
		
		for (int i = 0; i < customer.length; i++) {
			customer[i]=new Customer(id[i], nm[i], sal[i]);
		}
		
		
		Arrays.sort(customer);
		//java.lang.ClassCastException: class edu.coforge.collection.Customer cannot be
		//cast to class java.lang.Comparable
		
		for (Customer  c : customer) {
			System.out.println(c);
		}
	}
}
