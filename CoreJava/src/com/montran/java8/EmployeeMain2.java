package com.montran.java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class EmployeeMain2 {

	public static void main(String[] args) {
		int id[] = { 111, 101, 119, 201, 100 };
		String name[] = { "suraj kumar", "amit balyan", "kumkum", "bhavna", "amita" };
		float salary[] = { 80000, 34000, 12000, 90000, 67000 };

		Employee employee[] = new Employee[4];
		for (int i = 0; i < employee.length; i++) {
			employee[i] = new Employee(id[i], name[i], salary[i]);
		}
		
		List<Employee> asList = Arrays.asList(employee);
	    
		//Collections.sort(asList, (o1,o2)-> o1.getName().compareTo(o2.getName())  );
		
		asList.forEach(a->System.out.println(a));
		
		System.out.println("---------------------");
		
		asList.forEach(a->System.out.println(a.getId()+"  "+a.getName()+"   "+a.getSalary()));
			
		System.out.println("---------using skip------------");
		
		asList.stream().skip(2).forEach(a->System.out.println(a.getId()+"  "+a.getName()+"   "+a.getSalary()));
		
		
		System.out.println("---------using filter------------");
		
		asList.stream().filter(a->a.getSalary()>=50000).forEach(a->System.out.println(a.getId()+"  "+a.getName()+"   "+a.getSalary()));
	
		System.out.println("\nsorting by name\n");
		asList.stream().sorted((o1,o2)-> o1.getName().compareTo(o2.getName())).forEach(a->System.out.println(a.getId()+"  "+a.getName()+"   "+a.getSalary()));

		System.out.println("\nsorting by id\n");
		asList.stream().sorted((o1,o2)-> new Integer(o1.getId()).compareTo(new Integer(o2.getId()))).forEach(a->System.out.println(a.getId()+"  "+a.getName()+"   "+a.getSalary()));

		System.out.println("\nsorting by salary\n");
		asList.stream().sorted((o1,o2)-> new Float(o1.getSalary()).compareTo(new Float(o2.getSalary()))).forEach(a->System.out.println(a.getId()+"  "+a.getName()+"   "+a.getSalary()));
		
		
	}
}
