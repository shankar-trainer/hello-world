package com.coforge.main;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

import com.coforge.dao.CustomerDao;
import com.coforge.dao.CustomerDaoImpl;
import com.coforge.model.Customer;

public class CustomerMain2 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		CustomerDao dao = new CustomerDaoImpl();
		Customer customer;

		String ch = "y", dob;

		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

		while (ch.equals("y")) {
			System.out.println("1.Add Customer");
			System.out.println("2.Search Customer");
			System.out.println("3.List Of All Customer");
			System.out.println("4.Delete Customer");
			System.out.println("5.Update Customer");
			int key = scanner.nextInt();

			switch (key) {
			case 1:
				customer = null;
				customer = new Customer();
				System.out.println("Enter name salary and dob in dd-MM-yyyy format ");
				scanner.nextLine();
				customer.setCustomerName(scanner.nextLine());
				customer.setCustomerSalary(scanner.nextFloat());
				dob = scanner.next();
				LocalDate dob1 = LocalDate.parse(dob, dateTimeFormatter);
				customer.setCustomerDob(dob1);

				Customer addCustomer = dao.addCustomer(customer);
				if (addCustomer != null) {
					System.out.println("customer added");
				} else
					System.out.println("customer id already present");
				break;

			case 2:
				System.out.println("enter customer id");
				customer = null;
				customer = dao.searchCustomer(scanner.nextInt());
				if (customer == null)
					System.out.println("Record not found with id ");
				else
					System.out.println("Customer Found\n" + customer);
				break;
			case 3:
				System.out.println("all customer records ");
				if(dao.getAllCustomer().size()==0)
					System.out.println("customer list is empty");
				else
				dao.getAllCustomer().forEach(a->System.out.println(a));
//				Session session = new Configuration().configure().buildSessionFactory().openSession();
//
//				List<Customer> resultList = session.createNamedQuery("all").getResultList();
//
//				resultList.forEach(a -> System.out.println(a));

				break;

			case 4:
				System.out.println("enter customer id");
				customer = null;
				customer = dao.deleteCustomer(scanner.nextInt());
				if (customer == null)
					System.out.println("Record not found with id ");
				else
					System.out.println("Customer Deleted\n" + customer);
				break;

			case 5:
				customer = null;
				customer = new Customer();
				System.out.println("Enter id name salary and dob in dd-MM-yyyy format ");

				customer.setCustomerId(scanner.nextInt());

				scanner.nextLine();
				customer.setCustomerName(scanner.nextLine());
				customer.setCustomerSalary(scanner.nextFloat());
				dob = scanner.next();
				dob1 = null;
				dob1 = LocalDate.parse(dob, dateTimeFormatter);
				customer.setCustomerDob(dob1);

				Customer updateCustomer = dao.updateCustomer(customer);
				if (updateCustomer != null) {
					System.out.println("customer update");
				} else
					System.out.println("customer not present");
				break;

			default:
				System.out.println("Invalid Operation");
				break;
			}
			System.out.println("continue y\\n");
			ch = scanner.next();
		}
		scanner.close();
	}
}
