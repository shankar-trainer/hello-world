package com.cognizant.main;

import java.util.Map;
import java.util.Map.Entry;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cognizant.exception.EmployeeException;
import com.cognizant.model.Employee;
import com.cognizant.service.EmployeeService;
import com.cognizant.service.EmployeeServiceImpl;

public class EmployeeMain {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("application.xml");

		EmployeeService service = ctx.getBean(EmployeeServiceImpl.class);

		Employee employee1 = new Employee();
		Employee employee2 = new Employee();
		Employee employee3 = new Employee();

		employee1.setEmpId(1001);
		employee1.setEmpName("arvind kumar");
		employee1.setEmpsalary(20000);

		employee2.setEmpId(1002);
		employee2.setEmpName("suman kumar");
		employee2.setEmpsalary(12000);

		employee3.setEmpId(1003);
		employee3.setEmpName("vimal kumar");
		employee3.setEmpsalary(70000);

		try {
			 //service.retrieveAllEmployee();
			 
			service.saveEmployee(employee1);
//			service.saveEmployee(employee1);
			service.saveEmployee(employee2);
			service.saveEmployee(employee3);

			Map<Integer, Employee> retrieveAllEmployee = service.retrieveAllEmployee();

			for (Entry<Integer, Employee> entry : retrieveAllEmployee.entrySet()) {
				Employee e = entry.getValue();

				System.out.println(e.getEmpId() + "  " + e.getEmpName() + "  " + e.getEmpsalary());
			}
			
			
			Employee findEmployee = service.findEmployee(1);
			
			System.out.println(findEmployee.getEmpId()+"\t"+findEmployee.getEmpName()+"\t"+findEmployee.getEmpsalary());

		} catch (EmployeeException e) {
			System.err.println(e.getMessage());
		}

	}
}
