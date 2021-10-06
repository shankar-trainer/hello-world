package com.cg.eis.pl;

import com.cg.eis.bean.Employee;
import com.cg.eis.service.EmployeeService;
import com.cg.eis.service.EmployeeServiceImpl;

public class EmployeeClient {
     static  int id[]= {1001, 1002, 1004, 1007};
     static String name[]= {"a kumar","mohan kumar","shyam kuamr","amit kumar"};
     static int salary[]= {20000, 25000, 4000, 40000};
     static String designation[]= 
    	 {"System Associate","Programmer","Clerk","Manager"};
       
	public static void main(String[] args) {
		Employee employee[]=new Employee[4];
		EmployeeService service=new EmployeeServiceImpl();
		
		for (int i = 0; i < employee.length; i++) {
			employee[i]=new Employee
					(id[i], name[i], salary[i], designation[i]);
			
			service.EmployeeDetail(employee[i]);
			
		}
		
		service.displayDetail(1002);
		
		System.out.println("Insurance scheme is "+service.FindInsuranceScheme1(1002));
		
		
		
	}
}
