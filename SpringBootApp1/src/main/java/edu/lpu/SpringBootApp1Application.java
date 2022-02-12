package edu.lpu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import edu.lpu.model.Employee;

@SpringBootApplication
public class SpringBootApp1Application {

	public static void main(String[] args) {
		//SpringApplication.run(SpringBootApp1Application.class, args);
		ConfigurableApplicationContext ctx = SpringApplication.run(SpringBootApp1Application.class, args);
          		
		Employee bean2 = ctx.getBean(Employee.class);
		
		System.out.println(bean2.getId());
		System.out.println(bean2.getName());
		System.out.println(bean2.getSalary());
	}

}
