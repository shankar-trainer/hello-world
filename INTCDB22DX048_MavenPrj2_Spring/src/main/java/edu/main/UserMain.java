package edu.main;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import edu.example.model.Employee;
import edu.example.model.User;

public class UserMain {

	public static void main(String[] args) {
		BeanFactory beanFactory = new ClassPathXmlApplicationContext("beans.xml");

		User user =  beanFactory.getBean(User.class);
		
		System.out.println(user.getUserId());
		System.out.println(user.getUserName());
		System.out.println(user.getUserSalary());
	}

}
