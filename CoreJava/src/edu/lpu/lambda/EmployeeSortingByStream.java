package edu.lpu.lambda;

import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import edu.lpu.collection.Employee;

public class EmployeeSortingByStream {

	public static void main(String[] args) {
		int id1[] = { 1009, 1007, 1004, 1005 };
		String nm[] = { "dinesh", "suresh", "amit", "sumit" };
		float salary[] = { 20000, 40000, 10000, 23000 };

		Employee employee[] = new Employee[4];

		for (int i = 0; i < salary.length; i++) {
			employee[i] = new Employee(id1[i], nm[i], salary[i]);
		}

		Stream.of(employee).forEach(a -> System.out.println(a.getId() + "  " + a.getName() + " " + a.getSalary()));

		System.out.println("\nsorting by name\n");
		Stream.of(employee).sorted((a1, a2) -> a1.getName().compareTo(a2.getName()))
				.forEach(a -> System.out.println(a.getId() + "  " + a.getName() + " " + a.getSalary()));

		System.out.println("\nsorting by Salary \n");
		Stream.of(employee).sorted((a1, a2) -> Float.valueOf(a1.getSalary()).compareTo(Float.valueOf(a2.getSalary())))
				.forEach(a -> System.out.println(a.getId() + "  " + a.getName() + " " + a.getSalary()));

		System.out.println("\nsorting byId \n");

		Comparator<Employee> comparator2 = (a1, a2) -> Integer.valueOf(a1.getId())
				.compareTo(Integer.valueOf(a2.getId()));

		Stream.of(employee).sorted(comparator2)
				.forEach(p -> System.out.println(p.getId() + "  " + p.getName() + "  " + p.getSalary()));

		System.out.println("\nemployee having salary geeatr than equal to  20000");
		
		Stream.of(employee).filter(p->p.getSalary()>=20000).forEach(p->System.out.println(p.getId()+"  "+p.getName()+"  "+p.getSalary()));			
		
		List<Employee> list = Stream.of(employee).filter(p->p.getSalary()>=20000).collect(Collectors.toList());
		
		
		Set<Employee> set1 = Stream.of(employee).filter(p->p.getSalary()>=20000).collect(Collectors.toSet());
		
		
	}
}
