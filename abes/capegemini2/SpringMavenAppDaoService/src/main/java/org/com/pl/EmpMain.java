package org.com.pl;

import org.com.model.Employee;
import org.com.service.EmployeeService;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmpMain {

	public static void main(String[] args) {

		BeanFactory beanFactory = new ClassPathXmlApplicationContext("employee.xml");
		EmployeeService service = beanFactory.getBean("empService", EmployeeService.class);

		Employee employee[] = new Employee[3];

		int id1[] = { 2001, 1667, 1899 };
		String name1[] = { "pankaj kumar", "rajesh kumar", "mandeep kumar" };
		float salary1[] = { 12000, 89000, 30000 };

		for (int i = 0; i < employee.length; i++) {
			employee[i] = new Employee();
			employee[i].setId(id1[i]);
			employee[i].setName(name1[i]);
			employee[i].setSalary(salary1[i]);
			service.saveEmployee(employee[i]);
		}

		service.getAllEmployee();

		Employee employee2 = new Employee();
		employee2.setId(1899);

		service.findEmployee(employee2);

		employee2.setId(189899);
		service.findEmployee(employee2);

	}
}
