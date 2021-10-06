package org.com;

import java.util.Scanner;

import org.com.config.AppConfig;
import org.com.dto.Customer;
import org.com.exception.CustomerException;
import org.com.service.CustomerService;
import org.com.service.CustomerServiceImpl;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App2 {
	public static void main(String[] args) {

		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);

		CustomerService dao = ctx.getBean(CustomerServiceImpl.class);

		Scanner scanner = new Scanner(System.in);

		Customer customer;
		try {
			String ch = "y";

			while (ch.equals("y")) {

				System.out.println("1.Add Customer");
				System.out.println("2.Remove Customer");
				System.out.println("3.Update Customer");
				System.out.println("4.Search Customer");
				System.out.println("5.Show All Customer");

				int op = scanner.nextInt();

				switch (op) {
				case 1:
					customer = null;
					customer = new Customer();
					System.out.println("Enter name and salary");
					scanner.nextLine();

					customer.setName(scanner.nextLine());
					customer.setSalary(scanner.nextFloat());
					dao.saveCustomer(customer);

					break;

				case 2:
					customer = null;
					customer = new Customer();
					System.out.println("Enter Id ");
					customer.setId(scanner.nextInt());

					dao.deleteCustomer(customer);
					break;

				case 3:
					customer = null;
					customer = new Customer();
					System.out.println("Enter Id Name and Salary");
					customer.setId(scanner.nextInt());
					scanner.nextLine();
					customer.setName(scanner.nextLine());
					customer.setSalary(scanner.nextFloat());

					dao.changeCustomer(customer);
					break;

				case 4:
					customer = null;
					customer = new Customer();
					System.out.println("Enter Id ");
					customer.setId(scanner.nextInt());
					dao.findCustomer(customer);
					break;
				case 5:
					dao.getAllCustomer();
					break;
				default:
					System.out.println("wrong choice ");
					break;
				}
				System.out.println("Continue again y\\n");
				ch = scanner.next();
			}
		} catch (CustomerException e) {
			System.err.println(e.getMessage());
		}
		System.exit(1);
	}

}
