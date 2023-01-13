package com.audintel.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.audintel.model.Employee;

public interface EmployeeRepository extends  JpaRepository<Employee, Integer> {

}
