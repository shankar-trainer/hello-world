package com.abc.collection;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.DoubleStream;
import java.util.stream.Stream;

public class EmployeeMain {

	public static void main(String[] args) {
		Employee emp[] = new Employee[3];
		emp[0] = new Employee(1003, "mohan kumar", 50000);
		emp[1] = new Employee(1001, "amit kumar", 40000);
		emp[2] = new Employee(1002, "sumit kumar", 16000);

		Comparator<Employee> comp1 = (o1, o2) -> Float.valueOf(o1.getSalary()).compareTo(Float.valueOf(o2.getSalary()));

		// Stream.of(emp).sorted(comp1);

		Stream.of(emp).sorted((o1, o2) -> Float.valueOf(o1.getSalary()).compareTo(Float.valueOf(o2.getSalary())))
				.filter(a -> a.getSalary() >= 40000)
				.forEach(a -> System.out.println(a.getId() + "  " + a.getName() + "  " + a.getSalary()));

		DoubleStream mapToDouble = Arrays.asList(emp).stream().mapToDouble(a -> a.getSalary());

		System.out.println("sum of salary " + mapToDouble.reduce((a, b) -> a + b).getAsDouble());

		double sum_of_salary = Arrays.asList(emp).stream().mapToDouble(a -> a.getSalary()).reduce((a, b) -> a + b)
				.getAsDouble();

	}
}
