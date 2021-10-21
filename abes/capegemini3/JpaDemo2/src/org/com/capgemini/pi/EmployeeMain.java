package org.com.capgemini.pi;

import java.util.Scanner;

import org.com.capgemini.model.Employee;
import org.com.capgemini.service.EmployeeService;
import org.com.capgemini.service.EmployeeServiceImpl;

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
			default:
				System.out.println("wrong choice");

			}
			System.out.println("Continue y\\n");
			ch = sc.next();
		}
		System.exit(1);
	}

}
