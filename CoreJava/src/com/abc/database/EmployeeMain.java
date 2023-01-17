package com.abc.database;

import java.sql.SQLException;
import java.util.Scanner;
import java.util.Set;
import com.abc.database.dao.EmployeeDao;
import com.abc.database.model.Employee;

public class EmployeeMain {

	public static void main(String[] args) {
		String choice = "y";
		Scanner sc = new Scanner(System.in);

		EmployeeDao dao = null;
		Employee employee;
		try {
			dao = new EmployeeDao();
		} catch (SQLException e) {
			System.err.println(e);
		}

		while (choice.equals("y")) {
			System.out.println("1. Add Employee");
			System.out.println("2. Remove Employee");
			System.out.println("3. Show All Employee");
			System.out.println("4. Search Employee");
			System.out.println("5. Update Employee");

			int operation = sc.nextInt();
			switch (operation) {
			case 1: {
				System.out.println("Enter id name and salary");
				employee = null;
				employee = new Employee();
				employee.setId(sc.nextInt());
				sc.nextLine();
				employee.setName(sc.nextLine());

				employee.setSalary(sc.nextFloat());

				try {
					if (dao.addEmployeeRecord(employee))
						System.out.println("Record Added");
					else
						System.out.println("Id already present");
				} catch (SQLException e) {
					System.err.println(e);

				}
				break;
			}
			case 2:{
				System.out.println("Enter id to remove ");
				try {
					if(dao.removeEmployeeRecord(sc.nextInt()))
						System.out.println("Record removed ");
					else 
						System.out.println("Record not found ");
						
				} catch (SQLException e) {
					e.printStackTrace();
				}
				break;
			}
			case 3: {

				Set<Employee> allEmployee = dao.getAllEmployee();
				try {
					dao.getAllFieldName();
				} catch (SQLException e) {
					e.printStackTrace();
				}

				for (Employee employee1 : allEmployee) {
					System.out.println(employee1.getId() + "\t" + employee1.getName() + "\t" + employee1.getSalary());
				}
				break;
			}
			case 4: {
				System.out.println("Enter id to search");
				try {
					//Employee searchEmployeeRecord = dao.searchEmployeeRecord(sc.nextInt());
					Employee searchEmployeeRecord = dao.searchEmployeeRecord1(sc.nextInt());
					if (searchEmployeeRecord == null)
						System.out.println("id not present in the database");
					else {
						System.out.println("Record found ");
						try {
							dao.getAllFieldName();
						} catch (SQLException e) {
							e.printStackTrace();
						}

						System.out.println(searchEmployeeRecord.getId() + "\t" + searchEmployeeRecord.getName() + "\t"
								+ searchEmployeeRecord.getSalary());
					}
				} catch (SQLException e) {
					System.err.println(e.getMessage());
				}
				break;
			}
			case 5:{
				//update operation
				System.out.println("Enter id name and salary");
				employee = null;
				employee = new Employee();
				employee.setId(sc.nextInt());
				sc.nextLine();
				employee.setName(sc.nextLine());
				employee.setSalary(sc.nextFloat());
               System.out.println("id "+employee.getId());
               System.out.println("name "+employee.getName());
               System.out.println("salary "+employee.getSalary());
				try {
					if(dao.updateEmployeeRecord(employee))
						System.out.println("Record updated");
					else 
						System.out.println("update problem id not present");
				} catch (SQLException e) {
					e.printStackTrace();
				}
				
				break;
				
			}
			default:
				System.out.println("invalid operation ");
			}
			System.out.println("Continue y\\n");
			choice = sc.next();
		}

	}
}
