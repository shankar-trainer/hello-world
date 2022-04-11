package cts.collection.main;

import cts.collection.dao.EmployeeDao;
import cts.collection.model.Employee;

public class EmployeeMain {

	public static void main(String[] args) {
		Employee employee[] = new Employee[3];

		employee[0] = new Employee(10002, "harendra kumar", 78000.00f);
		employee[1] = new Employee(10001, "vipin kumar", 28000.00f);
		employee[2] = new Employee(10003, "anil kumar", 68000.00f);

		EmployeeDao dao = new EmployeeDao();
		System.out.println("Employee dao addition operation");
		for (int i = 0; i < employee.length; i++) {
			System.out.println("added "+  dao.addEmployee(employee[i]));
		}
		System.out.println("added "+  dao.addEmployee(employee[1]));
		
		
		System.out.println("\nAll Employee list Operation");
		for(Employee e:dao.getAllEmployee())
			System.out.println(e.getId()+"\t"+e.getName()+"\t"+e.getSalary());
		

		System.out.println("search employee 0 ");
	Employee ee=	dao.searchEmployee(employee[0]);
		if(ee!=null) {
			System.out.println("employee found ");
			System.out.println(ee.getId()+"\t"+ee.getName()+"\t"+ee.getSalary());
		}
		
		System.out.println("search employee 1 ");
		ee=	dao.searchEmployee(employee[1]);
		if(ee!=null) {
			System.out.println("employee found ");
			System.out.println(ee.getId()+"\t"+ee.getName()+"\t"+ee.getSalary());
		}
		
		
		Employee e=new Employee(1, "a kumar", 34000);
		System.out.println("search employee e "+dao.searchEmployee(e));
		
		
		
		
		
	}
}
