package com.coforge.main;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.coforge.model.EmployeeImpl;
import com.coforge.model.Hello;

public class EmployeeMain {

	public static void main(String[] args) {

		//BeanFactory factory = new ClassPathXmlApplicationContext("beans.xml");
		BeanFactory factory = new FileSystemXmlApplicationContext("src/main/resources/beans.xml");

		EmployeeImpl impl = factory.getBean("emp1", EmployeeImpl.class);

		impl.employeeInfo();

	}
}
