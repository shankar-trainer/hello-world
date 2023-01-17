package com.pathinfotech.main;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pathinfotech.model.Employee;

public class EmployeeMain {

	public static void main(String[] args) {
		
		BeanFactory beanFactory=new ClassPathXmlApplicationContext("beans.xml");
	 //Employee employee=	(Employee) beanFactory.getBean("employee");
	 Employee employee=	 beanFactory.getBean("employee",Employee.class);
	 Employee employee1=	 beanFactory.getBean("employee",Employee.class);
		 
	 employee1.setEmpId(786787);
	 employee1.setEmpName("sumit anand");
	 employee1.setEmpSalary(45000);
	 
	 System.out.println("\nEmployee1 Data \n");
	 System.out.println("Id is "+employee.getEmpId());
	 System.out.println("Name is "+employee.getEmpName());
	 System.out.println("Salary is "+employee.getEmpSalary());
		
	 
	 System.out.println("\nEmployee2 Data \n");
	 System.out.println("Id is "+employee1.getEmpId());
	 System.out.println("Name is "+employee1.getEmpName());
	 System.out.println("Salary is "+employee1.getEmpSalary());
	 
	 
	 
	}
}
