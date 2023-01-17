package com.abc.collection;

import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import com.abc.collection.bean.Employee;

public class EmployeeSort2 {

	static void displayEmployee(Employee employee[]) {
		for (Employee employee2 : employee) {
			System.out.println(employee2.getEmpId() + "\t" + employee2.getEmpName() + "\t" + employee2.getEmpSalary());
		}
	}
	  static void displayEmployee1(Set<Employee> empSet) {
		  for (Employee employee2 : empSet) {
			  System.out.println(employee2.getEmpId()+"\t"+employee2.getEmpName()+"\t"+employee2.getEmpSalary());
		  }
	  }
	
	public static void main(String[] args) {
		Employee employee[] = new Employee[3];

		TreeSet<Employee> empSet = new TreeSet<>(); // TreeSet

		int id[] = { 10002, 10001, 10003 };
		String name[] = { "amit kumar", "lalan kumar", "bablu kumar" };
		float salary[] = { 23000, 12000, 45000 };

		for (int i = 0; i < employee.length; i++) {
			employee[i] = new Employee();
			employee[i].setEmpId(id[i]);
			employee[i].setEmpName(name[i]);
			employee[i].setEmpSalary(salary[i]);
			empSet.add(employee[i]);
		}
		displayEmployee(employee);

		System.out.println("after sorting by id ");

		displayEmployee1(empSet);
	}
}
