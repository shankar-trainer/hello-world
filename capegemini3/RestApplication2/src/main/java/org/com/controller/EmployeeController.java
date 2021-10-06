package org.com.controller;

import java.util.ArrayList;
import java.util.List;

import org.com.model.Employee;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/emp")
public class EmployeeController {

	static ArrayList<Employee> empList;
	
	static {
	empList=new ArrayList<>();
	Employee employee[]=new Employee[4];
	  employee[0]=new Employee(1001,"suresh kumar",20000,"delhi");
	  employee[1]=new Employee(1002,"chandan kumar",26000,"kolkotta");
	  employee[2]=new Employee(1003,"vijay kumar",50000,"coimbtore");
	  employee[3]=new Employee(1004,"ajay kumar",80000,"ranchi");
	 
	  empList.add(employee[0]);
	  empList.add(employee[1]);
	  empList.add(employee[2]);
	  empList.add(employee[3]);
	}

	@GetMapping("/allEmps")
	public List<Employee> showAllEmployee(){	
		return empList;
	}
	

	@GetMapping("/searchEmps/{id}")
	public Employee showAllEmployee(@PathVariable("id") int id){
		Employee e=null;
		
		for (Employee employee : empList) {
			if(id==employee.getId()) {
				e=employee;
				break;
			}
		}
		return e;
	}

	
	
	@RequestMapping("/hello")
	public String hello() {
		return "<h1>hello world<h1>";
	} 
	
	@RequestMapping("/employee")
	public Employee getemp() {
		Employee employee=new Employee();
		employee.setId(1001);
		employee.setName("suresh kumar");
		employee.setSalary(40000);		
		employee.setLocation("chennai");	
		return employee;
	} 	
}
