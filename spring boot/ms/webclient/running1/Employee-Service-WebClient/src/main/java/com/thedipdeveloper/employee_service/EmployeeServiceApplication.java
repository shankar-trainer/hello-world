package com.thedipdeveloper.employee_service;

import com.thedipdeveloper.employee_service.entity.Employee;
import com.thedipdeveloper.employee_service.repository.EmployeeRepository;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class EmployeeServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeServiceApplication.class, args);
	}

	@Autowired
	private EmployeeRepository employeeRepo;

	@PostConstruct
	public void add(){
		Employee employee[]=new Employee[]{
				new Employee("ram kumar","ram@gmail.com","20"),
				new Employee("shyam kumar","shyam@gmail.com","23"),
				new Employee("mohan kumar","mohan@gmail.com","40"),
				new Employee("kamal kumar","kamal@gmail.com","26"),
		};
		employeeRepo.saveAll(Arrays.asList(employee));
		employeeRepo.findAll().forEach(employee1 -> System.out.println(employee1));
	}
}

//http://localhost:8080/employee-service/h2-console/

//http://localhost:8081/address-service/address/1
//http://localhost:8080/employee-service/employees/1

