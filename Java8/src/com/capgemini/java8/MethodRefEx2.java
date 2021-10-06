package com.capgemini.java8;

import java.util.Arrays;

public class MethodRefEx2 {
	static int compareByName(Employee e1, Employee e2) {
		return e1.getName().compareTo(e2.getName());
	}

	public static void main(String[] args) {
		int id1[] = { 1003, 1001, 1002 };
		String nm[] = { "ashok kumar", "varun paratap", "akhilesh kumar" };
		float salary1[] = { 10000, 9000, 40000 };

		Employee emp[] = new Employee[3];
		for (int i = 0; i < emp.length; i++) {
			emp[i] = new Employee();
			emp[i].setId(id1[i]);
			emp[i].setName(nm[i]);
			emp[i].setSalary(salary1[i]);
		}

		/*
		 * Arrays.sort(emp, (e1, e2) -> { return e1.getName().compareTo(e2.getName());
		 * });
		 */
		
		Arrays.sort(emp, MethodRefEx2::compareByName);

		System.out.println(Arrays.toString(emp));

	}
}
