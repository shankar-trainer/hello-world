package com.montran.collection;

public class EmployeeMain {

	public static void main(String[] args) {
		Employee employee[]=new Employee[4];
		employee[0]=new Employee(1009, "umesh  kumar", 26000);
		employee[1]=new Employee(1010, "somesh  kumari", 30000);
		employee[2]=new Employee(1001, "geetha  sharma", 12000);
		employee[3]=new Employee(1008, "kavita  sinha", 16000);
		
		EmployeeOperation employeeOperation=new EmployeeOperation();
		for (Employee employee2 : employee) {
			employeeOperation.EmployeeAdd(employee2);
		}
		
		System.out.println(employeeOperation.SearchEmployee(employee[2]));
		employeeOperation.RemoveEmployee(2);
//		employeeOperation.RemoveEmployee(employee[0]);
		
		for(Employee e:employeeOperation.getAllEmployee())
			System.out.println(e.getEmployeeId()+"  "+e.getEmployeeName()+"  "+e.getEmployeeSalary());
		
		System.out.println(employeeOperation.SearchEmployee(employee[2]));
	}
}
