package com.capgemini.main;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.capgemini.beans.Employee;
import com.capgemini.beans.HelloWorld;

public class EmployeeMain {

	public static void main(String[] args) {
		BeanFactory beanfactory=new ClassPathXmlApplicationContext("beans.xml");
		Employee employee = beanfactory.getBean("emp1",Employee.class);
		System.out.println(employee);
		
		System.out.println(employee.getId()+"\t"+employee.getName()+"\t"+employee.getSalary());

	}

}
