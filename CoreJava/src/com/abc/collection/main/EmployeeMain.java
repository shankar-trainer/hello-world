package com.abc.collection.main;

import java.util.Iterator;

import com.abc.collection.bean.Employee;
import com.abc.collection.dao.EmployeeDao;

public class EmployeeMain {

	public static void main(String[] args) {

		EmployeeDao dao = new EmployeeDao();

		Employee employee[] = new Employee[3];

		int id[] = { 10001, 10002, 10003 };
		String name[] = { "amit kumar", "lalan kumar", "bablu kumar" };
		float salary[] = { 23000, 12000, 45000 };

		for (int i = 0; i < employee.length; i++) {
			employee[i] = new Employee();
			employee[i].setEmpId(id[i]);
			employee[i].setEmpName(name[i]);
			employee[i].setEmpSalary(salary[i]);

			dao.addEmployee(employee[i]);
		}

		System.out.println("show all employee operation");
		System.out.println("\nEmployee Information");
		for (Employee emp : employee) {
			System.out.println("\t" + emp.getEmpId() + "\t" + emp.getEmpName() + "\t" + emp.getEmpSalary());
		}
		
		employee[1].setEmpName("pawan kumar");
		employee[1].setEmpSalary(50000);
		
		if(dao.updateEmployeeById(employee[1]))
			System.out.println("found and updated");
		else 
			System.out.println("not found ");
		
		
		System.out.println("show all employee operation after update");
		System.out.println("\nEmployee Information");
		for (Employee emp : employee) {
			System.out.println("\t" + emp.getEmpId() + "\t" + emp.getEmpName() + "\t" + emp.getEmpSalary());
		}
		
		
		
		System.out.println("Employee search ");
		
		Employee searchEmployee = dao.searchEmployee(employee[0]);
		
		if(searchEmployee!=null) {
			System.out.println("Employee found");
			System.out.println(searchEmployee.getEmpId()+"\t"+searchEmployee.getEmpName()+"\t"+searchEmployee.getEmpSalary());
		}
		
      
	}
}
