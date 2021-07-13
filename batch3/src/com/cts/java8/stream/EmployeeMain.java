package com.cts.java8.stream;

import java.util.List;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EmployeeMain {

	public static void main(String[] args) {
		Employee employee[] = new Employee[4];
		employee[0] = new Employee(10002, "pakhi", 12000);
		employee[1] = new Employee(10001, "rakhi", 10000);
		employee[2] = new Employee(10003, "sandhya", 18000);

		System.out.println("employee data \n");

		Stream.of(employee)
				.forEach(a -> System.out.println(a.getEmpId() + "  " + a.getEmpName() + "  " + a.getEmpSalary()));

		System.out.println("using filter salary >=12000\n");
		Stream.of(employee).filter(a -> a.getEmpSalary() >= 12000)
				.forEach(a -> System.out.println(a.getEmpId() + "  " + a.getEmpName() + "  " + a.getEmpSalary()));

		System.out.println("sorted by id ");
		
		Stream.of(employee).sorted((o1, o2) -> {
			return new Integer(o1.getEmpId()).compareTo(new Integer(o2.getEmpId()));
		}).forEach(a -> System.out.println(a.getEmpId() + "  " + a.getEmpName() + "  " + a.getEmpSalary()));

		
		List<Employee> collect = Stream.of(employee).collect(Collectors.toList());
		Set<Employee> collect2 = Stream.of(employee).collect(Collectors.toSet());
		
	}
}
