package com.capgemini.main;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.capgemini.beans.Department;

public class DepartmentMain {

	
	public static void main(String[] args) {
		BeanFactory beanfactory = new ClassPathXmlApplicationContext("application.xml");
        Department department=		beanfactory.getBean("department",Department.class);
        System.out.println(department);
        
        Department department1=		beanfactory.getBean("dept1",Department.class);
        System.out.println(department1);
        
	}
}
