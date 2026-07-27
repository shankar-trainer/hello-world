//package com.example.SpringBootApp1;
package com.example;

import com.example.config.AppConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.model.Employee;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
//(scanBasePackages = "com.example.model")
public class SpringBootApp1Application {

/*	public static void main(String[] args) {

//		SpringApplication.run(SpringBootApp1Application.class, args);
		ConfigurableApplicationContext cotext = SpringApplication.run(SpringBootApp1Application.class, args);

		Employee emp1 = cotext.getBean(Employee.class);
		System.out.println(emp1);
	}*/

	public static void main(String[] args) {
		ApplicationContext ctx=new AnnotationConfigApplicationContext(AppConfig.class);
		Employee emp1 = ctx.getBean(Employee.class);
		System.out.println(emp1);
	}
}
