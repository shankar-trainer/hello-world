package org.com.controller;

import java.util.ArrayList;
import java.util.List;

import org.com.model.Employee;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	
	@RequestMapping("/hello")
	public String hello() {
		 return "hello world";
	}

	@RequestMapping("/emp")
	public  Employee getEmployee() {
		Employee employee=new Employee(1001,"anand kumar",67000);
		return employee;
	}
	
	@RequestMapping("/getAll")
	public  List<Employee> getAllEmployee() {
	 return empList;
	}
	
	
	static List<Employee> empList;
	
	static {
		empList=new ArrayList<>();
		empList.add(new Employee(10001,"abadh kumar",90000));
		empList.add(new Employee(10002,"mohan kumar",9200));
		empList.add(new Employee(10003,"shyam kumar",8000));
		empList.add(new Employee(10004,"lalan kumar",7000));
		empList.add(new Employee(10005,"deepak kumar",7700));
		empList.add(new Employee(10006,"parmod kumar",67000));
		empList.add(new Employee(10007,"subodh kumar",94000));
		empList.add(new Employee(10008,"mahesh kumar",76000));
	}

	@RequestMapping("/{id}")
	 public Employee searchEmployee(@PathVariable("id") int id) {
		for(Employee emp:empList) {
			if(emp.getId()==id) {
				return emp;
			}
		}
		return null;
	}
	 
	
	
	
}
