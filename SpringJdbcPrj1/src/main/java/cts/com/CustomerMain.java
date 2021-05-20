package cts.com;

import java.sql.SQLIntegrityConstraintViolationException;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.dao.DuplicateKeyException;

import cts.com.dao.CustomerDao;
import cts.com.model.Customer;

public class CustomerMain {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		CustomerDao dao = ctx.getBean("dao", CustomerDao.class);

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter id name and location");

		Customer customer = new Customer();
		customer.setCustomerId(scanner.nextInt());
		scanner.nextLine();
		customer.setCustomerName(scanner.nextLine());
		customer.setCustomerLocation(scanner.next());

		try {
			int res = dao.addCustomer(customer);

			System.out.println(res + "  Record added ");
		}

		catch (SQLIntegrityConstraintViolationException | DuplicateKeyException e) {
			System.out.println(e.getMessage());
		}

		dao.getAllCustomer().forEach(a -> System.out
				.println(a.getCustomerId() + " " + a.getCustomerName() + "  " + a.getCustomerLocation()));

		customer = null;
		customer = new Customer();

		System.out.println("Enter id to search");

		customer.setCustomerId(scanner.nextInt());
		Customer searchCustomer = dao.searchCustomer(customer);
		if (searchCustomer == null)
			System.out.println("customer not present");
		else {
			System.out.println("found with given values");
			System.out.println(searchCustomer.getCustomerId() + "  " + searchCustomer.getCustomerName() + "  "
					+ searchCustomer.getCustomerLocation());
		}
		System.out.println("Enter id to delete");

		customer.setCustomerId(scanner.nextInt());
		int res = dao.deleteCustomer(customer);
		if (res == 0)
			System.out.println("customer not present");
		else {
			System.out.println("customer deleted");
		}

		System.out.println("customer update code ");

		System.out.println("Enter id name and location");

		customer = new Customer();
		customer.setCustomerId(scanner.nextInt());
		scanner.nextLine();
		customer.setCustomerName(scanner.nextLine());
		customer.setCustomerLocation(scanner.next());

		res = dao.updateCustomer(customer);
		if (res == 0)
			System.out.println("customer not present");
		else
			System.out.println("customer updated");
		scanner.close();
	}
}
