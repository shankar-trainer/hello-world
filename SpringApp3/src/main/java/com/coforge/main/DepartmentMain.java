package com.coforge.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.coforge.config.JavaConfig;
import com.coforge.model.Department;

public class DepartmentMain {

	public static void main(String[] args) {

		ApplicationContext ctx = new AnnotationConfigApplicationContext(JavaConfig.class);
		Department bean = ctx.getBean(Department.class);
		System.out.println(bean);
	}
}
