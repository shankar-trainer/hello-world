package org.com;

import org.com.model.Department;
import org.com.service.DepartmentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DepartmentMain {

	public static void main(String[] args) {

		ConfigurableApplicationContext ctx = SpringApplication.run(DepartmentMain.class, args);

		DepartmentService service = ctx.getBean(DepartmentService.class);
		 service.getAllDEpartments().forEach(System.out::println);

	}
}
