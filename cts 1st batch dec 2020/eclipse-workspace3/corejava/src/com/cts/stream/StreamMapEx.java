package com.cts.stream;

import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.cts.collection.Employee;

public class StreamMapEx {

	public static void main(String[] args) {
		
		Stream.of(1,2,3,4,5,6).map(a->a*a).forEach(a->System.out.println(a));
	
		
		ArrayList<Employee> list1 = new ArrayList<Employee>();
		int id1[] = { 1001, 1005, 1002, 1004 };
		String name1[] = { "ram kumar", "amit kumar", "bhuwanesh kumar", "deepak kumar" };
		float salary1[] = { 10000, 9000, 5000, 20000 };

		Employee employee[] = new Employee[4];

		for (int i = 0; i < employee.length; i++) {
			employee[i] = new Employee();
			employee[i].setId(id1[i]);
			employee[i].setName(name1[i]);
			employee[i].setSalary(salary1[i]);
			list1.add(employee[i]);
		}
		
		System.out.println("all records");
		
		list1.stream().forEach(a->System.out.println(a.getId()+" "+a.getName()+" "+a.getSalary()));
		
		
		System.out.println("net salary after 5% deduct");
		
		list1.stream().map(a->a.getSalary()-a.getSalary()*5/100).forEach(a->System.out.println(a));
    
	//	Collectors c;
	
		
		
		
	}
}
