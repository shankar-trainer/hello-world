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
			service.addEmployee(employeeEntity);
		}
		
	System.out.println("first page with 5 record");
	service.getAllEmployees(0, 5, "id").forEach(System.out::println);//1st page with 5 record
	System.out.println("second page with 5 record");
	service.getAllEmployees(1, 5, "id").forEach(System.out::println);//2nd page with 5 record
	System.out.println("third page with 10 record");
	service.getAllEmployees(2, 10, "id").forEach(System.out::println);//3rd page with 10 record
	
	//service.getAllEmployees(10, 5, "id").forEach(System.out::println);
		
	}
}
