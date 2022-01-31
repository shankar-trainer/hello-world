package edu.lpu.collection;

import java.util.Arrays;
import java.util.Comparator;

public class EmployeeSorting {
 static void display(Employee emp[]) {
		for (Employee employee2 : emp) 
			System.out.println(employee2.getId() + "  " + employee2.getName() + "  " + employee2.getSalary());
 }
	public static void main(String[] args) {
		int id1[] = { 1009, 1007, 1004, 1005 };
		String nm[] = { "dinesh", "suresh", "amit", "sumit" };
		float salary[] = { 20000, 40000, 10000, 23000 };

		EmployeeOperation operation = new EmployeeOperation();
		Employee employee[] = new Employee[4];

		for (int i = 0; i < salary.length; i++) {
			employee[i] = new Employee(id1[i], nm[i], salary[i]);
			operation.add(employee[i]);
		}

		Comparator<Employee> comparator = new Comparator<Employee>() {
			@Override
			public int compare(Employee o1, Employee o2) {
				return o1.getName().compareTo(o2.getName());
			}
		};

		Comparator<Employee> comparator1 = (a1, a2) -> {
			return a1.getName().compareTo(a2.getName());
		};
		// Arrays.sort(employee, comparator);
		Arrays.sort(employee, comparator1);
		System.out.println("sorted by name");
		display(employee);
		
		Comparator<Employee> comparator2 = (a1, a2) -> 
		 Integer.valueOf(a1.getId()).compareTo(Integer.valueOf(a2.getId()));
		
		Arrays.sort(employee, comparator2);
			
		System.out.println("sorted by id ");
		display(employee);
		
		
		Arrays.sort(employee,  (a1, a2) -> 
		 Float.valueOf(a1.getSalary()).compareTo(Float.valueOf(a2.getSalary())));
		
		System.out.println("sorted by salary ");
		display(employee);
		
		

		
	}
}
