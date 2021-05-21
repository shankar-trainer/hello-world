package com.cts.web;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cts.model.Employee;

@Controller
@RequestMapping("/emp")

public class EmployeeController {

	static Employee employee[] = new Employee[5];
	static {
		employee[0] = new Employee();
		employee[0].setEmpId(7001);
		employee[0].setEmpName("suresh kumar");
		employee[0].setEmpsalary(70000.0f);

		employee[1] = new Employee();
		employee[1].setEmpId(7002);
		employee[1].setEmpName("ramesh kumar");
		employee[1].setEmpsalary(80000.0f);

		employee[2] = new Employee();
		employee[2].setEmpId(7003);
		employee[2].setEmpName("maha laxmi");
		employee[2].setEmpsalary(75000.0f);

		employee[3] = new Employee();
		employee[3].setEmpId(7004);
		employee[3].setEmpName("uday kumar");
		employee[3].setEmpsalary(90000.0f);

		employee[4] = new Employee();
		employee[4].setEmpId(7005);
		employee[4].setEmpName("aditya kumar");
		employee[4].setEmpsalary(95000.0f);
	}

	@RequestMapping("/empArray")
	@ResponseBody
	public Employee[] getEmployee() {
		return employee;
	}

	List<Employee> empList;

	@RequestMapping("/empList")
	@ResponseBody
	public List<Employee> getEmployeeList() {
		empList = new ArrayList<Employee>();
		for (Employee employee : employee) {
			empList.add(employee);
		}
		return empList;
	}

	@RequestMapping("/empSearch/{id}")
	@ResponseBody
	public Employee getEmployeeSearch(@PathVariable("id") Integer id) {

		empList = null;
		empList = getEmployeeList();
		Employee emp1 = new Employee();
		
		emp1.setEmpId(id);

		Employee emp2 = null;
		
			for (Employee employee : empList) {
				
				if (employee.getEmpId() .equals(emp1.getEmpId())) {
					emp2 = new Employee();
					emp2.setEmpId(emp1.getEmpId());
					emp2.setEmpName(employee.getEmpName());
					emp2.setEmpsalary(employee.getEmpsalary());
					break;
				}
			}

		
		return emp2;
	}

	@RequestMapping("/empListByName")
	@ResponseBody
	public List<Employee> getEmployeeListSortByName() {
		empList = null;
		empList = getEmployeeList();

		Comparator<Employee> comparator = (o1, o2) -> {
			return o1.getEmpName().compareTo(o2.getEmpName());
		};

		Collections.sort(empList, comparator);
		return empList;
	}

	@RequestMapping("/empListSortBySalary")
	@ResponseBody
	public List<Employee> getEmployeeListSortBySalary() {
		empList = null;
		empList = getEmployeeList();

		Comparator<Employee> comparator = (o1, o2) -> {
			return new Float(o1.getEmpsalary()).compareTo(new Float(o2.getEmpsalary()));
		};

		Collections.sort(empList, comparator);
		return empList;
	}

	@RequestMapping("/hello")
	@ResponseBody
	public String hello() {
		return "hello world";
	}

	@RequestMapping("/employee")
	@ResponseBody
	public Employee getEmp() {
		Employee employee = new Employee();
		employee.setEmpId(10001);
		employee.setEmpName("hemant kumar");
		employee.setEmpsalary(20000.00f);
		return employee;
	}

}
