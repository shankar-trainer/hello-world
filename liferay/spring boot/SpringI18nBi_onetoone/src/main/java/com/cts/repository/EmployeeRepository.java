package com.cts.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cts.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
