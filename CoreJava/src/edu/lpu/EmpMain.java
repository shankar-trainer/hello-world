package edu.lpu;

import org.lpu.Employee;

class EmpMain extends Employee{

	public static void main(String[] args) {
		Employee emp1=new  Employee();
		emp1.id=100909;
		emp1.name="abhiram";
		emp1.salary=12000;
		
		emp1.empInfo();
	
	    EmpMain main1=new EmpMain();
	    main1.location="ahmadabad";
	    
	    System.out.println("location is "+main1.location);	
	}
}
