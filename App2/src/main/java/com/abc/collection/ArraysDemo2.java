package com.abc.collection;

import java.util.Arrays;
public class ArraysDemo2 {
	static class Employee implements Comparable<Employee> {
		int id;
		String name;
		float salary;

		public Employee(int id, String name, float salary) {
			super();
			this.id = id;
			this.name = name;
			this.salary = salary;
		}

		@Override
		public int compareTo(Employee o) {
			if (this.id == o.id)
				return 0;

			else if (this.id > o.id)
				return 1;
			else
				return -1;

		}
	}

	public static void main(String[] args) {
		Employee emp[] = new Employee[3];
		emp[0] = new Employee(1004, "suman kumar", 45000);
		emp[1] = new Employee(1001, "aman kumar", 65000);
		emp[2] = new Employee(1002, "raman kumar", 15000);

		Arrays.sort(emp);
//java.lang.ClassCastException: class com.abc.collection.ArraysDemo2$Employee cannot be cast to class java.lang.Comparable       
		for (Employee e : emp)
			System.out.println(e.id + " " + e.name + "  " + e.salary);

	}
}
