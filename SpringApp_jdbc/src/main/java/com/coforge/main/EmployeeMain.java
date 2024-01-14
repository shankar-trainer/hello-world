package com.coforge.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.coforge.config.SpringAppConfig;
import com.coforge.dao.EmployeeDao;
import com.coforge.dao.EmployeeDaoImpl;
import com.coforge.model.Employee;

public class EmployeeMain {

	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(SpringAppConfig.class);

		EmployeeDao dao = context.getBean(EmployeeDaoImpl.class);

		Employee employee = new Employee();
		employee.setId(90002);
		employee.setName("suman sharma");
		employee.setSalary(34000);

//		try {
//		Employee emp1 = dao.saveEmployee(employee);
//		if (emp1 != null)
//			System.out.println("Record added " + emp1);
//		else
//			System.err.println("some problem");
//		}
//		catch (Exception e) {
//			System.err.println(e.getMessage());
//		}
		
		System.out.println("get all employee list");
		dao.getAllEmployee().forEach(a->System.out.println(a));
		
		
	}
}
