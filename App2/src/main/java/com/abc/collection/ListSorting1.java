package com.abc.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListSorting1 {

	static final class Employee implements Comparable<Employee> {
		final int id;
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

		@Override
		public String toString() {
			//return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
			//return "\nEmployee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
			return "\nEmployee \n\tid=" + id + " \n\tname=" + name + " \n\tsalary=" + salary + "]";
		}
		
	
	}

	public static void main(String[] args) {
		List<Employee> list2 = new ArrayList<>();
		list2.add(new Employee(1003, "sushant kumar", 56000));
		list2.add(new Employee(1001, "arvind kumar", 16000));
		list2.add(new Employee(1002, "ghanshyam kumar", 76000));

		Collections.sort(list2);
		System.out.println(list2);
		
		/*for (Employee employee : list2) {
			System.out.println(employee.id+"  "+employee.name+"  "+employee.salary);
		}
*/
	}
}
