package com.cognizant.main;

import java.util.Map;
import java.util.Map.Entry;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cognizant.model.Employee;
import com.cognizant.service.EmployeeException;
import com.cognizant.service.EmployeeServiceImpl;

public class EmployeeClient {

	public static void main(String[] args) {
		BeanFactory ctx = new ClassPathXmlApplicationContext("application.xml");
		EmployeeServiceImpl service = ctx.getBean(EmployeeServiceImpl.class);

		Employee emp1 = new Employee();
		Employee emp2 = new Employee();
		Employee emp3 = new Employee();
		try {
			emp1.setEmpId(100001);
			emp1.setEmpName("piyush kumar");
			emp1.setEmpSalary(6700);

			emp2.setEmpId(100002);
			emp2.setEmpName("devansh kumar");
			emp2.setEmpSalary(8000);

			emp3.setEmpId(100003);
			emp3.setEmpName("sarvesh kumar");
//		emp3.setEmpSalary(9000);
			emp3.setEmpSalary(0);

			service.saveEmployee(emp1);
			service.saveEmployee(emp2);
			service.saveEmployee(emp3);

			Map<Integer, Employee> allEmployee = service.getAllEmployee();

			for (Entry<Integer, Employee> e : allEmployee.entrySet()) {
				Employee e1 = e.getValue();
				System.out.println(e1.getEmpId() + "\t" + e1.getEmpName() + "\t" + e1.getEmpSalary());

			}
		} catch (EmployeeException e) {
			System.out.println(e.getMessage());
		}
	}
}
