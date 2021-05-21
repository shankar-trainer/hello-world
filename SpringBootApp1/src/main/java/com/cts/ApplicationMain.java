package com.cts;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.stereotype.Service;

import com.cts.exception.EmployeeException;
import com.cts.model.Employee;
import com.cts.service.EmployeeService;

@SpringBootApplication
public class ApplicationMain implements CommandLineRunner {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(ApplicationMain.class, args);

	/*	Employee emp = ctx.getBean("employee", Employee.class);

		System.out.println(emp.getEmpId());
		System.out.println(emp.getEmpName());
		System.out.println(emp.getEmpSalary());

		Employee emp1 = ctx.getBean(Employee.class);

		emp1.setEmpId(77888);
		emp1.setEmpName("suresh kumar");
		emp1.setEmpSalary(34000);

		System.out.println(emp1);
		*/
	}

	@Autowired
	EmployeeService service;

	public void run(String... args) {
		/*
		  Employee employee1 = new Employee();
		 
		employee1.setEmpId(7001);
		employee1.setEmpName("suman kumar");
		employee1.setEmpSalary(45000);

		Employee employee2 = new Employee();
		employee2.setEmpId(7002);
		employee2.setEmpName("pawan kumar");
		employee2.setEmpSalary(40000);

		Employee employee3 = new Employee();
		employee3.setEmpId(7003);
		employee3.setEmpName("rajendra kumar");
		employee3.setEmpSalary(34000);
		try {

			service.savemployee(employee1);
			service.savemployee(employee2);
			//service.savemployee(employee2);
			service.savemployee(employee3);

			service.getAllEmployee().forEach(a -> System.out.println(a));
		} catch (EmployeeException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("run is working");
		*/
	}

}
