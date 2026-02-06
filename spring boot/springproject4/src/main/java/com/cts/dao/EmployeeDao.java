package com.cts.dao;

import com.cts.model.Employee;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class EmployeeDao {

    List<Employee> empList;

    public EmployeeDao() {
        empList = new ArrayList<>();
    }

    public Employee addEmployee(Employee employee) {
        empList.add(employee);
        return employee;
    }

    public List<Employee> getAllEmployee(){
     return  empList;
    }
}
// CRUD
