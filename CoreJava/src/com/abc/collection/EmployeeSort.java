package com.abc.collection;

import java.util.Arrays;

import com.abc.collection.bean.Employee;

public class EmployeeSort {

	  static void displayEmployee(Employee employee[]) {
		  for (Employee employee2 : employee) {
			System.out.println(employee2.getEmpId()+"\t"+employee2.getEmpName()+"\t"+employee2.getEmpSalary());
		}
	  }
	
	public static void main(String[] args) {
		Employee employee[] = new Employee[3];

		int id[] = { 10002, 10001, 10003 };
		String name[] = { "amit kumar", "lalan kumar", "bablu kumar" };
		float salary[] = { 23000, 12000, 45000 };

		for (int i = 0; i < employee.length; i++) {
			employee[i] = new Employee();
			employee[i].setEmpId(id[i]);
			employee[i].setEmpName(name[i]);
			employee[i].setEmpSalary(salary[i]);
		}
     displayEmployee(employee);
     
     Arrays.sort(employee);
     
     System.out.println("after sorting by id ");
     
     displayEmployee(employee);


	}
}
