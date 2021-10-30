package com.capg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.capg.model.Employee;
import com.capg.service.EmployeeService;

@SpringBootApplication
public class AppMain {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(AppMain.class, args);

		EmployeeService dao = ctx.getBean(EmployeeService.class);

		Employee emp = new Employee();
		//emp.setId(10003);
		emp.setName("amitha krishnan");
		emp.setSalary(65000);

		if (dao.addEmployee(emp))
			System.out.println("Employee added ");
		else
			System.out.println("Employee Already Present ");

		for (Employee e : dao.getAllEmployee()) {
			System.out.println(e.getId() + "  " + e.getName() + "   " + e.getSalary());
		}
		
		Employee emp1=new Employee();
		emp1.setId(10001);
		emp1.setName("amit kumar");
		emp1.setSalary(12000);
		
		Employee e2=dao.searchEmployee(emp1);
		
		if(e2!=null){
			System.out.println("found employee");
			System.out.println("\t"+e2.getId()+"  "+e2.getName()+"  "+e2.getSalary());
		}		
		else
			System.out.println("searched employee not found");
		
		if(dao.deleteEmployee(emp1))
			System.out.println("employee deleted ");
		else 
			System.out.println("employee not present");
		

	}
}
