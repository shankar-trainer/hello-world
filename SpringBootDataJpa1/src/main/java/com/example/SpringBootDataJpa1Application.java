package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.dao.EmployeeDao;
import com.example.model.Employee;

@SpringBootApplication
public class SpringBootDataJpa1Application  implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootDataJpa1Application.class, args);
	}

	@Autowired
	EmployeeDao dao;
	
	@Override
	public void run(String... args) throws Exception {
	  Employee employee1=new Employee();
	  Employee employee2=new Employee();
	  
	  employee1.setEmpName("suresh kumar");
	  employee1.setEmpsalary(22000);
	  
	  employee2.setEmpName("lalit kumar");
	  employee2.setEmpsalary(29000);
	  
	  System.out.println("save operation");
	  dao.save(employee1);
	  dao.save(employee2);
	  
	  System.out.println("get all  operation");
	  dao.findAll().forEach(a->System.out.println(a));
	  
	}

}
