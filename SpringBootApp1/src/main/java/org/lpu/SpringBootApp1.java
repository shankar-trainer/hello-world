package org.lpu;

import org.lpu.model.Employee;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringBootApp1 {

	public static void main(String[] args) {
		// SpringApplication.run(SpringBootApp1.class, args);

		ConfigurableApplicationContext run = SpringApplication.run(SpringBootApp1.class, args);

		Employee e1 = run.getBean(Employee.class);
		System.out.println(e1.getId());
		System.out.println(e1.getName());
		System.out.println(e1.getSalary());

	}
}
