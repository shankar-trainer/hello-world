package org.com.pl;

import org.com.config.EmployeeConfig;
import org.com.model.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class EmpMain {

	public static void main(String[] args) {
		
		
	ApplicationContext applicationContext=new AnnotationConfigApplicationContext
			(EmployeeConfig.class);
	
	 Employee bean = applicationContext.getBean(Employee.class);
	
	 System.out.println(bean);
	
	
	
		 
	}
}
