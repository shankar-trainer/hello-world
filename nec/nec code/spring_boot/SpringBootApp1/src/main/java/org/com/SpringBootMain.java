package org.com;

import org.com.model.Employee;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringBootMain {

	public static void main(String[] args) {
//		 ConfigurableApplicationContext bean = SpringApplication.run(SpringApplication.class, args);
		 ConfigurableApplicationContext bean = SpringApplication.run(SpringBootMain.class, args);
	
		 Employee employee = bean.getBean(Employee.class);
		 System.out.println(employee);
	}
	
}
