package com.coforge.main;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import com.coforge.dao.EmployeeDao;
import com.coforge.model.Employee;

public class EmployeeMain1 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		EmployeeDao dao = new EmployeeDao();

		String ch = "y";
		Employee employee;

		while (ch.equalsIgnoreCase("y")) {
			System.out.println("1. Add Employee");
			System.out.println("2. Search Employee");
			System.out.println("3. Delete Employee");
			System.out.println("4. Show All Employee");
			System.out.println("5. Update Employee");

			int key = scanner.nextInt();
			switch (key) {
			case 1: {
				employee = null;
				employee = new Employee();
				System.out.println("Enter name");
				scanner.nextLine();
				employee.setName(scanner.nextLine());
				System.out.println("Enter dob in dd-MM-yyyy");
				String s = scanner.next();
				DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
				LocalDate localDate = LocalDate.parse(s, dateTimeFormatter);
				employee.setDob(localDate);
				System.out.println("Enter salary");
				employee.setSalary(scanner.nextFloat());

				if (dao.addEmployee(employee))
					System.out.println("Record added");
				else
					System.out.println("id already present");
				break;
			}
			case 2: {
				System.out.println("Enter id");

				Employee searchEmployee = dao.searchEmployee(scanner.nextInt());
				System.out.println("search emp "+searchEmployee);
				if (searchEmployee == null)
					System.out.println("employee not present with the given id ");
				else {
					System.out.println("employee found ");
					System.out.println(searchEmployee.getId() + "\t" + searchEmployee.getName() + "\t"
							+ searchEmployee.getSalary() + "\t" + searchEmployee.getDob());
				}

				break;
			}
			case 3: {
				System.out.println("Enter id");

				boolean status = dao.deleteEmployee(scanner.nextInt());
				if (status)
					System.out.println("employee deleted ");
				else {
					System.out.println("employee not found ");
				}
				break;
			}
			case 4: {
				dao.getAllEmployee().forEach(emp -> System.out
						.println(emp.getId() + "\t" + emp.getName() + "\t" + emp.getSalary() + "\t" + emp.getDob()));
				break;
			}
			case 5: {
				employee = null;
				employee = new Employee();
				System.out.println("Enter id");
				employee.setId(scanner.nextInt());

				System.out.println("Enter name");
				scanner.nextLine();
				employee.setName(scanner.nextLine());
				System.out.println("Enter dob in dd-MM-yyyy");
				String s = scanner.next();
				DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
				LocalDate localDate = LocalDate.parse(s, dateTimeFormatter);
				employee.setDob(localDate);
				System.out.println("Enter salary");
				employee.setSalary(scanner.nextFloat());

				if (dao.updateEmployee(employee))
					System.out.println("Record updated");
				else
					System.out.println("id not present");
				break;
			}
			default:
				System.out.println("wrong operation");
			}
			System.out.println("continue y\\n");
			ch = scanner.next();
		}
		scanner.close();
	}

}
