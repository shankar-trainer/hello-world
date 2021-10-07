package com.capgemini.java8;

import java.util.Comparator;
import java.util.stream.Stream;

public class EmployeeMain3 {

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
    Stream.of(emp).forEach(a->System.out.println(a));

	Comparator<Employee> comparator1 = (k, l) -> {
		return k.getName().compareTo(l.getName());
	};

	System.out.println("\nsorted by name");
    Stream.of(emp).sorted(comparator1).forEach(a->System.out.println(a));
    
    System.out.println("\nsorted by name with salary filter ");
    Stream.of(emp).sorted(comparator1).filter(a->a.getSalary()>=10000).forEach(a->System.out.println(a));
    
    
	}
}
