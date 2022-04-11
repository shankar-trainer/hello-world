package cts.collection.main;

import java.util.Arrays;

import cts.collection.model.Employee;

public class ArrayExample2 {

	public static void main(String[] args) {
		Employee employee[] = new Employee[3];

		employee[0] = new Employee(10002, "harendra kumar", 78000.00f);
		employee[1] = new Employee(10001, "vipin kumar", 28000.00f);
		employee[2] = new Employee(10003, "anil kumar", 68000.00f);

		System.out.println("before sorting");

		for (Employee e : employee) {
			System.out.println(e.getId() + "\t" + e.getName() + "\t" + e.getSalary());
		}
		Arrays.sort(employee);

		System.out.println("after sorting");
		for (Employee e : employee) {
			System.out.println(e.getId() + "\t" + e.getName() + "\t" + e.getSalary());
		}

	}
}
