package com.coforge.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.coforge.model.Department;

@Configuration
public class JavaConfig {

	@Bean
	public Department getDepartmentBean() {
		Department department = new Department();
		department.setDeptId(565656);
		department.setDeptName("training depratment");
		department.setDeptLocation("greater noida");
		return department;
	}
}
