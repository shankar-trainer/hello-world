package edu.coforge.collection.main;

import edu.coforge.collection.model.Employee;

import edu.coforge.collection.util.EmployeeOperation;

public class EmployeeMain {

	public static void main(String[] args) {
				
		Employee employee[]=new Employee[5];
		EmployeeOperation operation=new EmployeeOperation();
		
		int id[]= {10001,20001,30001,10002,10003};
		String nm[]= {"suman kumar","aman kumar","ram kumar","anil kumar",	"sunil kumar"};
		float sal[]= {20000,34000,90000,12000,45000};
		
		System.out.println("==== add operation=== ");
		
		for (int i = 0; i < employee.length; i++) {
			employee[i]=new Employee();
			employee[i].setEmpId(id[i]);
			employee[i].setEmpName(nm[i]);
			employee[i].setEmpSalary(sal[i]);
			operation.addEmployee(employee[i]);
		}
		
		System.out.println("==== all employee operation=== ");
		for (Employee  e : operation.getAllEmployee()) {
			System.out.println(e);
		}
		
		System.out.println("delete operation ");
		
		operation.removeEmployee(1);
		operation.removeEmployee(employee[3]);
		
		System.out.println("==== after delete all employee operation=== ");
		for (Employee  e : operation.getAllEmployee()) {
			System.out.println(e);
		}
		
		System.out.println("=====search operation====");
		
		System.out.println(operation.searchEmployee(employee[0]));
		System.out.println(operation.searchEmployee(employee[3]));
		
		if(operation.searchEmployee(employee[0])==null)
			System.out.println("search not found");
		else
			System.out.println("found "+operation.searchEmployee(employee[0]));
		
		
	}
}
