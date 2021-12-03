package com.cts.database;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import com.cts.database.model.Employee;

public class EmployeeMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("List of all employees");
			EmployeeDao dao = new EmployeeDao();

			List<Employee> allEmpployee = dao.getAllEmpployee();
			for (Employee employee : allEmpployee) {
				System.out.println(employee.getId() + " " + employee.getName() + " " + employee.getSalary() + " "
						+ employee.getLocation());
			}

			System.out.println("\nEnter id to search ");
			int id = sc.nextInt();
			Employee emp1 = dao.searchEmployee(id);
			if (emp1 != null) {
				System.out.println("found");
				System.out.println(
						emp1.getId() + "  " + emp1.getName() + " " + emp1.getSalary() + "  " + emp1.getLocation());
			} else
				System.out.println("Not found");

			System.out.println("Add Employee Operation");

			Employee emp = new Employee();

			System.out.println("Enter id ");
			emp.setId(sc.nextInt());

			System.out.println("Enter name ");
			sc.nextLine();
			emp.setName(sc.nextLine());

			System.out.println("Enter salary ");
			emp.setSalary(sc.nextFloat());

			System.out.println("Enter Location ");
			 emp.setLocation(sc.next());
			 
			 if(dao.addEmployee(emp))
				 System.out.println("Record added");
			 else
				 System.out.println("Employee id already exist");
			 

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
