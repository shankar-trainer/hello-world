package org.com.config;

import org.com.model.Employee;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class EmployeeConfig {

	Employee emp1;

	@Bean
	public Employee getEmpBean() {
		emp1 = null;
		emp1 = new Employee();
		emp1.setId(7887887);
		emp1.setName("manoj kumar");
		emp1.setSalary(78000);
		return emp1;
	}

}
