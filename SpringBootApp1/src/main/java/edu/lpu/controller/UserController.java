package edu.lpu.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.lpu.model.Employee;

@RestController
@RequestMapping("/user")
public class UserController {

	
	@RequestMapping("/hello")
	public String hello() {
		return "hello world";
	}
	
	//@RequestMapping("/emp")
	@GetMapping("/emp")
	public Employee  getEmp() {
		Employee employee=new Employee();
        employee.setId(877887);
        employee.setName("amit kumar");
        employee.setSalary(12000);
        return employee;
	}
	@GetMapping("/allemp")
	public List<Employee>  getAllEmp() {
		return list1;
	}
	@GetMapping("/search/{country}")
	public String search(@PathVariable("country") String country) {
		return  "My Country is "+country;
	}
   
static	List<Employee> list1;
	static {
		Employee employee[]=new Employee[4];
		employee[0]=new Employee();
		employee[0].setId(10001);
		employee[0].setName("suresh kumar");
		employee[0].setSalary(12000);
		
		employee[1]=new Employee();
		employee[1].setId(10002);
		employee[1].setName("umesh  kumar");
		employee[1].setSalary(18000);
		
		employee[2]=new Employee();
		employee[2].setId(10003);
		employee[2].setName("lata   kumari");
		employee[2].setSalary(45000);

		employee[3]=new Employee();
		employee[3].setId(10004);
		employee[3].setName("amita   kumari");
		employee[3].setSalary(65000);
	
		list1=new ArrayList<>();
		for (Employee employee2 : employee) {
			 list1.add(employee2);
		}
		
	}
	
	
}
