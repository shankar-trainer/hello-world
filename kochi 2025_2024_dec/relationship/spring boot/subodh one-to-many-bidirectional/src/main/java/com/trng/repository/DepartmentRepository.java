package com.trng.repository;

import com.trng.model.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department, Long> {

    public Department findAllByDepartmentName(String departmentName);
}
