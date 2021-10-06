package com.howtodoinjava.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.howtodoinjava.demo.model.EmployeeEntity;
import com.howtodoinjava.demo.service.EmployeeService;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(DemoApplication.class, args);
		
		String fn[]={"ram","suresh","aman"};
		String ln[]={"kumar","kumar","kumar"};
		
		EmployeeService service = ctx.getBean(EmployeeService.class);
		
		EmployeeEntity entity[]=new EmployeeEntity[3];
		
		int x=0;
		for (EmployeeEntity employeeEntity : entity) {
			employeeEntity=new EmployeeEntity();
			employeeEntity.setFirstName(fn[x]);
			employeeEntity.setLastName(ln[x]);
			//service.addEmployee(employeeEntity);
		}
		
		service.getAllEmployees(0, 10, "id").forEach(System.out::println);
		
	}
}
