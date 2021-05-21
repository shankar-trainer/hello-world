package com.cts.Dp;

public class EmployeeMain {

	public static void main(String[] args) {
		//Employee emp1=new Employee();
	
		Employee emp1=Employee.getInstance();
	    emp1.setEmpId(10001);
	    emp1.setEmpName("p kumar");
	    
	    System.out.println(emp1.getEmpId()+"  "+emp1.getEmpName());
		
	    Employee emp2=Employee.getInstance();
	    System.out.println(emp2.getEmpId()+"  "+emp2.getEmpName());
	}
}
