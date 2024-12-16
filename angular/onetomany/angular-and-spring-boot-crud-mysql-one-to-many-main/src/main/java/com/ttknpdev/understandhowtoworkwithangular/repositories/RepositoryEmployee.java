package com.ttknpdev.understandhowtoworkwithangular.repositories;

import com.ttknpdev.understandhowtoworkwithangular.entities.one.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
// import org.springframework.data.jpa.repository.Query;

public interface RepositoryEmployee extends JpaRepository<Employee,Long> {
    /*@Query(value = "select * from employees;",nativeQuery = true)
    Iterable<Employee> readsOnlyEmployee();*/
}
