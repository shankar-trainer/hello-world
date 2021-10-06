package org.com;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.com.dao.CustomerDao;
import org.com.dao.CustomerDaoImpl;
import org.com.model.Customer;

public class EmployeeMain2 {

	public static void main(String[] args) {

		CustomerDao dao = new CustomerDaoImpl();
		String ch = "y";
		Scanner scanner = new Scanner(System.in);

		Customer customer;

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
				if (dao.addCustomer(customer))
					System.out.println("customer added");
				else
					System.out.println("customer already present");
				break;
				
			
			case 2:
				customer = null;
				customer = new Customer();
				System.out.println("Enter Id ");
				customer.setId(scanner.nextInt());
				
				if (dao.removeCustomer(customer))
					System.out.println("customer removed");
				else
					System.out.println("customer not present");
				break;
			
			case 3:
				customer = null;
				customer = new Customer();
				System.out.println("Enter Id Name and Salary");
				customer.setId(scanner.nextInt());
				scanner.nextLine();
				customer.setName(scanner.nextLine());
				customer.setSalary(scanner.nextFloat());
				
				if (dao.updateCustomer(customer))
					System.out.println("customer updated");
				else
					System.out.println("customer not present");
				break;

			case 4:
				customer = null;
				customer = new Customer();
				System.out.println("Enter Id ");
				customer.setId(scanner.nextInt());
				if (dao.searchCustomer(customer)==null)
					System.out.println("customer not present");
				else
					System.out.println(dao.searchCustomer(customer));
				break;
			case 5:
				for(Customer cst:dao.showAllCustomer())
					System.out.println(cst);
              break;
			default:
				System.out.println("wrong choice ");
				break;
			}
			System.out.println("Continue again y\\n");
			ch=scanner.next();
		}

	}
}
