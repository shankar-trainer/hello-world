package org.cognizant.java8.lambda;

import java.util.Arrays;
import java.util.Comparator;

public class EmployeeMain1 {

	public static void main(String[] args) {
		Employee emp[] = new Employee[3];

		emp[0] = new Employee(10003, "mahadev kumar", 12000);
		emp[1] = new Employee(10001, "rahul kumar", 10000);
		emp[2] = new Employee(10002, "aditya kumar", 18000);
		
		Comparator<Employee> comparatorbyid=new Comparator<Employee>() {
		    @Override
		    public int compare(Employee o1, Employee o2) {
		    	return new Integer(o1.getEmpId()).compareTo(new Integer(o2.getEmpId()));
		    }
		};
		Arrays.sort(emp,comparatorbyid);
		for (Employee employee : emp) {
			System.out.println(employee.getEmpId() + " " + employee.getEmpName() + "  " + employee.getEmpSalary());
		}
		
		Comparator<Employee> comparatorbyid1=(o1,o2)->{
	    	return new Integer(o1.getEmpId()).compareTo(new Integer(o2.getEmpId()));
		};

		System.out.println("\nusing lambda expression\n");
		Arrays.sort(emp,comparatorbyid1);
		for (Employee employee : emp) {
			System.out.println(employee.getEmpId() + " " + employee.getEmpName() + "  " + employee.getEmpSalary());
		}



	}
}
