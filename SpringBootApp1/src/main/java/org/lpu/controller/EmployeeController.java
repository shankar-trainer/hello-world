package org.lpu.controller;

import java.util.ArrayList;
import java.util.List;

import org.lpu.model.Employee;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/emp")
public class EmployeeController {
	
	static List<Employee> empList;
	static
	{
		Employee employee2[]=new Employee[3];
	 empList=new ArrayList<>();
     employee2[0]=new Employee();
 
     employee2[0].setId(8001);
     employee2[0].setName("barjesh kumar");
     employee2[0].setSalary(80000);
     
     employee2[1]=new Employee();
     
     employee2[1].setId(8002);
     employee2[1].setName("paince kumar");
     employee2[1].setSalary(90000);
     
     employee2[2]=new Employee();
     
     employee2[2].setId(8003);
     employee2[2].setName("suman kumar");
     employee2[2].setSalary(60000);
     
     empList.add(employee2[0]);
     empList.add(employee2[1]);
     empList.add(employee2[2]);
     
	}
	
    @RequestMapping("/emp2")	
	public List<Employee> getAllEmp() {
     return empList;
    }
	
    @RequestMapping("/search/{id}")	
	public Employee searchEmp(@PathVariable("id") int id) {
        for(Employee e:empList) {
        	if(e.getId()==id)
        		return e;
        }     
    	return null;
    }
	@RequestMapping("/hello")
	public String hello() {
		return "hello world";
	}
	
	Employee employee;
    @RequestMapping("/emp1")	
	public Employee getEmpo() {
		 employee=new Employee();
		 employee.setId(100001);
		 employee.setName("kamal kant");
		 employee.setSalary(120000);
		 return employee;
	}
	
	
}
