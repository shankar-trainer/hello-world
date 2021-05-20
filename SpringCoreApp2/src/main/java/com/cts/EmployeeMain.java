package com.cts;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cts.model.Employee;

public class EmployeeMain {

	public static void main(String[] args) {
		
		BeanFactory beanFactory=new ClassPathXmlApplicationContext("beans.xml");
		
		Employee emp=  (Employee)beanFactory.getBean("emp1");
	
		System.out.println(emp.getEmpId());
		System.out.println(emp.getEmpName());
		System.out.println(emp.getEmpSalary());
		
		
	}
}
