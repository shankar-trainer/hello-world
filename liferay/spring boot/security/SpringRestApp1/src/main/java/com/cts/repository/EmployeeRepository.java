package com.cts.repository;

import com.cts.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository  extends JpaRepository<Employee,Integer> {
}
