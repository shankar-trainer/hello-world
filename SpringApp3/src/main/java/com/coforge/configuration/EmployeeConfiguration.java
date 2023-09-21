package com.coforge.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.coforge.model.Employee;

@Configuration
public class EmployeeConfiguration {

	@Bean
	public Employee getEmployee() {
		Employee employee=new Employee();
		employee.setEmpId(5665565);
		employee.setEmpName("sudhir babu");
		employee.setEmpSalary(20000);
		return employee;
	}
}
