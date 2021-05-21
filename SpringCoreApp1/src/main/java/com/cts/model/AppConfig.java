package com.cts.model;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {

	@Bean
   @Scope("prototype")
	//@Scope("singleton")
	@Lazy

	public User getUserBean() {
		User user=new User();
		user.setUserId(10001);
		user.setUserName("pankaj kumar");
		user.setUserSalary(34000);
		return user;
	}
	
	@Bean
	@Scope("prototype")
	//@Scope("singleton")
	@Lazy
	public Student getStudentBean() {
		System.out.println("1.getstudent bean called ");
		Student student=new Student();
	     student.setStudentId(6777);
	     student.setStudentName("sahil kamaal ");
	     student.setStudentMarks(66);
		return student;
	}
	
}
