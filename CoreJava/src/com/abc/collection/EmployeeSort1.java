package com.abc.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.abc.collection.bean.Employee;

public class EmployeeSort1 {

	  static void displayEmployee(Employee employee[]) {
		  for (Employee employee2 : employee) {
			System.out.println(employee2.getEmpId()+"\t"+employee2.getEmpName()+"\t"+employee2.getEmpSalary());
		}
	  }
	  
	  static void displayEmployee1(List<Employee> empList) {
		  for (Employee employee2 : empList) {
			  System.out.println(employee2.getEmpId()+"\t"+employee2.getEmpName()+"\t"+employee2.getEmpSalary());
		  }
	  }
	
	public static void main(String[] args) {
		Employee employee[] = new Employee[3];

		ArrayList<Employee> empList=new ArrayList<>();
		
		int id[] = { 10002, 10001, 10003 };
		String name[] = { "amit kumar", "lalan kumar", "bablu kumar" };
		float salary[] = { 23000, 12000, 45000 };

		for (int i = 0; i < employee.length; i++) {
			employee[i] = new Employee();
			employee[i].setEmpId(id[i]);
			employee[i].setEmpName(name[i]);
			employee[i].setEmpSalary(salary[i]);
			empList.add(employee[i]);
		}
     displayEmployee(employee);
     Collections.sort(empList);
     
     System.out.println("after sorting by id ");
     
     displayEmployee1(empList);
	}
}
