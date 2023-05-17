package edu.chitkara.collection;

import java.util.Arrays;

public class EmployeeMain {

	static void printEmployee(Employee emp[]) {
		System.out.println("Employee Details ");
		for (Employee e : emp)
			System.out.println(e.getEmpId() + "\t" + e.getEmpName() + "\t" + e.getEmpSalary());
	}

	public static void main(String[] args) {

		Employee employee[] = new Employee[4];
		employee[0] = new Employee(5343434, "surendra kumar", 90000);
		employee[1] = new Employee(5343432, "amit kumar", 60000);
		employee[2] = new Employee(5343433, "mukesh kumar", 95000);
		employee[3] = new Employee(5343431, "rajesh kumar", 78000);

		printEmployee(employee);
		System.out.println("Sorted Employee \n");
		Arrays.sort(employee);
		printEmployee(employee);

	}
}
