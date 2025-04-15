package com.cg.DemoConfigurationManagement.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.DemoConfigurationManagement.dto.Employee;

public interface EmployeeRepository extends JpaRepository<Employee,Integer> {

}
