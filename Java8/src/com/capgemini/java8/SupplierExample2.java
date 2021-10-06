package com.capgemini.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class SupplierExample2 {
	static List<Employee> list1;

	public static List<Employee> getEmployee() {
		list1 = new ArrayList<Employee>();
		int id1[] = { 1003, 1001, 1002 };
		String nm[] = { "ashok kumar", "varun paratap", "akhilesh kumar" };
		float salary1[] = { 10000, 9000, 40000 };

		Employee emp[] = new Employee[3];
		for (int i = 0; i < emp.length; i++) {
			emp[i] = new Employee();
			emp[i].setId(id1[i]);
			emp[i].setName(nm[i]);
			emp[i].setSalary(salary1[i]);
			list1.add(emp[i]);
		}
		return list1;
	}

	public static void main(String[] args) {
		Supplier<List<Employee>> supplier = () -> getEmployee();
		Supplier<List<Employee>> supplier1 = SupplierExample2::getEmployee;
		
//		List<Employee> list = supplier.get();
		List<Employee> list = supplier1.get();
		for (Employee employee : list) {
			System.out.println(employee);
		}
	}
}
