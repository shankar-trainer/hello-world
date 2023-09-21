package com.coforge;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.coforge.model.Survey;
import com.coforge.model.SurveyDepartment;
import com.coforge.service.UserService;

public class UserMain {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
 
		UserService bean = context.getBean(UserService.class);
		System.out.println(bean);
		System.out.println(bean.getUser().toString());
		
		System.out.println("id :"+bean.getUser().getUserId());
		System.out.println("name :"+bean.getUser().getUserName());
		System.out.println("salary :"+bean.getUser().getUserSalary());
		
		
	}
}
