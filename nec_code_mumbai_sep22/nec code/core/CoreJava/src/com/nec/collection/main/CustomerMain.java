package com.nec.collection.main;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

import com.nec.collection.dao.CustomerDaoImpl;
import com.nec.collection.model.Customer;

public class CustomerMain {

	public static void main(String[] args) {

		int id[] = { 1001, 1004, 1003, 1002 };

		String name[] = { "suresh kumar", "priyansh kumar", "javed akhtar", "salim khan" };
		float salary[] = { 23000, 90000, 78000, 67000 };

		// CustomerDao dao=new CustomerDaoImpl();

		CustomerDaoImpl dao = new CustomerDaoImpl();

		System.out.println("");

		Customer c;

		for (int i = 0; i < salary.length; i++) {
			c = new Customer();
			c.setId(id[i]);
			c.setName(name[i]);
			c.setSalary(salary[i]);
			dao.addCustomer(c);
		}

		System.out.println("All customer information");

		HashMap<Integer, Customer> allCustomer = dao.getAllCustomer();

		Collection<Customer> values = allCustomer.values();
		System.out.println("\tId\tName\tSalary");
		for (Customer customer : values) {
			System.out.println("\t" + customer.getId() + "\t" + customer.getName() + "\t" + customer.getSalary());
		}
		

		System.out.println("\nsearch method operation \n");
	  if(dao.searchCustomer(1001)==null)
		  System.out.println("customer not present with given id ");
	  else {
		  System.out.println("customer  present with given id ");
				  c=dao.searchCustomer(1001);
			System.out.println("\t" + c.getId() + "\t" + c.getName() + "\t" + c.getSalary());
	  }
	  

	}
}
