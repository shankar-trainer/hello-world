package com.cognizant;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cognizant.dao.EmployeeDao;
import com.cognizant.dao.EmployeeDaoImpl;
import com.cognizant.model.Employee;

public class EmployeeMain {

	public static void main(String[] args) {

		ApplicationContext ctx = new ClassPathXmlApplicationContext("application.xml");

		EmployeeDao dao = ctx.getBean("dao", EmployeeDaoImpl.class);

		System.out.println("all records ");

		for (Employee emp : dao.showAllEmployee())
			System.out.println(emp.getId() + "\t" + emp.getName() + "\t" + emp.getSalary());

		Scanner sc = new Scanner(System.in);

		Employee emp = new Employee();
		System.out.println("Add Record");
		System.out.println("Enter Id name and salary");

		emp.setId(sc.nextInt());
		sc.nextLine();
		emp.setName(sc.nextLine());
		emp.setSalary(sc.nextFloat());

		if (dao.addEmployee(emp))
			System.out.println("Record added");
		else
			System.out.println("some problem in adding");

		System.out.println("Remove Record");
		System.out.println("Enter Id");
		int id = sc.nextInt();

		if (dao.removeEmployee(id))
			System.out.println("Record  removed");
		else
			System.out.println("Record  not found");

		System.out.println("Serach  Record");
		System.out.println("Enter Id");
		id = sc.nextInt();
		emp = null;
		emp = dao.searchEmployee(id);
		if (emp == null)
			System.out.println("Record  not found");
		else {
			System.out.println("Record  Found ");
			System.out.println(emp.getId() + "\t" + emp.getName() + "\t" + emp.getSalary());
		}

	}
}
