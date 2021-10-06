package org.com.capgemini.pl;

import java.util.Scanner;

import org.com.capegemini.model.Employee;
import org.com.capegemini.service.EmployeeService;
import org.com.capegemini.service.EmployeeServiceImpl;

public class EmployeeMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String ch = "y";
		int op = 0;
		Employee emp = null;
		EmployeeService service = new EmployeeServiceImpl();

		while (ch.equalsIgnoreCase("y")) {
			System.out.println("1.Add Employee");
			System.out.println("2.Remove Employee");
			System.out.println("3.Search Employee");
			System.out.println("4.ShowAll Employee");
			System.out.println("5.Update Employee");
			op = sc.nextInt();
			switch (op) {

			case 1:
				emp = null;
				emp = new Employee();
				System.out.println("Enter  name and salary");
				//emp.setId(sc.nextInt());
				sc.nextLine();
				emp.setName(sc.nextLine());
				emp.setSalary(sc.nextFloat());
				service.saveEmployee(emp);
				break;
			case 2:
				emp = null;
				emp = new Employee();
				System.out.println("Enter id to remove");
				emp.setId(sc.nextInt());
				service.deleteEmployee(emp);

				break;
			case 3:

				System.out.println("Enter id to search");
				service.findEmployee(sc.nextInt());

				break;
			case 4:
				service.showAllEmployee();
				break;
			case 5:
				emp = null;
				emp = new Employee();
				System.out.println("Enter id name and salary");
				emp.setId(sc.nextInt());
				sc.nextLine();
				emp.setName(sc.nextLine());
				emp.setSalary(sc.nextFloat());
				service.changeEmployee(emp);
				break;
			default:
				System.out.println("wrong choice");

			}
			System.out.println("Continue y\\n");
			ch = sc.next();
		}
		System.exit(1);
	}

}
