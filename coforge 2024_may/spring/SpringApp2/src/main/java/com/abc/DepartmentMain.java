package com.abc;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.abc.model.Department;
import com.abc.model.User;

public class DepartmentMain {
	public static void main(String[] args) {

		BeanFactory factory = new ClassPathXmlApplicationContext("beans.xml");

		System.out.println(factory.getBean(Department.class));

	}
}
