package com.capgemini.main;

import java.util.Locale;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.MessageSource;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.capgemini.beans.Department;

public class DepartmentMain2 {

	
	public static void main(String[] args) {
		BeanFactory beanfactory = new ClassPathXmlApplicationContext("application.xml");
        Department department=		beanfactory.getBean("department",Department.class);
        
        System.out.println("id is "+department.getDepartmentId());
        
        MessageSource messageSource=beanfactory.getBean("messageSource",MessageSource.class);
        
        System.out.println("department values in english ");
        
        System.out.println(messageSource.getMessage("dept.deptId", null, Locale.getDefault())    +department.getDepartmentId());
        System.out.println(messageSource.getMessage("dept.deptName", null, Locale.getDefault())      +department.getDepartmentName());
        System.out.println(messageSource.getMessage("dept.deptLocation", null, Locale.getDefault())      +department.getDepartmentLocation());
        
        System.out.println("\ndepartment values in french \n ");
        
        System.out.println(messageSource.getMessage("dept.deptId", null, Locale.FRENCH)      +department.getDepartmentId());
        System.out.println(messageSource.getMessage("dept.deptName", null, Locale.FRENCH)      +department.getDepartmentName());
        System.out.println(messageSource.getMessage("dept.deptLocation", null, Locale.FRENCH)      +department.getDepartmentLocation());
        
	}
}
