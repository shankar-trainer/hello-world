package com.cognizant.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cognizant.exception.EmployeException;
import com.cognizant.model.Employee;
import com.cognizant.service.EmployeeServiceImpl;

public class EmployeeClient {

	public static void main(String[] args) {

		ApplicationContext ctx = new ClassPathXmlApplicationContext("application.xml");
		EmployeeServiceImpl service = ctx.getBean(EmployeeServiceImpl.class);

		Employee emp1 = new Employee();
		Employee emp2 = new Employee();

		emp1.setId(10001);
		emp1.setName("amar kumar");
		emp1.setSalary(20000);

//		emp2.setId(10002);
		emp2.setId(0);
		emp2.setName("suman kumar");
		emp2.setSalary(50000);

		try {
			service.saveEmployee(emp1);
			service.saveEmployee(emp2);

			for (Employee emp : service.getAllEmployee()) {
				System.out.println(emp.getId() + "\t" + emp.getName() + "\t" + emp.getSalary());
			}
		} catch (EmployeException e) {
			System.err.println(e.getMessage());
		}

	}

}
