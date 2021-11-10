package org.capg.controller;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.capg.model.Employee;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// http://localhost:9090/hello

@RestController
public class HelloController {

	@RequestMapping("/hello")
	public String hello() {
		return "hello world";
	}

	@RequestMapping("/search/{id}")
	public Employee searchEmployee(@PathVariable("id") int id) {
		int x = 0;
		for (Employee e : empList) {
			if (e.getId() == id)
				return empList.get(x);
		}
		x++;
		return null;
	}

	@RequestMapping("/getAll")
	public List<Employee> getAllEmployee() {
		return empList;
	}

	static List<Employee> empList;

	static {
		empList = new ArrayList<>();
		Employee emp1 = new Employee();
		Employee emp2 = new Employee();
		Employee emp3 = new Employee();
		Employee emp4 = new Employee();

		emp1.setId(1001);
		emp1.setName("parahlad kumar");
		emp1.setSalary(12000.00f);

		emp2.setId(1002);
		emp2.setName("shivchandra sharma");
		emp2.setSalary(15000.00f);

		emp3.setId(1003);
		emp3.setName("mahadev kumar");
		emp3.setSalary(50000.00f);

		emp4.setId(1004);
		emp4.setName("manavendra sharma");
		emp4.setSalary(70000.00f);

		empList.add(emp1);
		empList.add(emp2);
		empList.add(emp3);
		empList.add(emp4);
	}
}
