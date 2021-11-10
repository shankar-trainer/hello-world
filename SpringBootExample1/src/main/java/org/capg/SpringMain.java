package org.capg;

import org.capg.model.Employee;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringMain {

	public static void main(String[] args) {

		ConfigurableApplicationContext ctx = SpringApplication.run(SpringMain.class, args);

		Employee emp = ctx.getBean(Employee.class);
		System.out.println(emp.getId());
		System.out.println(emp.getName());
		System.out.println(emp.getSalary());
	}
}
