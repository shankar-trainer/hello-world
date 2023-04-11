package com.audintel.collection.layered.presentation;

import java.util.Map.Entry;
import java.util.Scanner;

import com.audintel.collection.layered.dao.EmployeeDao;
import com.audintel.collection.layered.dao.EmployeeDaoImpl;
import com.audintel.collection.layered.domain.Employee;
import com.audintel.collection.layered.exception.EmployeeException;

public class EmployeeMain {

	public static void main(String[] args) {

		String ch = "y";
		Scanner sc = new Scanner(System.in);
		EmployeeDao dao = new EmployeeDaoImpl();
		Employee employee;
		do {
			System.out.println("1.Add Employee");
			System.out.println("2.Show All Employee");
			System.out.println("3.Search Employee");
			System.out.println("4.Remove Employee");
			System.out.println("5.Update Employee");
			int op = sc.nextInt();

			switch (op) {
			case 1:
				System.out.println("employee add operation");
				employee = null;
				employee = new Employee();
				System.out.println("Enter id name and salary");
				employee.setEmpId(sc.nextInt());
				sc.nextLine();
				employee.setEmpName(sc.nextLine());
				employee.setEmpsalary(sc.nextFloat());

				try {
					dao.addEmployee(employee);
					System.out.println("employee added");
					
				} catch (EmployeeException e) {
					System.err.println(e.getMessage());
				}
				break;

			case 2:
				System.out.println("show all employee operation");
				try {
					for (Entry<Integer, Employee> entry : dao.getAllEmployee().entrySet()) {
						employee = null;
						employee = entry.getValue();
						System.out.println(
								employee.getEmpId() + "\t" + employee.getEmpName() + "\t" + employee.getEmpsalary());
					}
				} catch (EmployeeException e) {
					System.err.println(e.getMessage());

				}
				break;

			case 3:
				System.out.println("search employee operation");
				employee = null;
				System.out.println("Enter id ");
				try {
					employee = dao.searchEmployee(sc.nextInt());
					System.out.println("employee found");
					System.out.println(
							employee.getEmpId() + "\t" + employee.getEmpName() + "\t" + employee.getEmpsalary());
				} catch (EmployeeException e) {
					System.err.println(e.getMessage());
				}
				break;

			case 4:
				System.out.println("delete employee operation");
				employee = null;
				System.out.println("Enter id ");
				try {
					employee = dao.deleteEmployee(sc.nextInt());
					System.out.println("employee deleted");
					System.out.println(
							employee.getEmpId() + "\t" + employee.getEmpName() + "\t" + employee.getEmpsalary());
				} catch (EmployeeException e) {
					System.err.println(e.getMessage());
				}

				break;

			case 5:
				System.out.println("update employee operation");

				employee = null;
				employee = new Employee();
				System.out.println("Enter id name and salary");
				employee.setEmpId(sc.nextInt());
				sc.nextLine();
				employee.setEmpName(sc.nextLine());
				employee.setEmpsalary(sc.nextFloat());

				try {
                   Employee employee1 = dao.updateEmployee(employee);
					System.out.println("employee updated");
					System.out.println(
							employee1.getEmpId() + "\t" + employee1.getEmpName() + "\t" + employee1.getEmpsalary());
				} catch (EmployeeException e) {
					System.err.println(e.getMessage());
				}
				break;

			default:
				System.out.println("invalid operation try again");
			}
			System.out.println("continue y or n");
			ch = sc.next();
		} while (ch.equals("y"));
	}
}
