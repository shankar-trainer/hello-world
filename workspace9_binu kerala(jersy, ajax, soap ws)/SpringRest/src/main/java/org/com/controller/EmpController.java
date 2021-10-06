package org.com.controller;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.com.model.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/emp")
public class EmpController {

	@RequestMapping("/hello")
	@ResponseBody
	public String hello() {
		return "hello";
	}

	@RequestMapping("/emp1Info")
	@ResponseBody
	public Employee getEmployee() {
		Employee employee = new Employee();

		employee.setId(5466565);
		employee.setName("r kumar");
		employee.setSalary(78000);
		return employee;
	}

	@RequestMapping("/empAll")
	@ResponseBody
	public List<Employee> getAllEmployee() {
		return empList;
	}

	@RequestMapping("/empAll/{id}")
	@ResponseBody
	public Employee searchEmployee(@PathVariable("id") int id) {
		Employee emp=null;
		for(Employee e:empList){
	      if(e.getId()==id)
	    	  emp= e;
	      break;
		}
	 return  emp;
	}

	
	
	
	static List<Employee> empList = new ArrayList<Employee>();

	static {
		Employee empar[] = new Employee[5];
		int id[] = { 1001, 1002, 1003, 1004, 1005 };
		String name[] = { "suresh kumar", "mohan kumar", "p kumar", "r kumar", "prithviraj kumar" };
		float salary[] = { 12000, 45000, 67000, 90000, 34000 };

		for (int i = 0; i < salary.length; i++) {
			empar[i] = new Employee();
			empar[i].setId(id[i]);
			empar[i].setName(name[i]);
			empar[i].setSalary(salary[i]);
			empList.add(empar[i]);
		}
	}

}
