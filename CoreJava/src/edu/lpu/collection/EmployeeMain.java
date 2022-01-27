package edu.lpu.collection;

import java.util.List;

public class EmployeeMain {

	public static void main(String[] args) {
		
		int id1[]= {1009,1007,1004,1005};
		String nm[]= {"dinesh","suresh","amit","sumit"};
		float salary[]= {20000,40000,10000,23000};
		
		EmployeeOperation operation=new EmployeeOperation();
		
		Employee employee[]=new Employee[4];
		
		for (int i = 0; i < salary.length; i++) {
			employee[i]=new Employee(id1[i], nm[i], salary[i]);
			operation.add(employee[i]);
		}
		
		
		System.out.println("All Employee Records ");
		
		List<Employee> allEmployee = operation.getAllEmployee();
		System.out.println();
		for (Employee employee2 : allEmployee) {
		    System.out.println("\t"+employee2.getId()+"  "+employee2.getName()+"  "+employee2.getSalary());	
		}
		
	}
}
