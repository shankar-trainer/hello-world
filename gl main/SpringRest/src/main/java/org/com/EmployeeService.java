package org.com;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeService {

	// http://localhost:9090/go/1001

	@RequestMapping("/go/{id}")
	public String disp(@PathVariable int id) {

		return "hello ur id is " + id;
	}

	// http://localhost:9090/go/1001/ram kumar

	@RequestMapping("/go/{id}/{name}")
	public String disp1(@PathVariable int id, @PathVariable String name) {
		return "hello ur id  is " + id + "<br>name is " + name;
	}

	@RequestMapping("/empInfo")
	public Employee getEmp() {
		Employee emp1 = new Employee();
		emp1.setId(1001);
		emp1.setName("sundar c ");
		emp1.setSalary(67000);
		return emp1;
	}

	@RequestMapping("/empInfoList")
	public List<Employee> getEmpList() {

		List<Employee> list1 = new ArrayList<Employee>();

		Employee emp1 = new Employee();
		emp1.setId(1001);
		emp1.setName("sundar c ");
		emp1.setSalary(67000);

		list1.add(emp1);

		Employee emp2 = new Employee();
		emp2.setId(1002);
		emp2.setName("mohan b ");
		emp2.setSalary(69000);

		list1.add(emp2);

		Employee emp3 = new Employee();
		emp3.setId(1003);
		emp3.setName("suresh c ");
		emp3.setSalary(70000);

		list1.add(emp3);

		Employee emp4 = new Employee();
		emp4.setId(1004);
		emp4.setName("rajes b ");
		emp4.setSalary(89000);

		list1.add(emp4);
		return list1;
	}

	@RequestMapping("/empInfoList/{id}")
	public
	// ResponseEntity<Employee>
	Employee SearchEmpList(@PathVariable int id) {

		List<Employee> list1 = new ArrayList<Employee>();

		Employee emp1 = new Employee();
		emp1.setId(1001);
		emp1.setName("sundar c ");
		emp1.setSalary(67000);

		list1.add(emp1);

		Employee emp2 = new Employee();
		emp2.setId(1002);
		emp2.setName("mohan b ");
		emp2.setSalary(69000);

		list1.add(emp2);

		Employee emp3 = new Employee();
		emp3.setId(1003);
		emp3.setName("suresh c ");
		emp3.setSalary(70000);

		list1.add(emp3);

		Employee emp4 = new Employee();
		emp4.setId(1004);
		emp4.setName("rajes b ");
		emp4.setSalary(89000);

		list1.add(emp4);

		Employee e = null;
		boolean status = false;
		for (Employee employee : list1) {
			if (employee.getId() == id) {
				e = employee;
				status = true;
				break;
			}
		}

		return e;

		/*
		 * if(status) return new ResponseEntity<Employee>(HttpStatus.OK); else
		 * return new ResponseEntity<Employee>(HttpStatus.NOT_FOUND);
		 */
	}
}
