package com.coforge.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.coforge.configuration.EmployeeConfiguration;
import com.coforge.model.Employee;

public class EmployeeMain {

	public static void main(String[] args) {
	ApplicationContext ctx=new	AnnotationConfigApplicationContext(EmployeeConfiguration.class);
	
	Employee bean = ctx.getBean(Employee.class);
	System.out.println(bean);
	}
}
