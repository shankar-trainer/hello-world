package com.cts.main;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cts.dao.CustomerDao;
import com.cts.dao.CustomerDaoImpl;
import com.cts.model.Customer;

public class CustomerMain {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("application.xml");
		CustomerDao dao = ctx.getBean("dao", CustomerDaoImpl.class);

		Scanner sc = new Scanner(System.in);

		Customer customer;

		System.out.println("Enter id name and salary of customer");
		customer = new Customer();
		customer.setId(sc.nextInt());
		sc.nextLine();
		customer.setName(sc.nextLine());
		customer.setSalary(sc.nextFloat());

		if (dao.addCustomer(customer))
			System.out.println("Record Added");
		else
			System.out.println("Record already present");

		System.out.println("all customer list");

		for (Customer c : dao.getAllCustomer())
			System.out.println(c.getId() + "\t" + c.getName() + "\t" + c.getSalary());

		System.out.println("search customer");
		System.out.println("Enter Id to search");
		int id = sc.nextInt();

		Customer searchCustomer = dao.searchCustomer(id);
		if (searchCustomer == null)
			System.out.println("customer not present with id " + id);
		else {
			System.out.println("Customer Found ");
			System.out.println(
					searchCustomer.getId() + "\t" + searchCustomer.getName() + "\t" + searchCustomer.getSalary());
		}
	}
}
