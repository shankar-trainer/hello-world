package com.coforge;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.coforge.config.AppConfig;
import com.coforge.model.Department;
import com.coforge.model.User;

public class DepartmentMain {

	public static void main(String[] args) {

		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
		Department department = applicationContext.getBean(Department.class);
		System.out.println(department);

	}

}
