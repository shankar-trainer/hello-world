package com.abc.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.abc.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
