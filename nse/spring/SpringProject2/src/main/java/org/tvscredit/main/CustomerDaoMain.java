package org.tvscredit.main;

import java.util.Scanner;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.tvscredit.dao.CustomerDao;
import org.tvscredit.model.Customer;

public class CustomerDaoMain {

	public static void main(String[] args) {
		BeanFactory beanFactory = new ClassPathXmlApplicationContext("application.xml");
		CustomerDao dao = beanFactory.getBean("dao", CustomerDao.class);
		Scanner sc = new Scanner(System.in);
		System.out.println("Add Record operation");
		System.out.println("Enter Customer id name and salary ");
		Customer customer = null;
		customer = new Customer();
		customer.setCustId(sc.nextInt());
		sc.nextLine();
		customer.setCustName(sc.nextLine());
		customer.setCustSalary(sc.nextFloat());
		try {
			if (dao.saveCustomer(customer) == 1)
				System.out.println("customer record saved in database");
			else
				System.out.println("some problem");
		} catch (org.springframework.dao.DuplicateKeyException e) {
			System.err.println(e.getMessage());
		}
		System.out.println("\nSearch  Records operation");
		System.out.println("Enter Id");
		int id=sc.nextInt();
		if (dao.searchCustomer(id) == null)
			System.out.println("record not prsent ");
		else {
			System.out.println("record  found  ");
			customer = null;
			customer = dao.searchCustomer(id);
			System.out.println();
			System.out.println(customer.getCustId() + "\t" + customer.getCustName() + "\t" + customer.getCustSalary());
		}

		System.out.println("\nShow All Records operation");
		for (Customer c : dao.showAllCustomer())
			System.out.println(c.getCustId() + "\t" + c.getCustName() + "\t" + c.getCustSalary());
	}
}
