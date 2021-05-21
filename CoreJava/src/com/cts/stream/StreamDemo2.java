package com.cts.stream;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamDemo2 {

	static class Employee {
		private int empId;
		private String empName;
		private float empSalary;

		public int getEmpId() {
			return empId;
		}

		public void setEmpId(int empId) {
			this.empId = empId;
		}

		public String getEmpName() {
			return empName;
		}

		public void setEmpName(String empName) {
			this.empName = empName;
		}

		public float getEmpSalary() {
			return empSalary;
		}

		public void setEmpSalary(float empSalary) {
			this.empSalary = empSalary;
		}

		@Override
		public String toString() {
			return "Employee [empId=" + empId + ", empName=" + empName + ", empSalary=" + empSalary + "]";
		}

	}

	public static void main(String[] args) {
		int id[] = { 1009, 1001, 1002 };
		String name[] = { "pankaj kumar", "harendra kumar", "amrendra kumar" };
		float salary[] = { 20000, 12000, 15000 };

		Employee employee[] = new Employee[3];
		for (int i = 0; i < employee.length; i++) {
			employee[i] = new Employee();
			employee[i].setEmpId(id[i]);
			employee[i].setEmpName(name[i]);
			employee[i].setEmpSalary(salary[i]);
		}

		Arrays.stream(employee).forEach(emp -> System.out.println(emp));

		System.out.println("using limit");
		Arrays.stream(employee).limit(2).forEach(emp -> System.out.println(emp));

		System.out.println("using skip");
		
		Arrays.stream(employee).skip(1).forEach(emp -> System.out.println(emp));
		
		Arrays.stream(employee).findFirst();

		System.out.println();
		Arrays.stream(employee).forEach(
				emp -> System.out.println(emp.getEmpId() + "  " + emp.getEmpName() + " " + emp.getEmpSalary()));

		System.out.println();

		Arrays.stream(employee).filter(emp -> emp.getEmpSalary() > 12000).forEach(
				emp -> System.out.println(emp.getEmpId() + "  " + emp.getEmpName() + " " + emp.getEmpSalary()));

		List<Employee> collect = Arrays.stream(employee).collect(Collectors.toList());

		Set<Employee> collect1 = Arrays.stream(employee).collect(Collectors.toSet());

		System.out.println("using list \n"+collect);
		
		System.out.println("using set \n"+collect1);
	}
}
