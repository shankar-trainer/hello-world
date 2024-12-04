package com.coforge.collection.service;

import com.coforge.collection.model.Employee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeService {
    private List<Employee> empList;

    public EmployeeService() {
        empList = new ArrayList<>();
    }

    public void addEmployee(Employee emp) {
        empList.add(emp);
    }

    public boolean searchEmployee(Employee emp) {
        for (Employee emp1 : empList) {
            if (emp.equals(emp1))
                return true;
        }
        return false;
    }

    public boolean searchEmployee1(Employee emp) {
        return empList.contains(emp);
    }

    public boolean UpdateEmployee1(Employee emp, Employee emp1) {
        if (empList.contains(emp)) {
            emp.setId(emp1.getId());
            emp.setName(emp1.getName());
            emp.setSalary(emp1.getSalary());
            return true;
        }
        return false;
    }

    public boolean removeEmployee1(Employee emp) {
        return empList.remove(emp);
    }


    public List<Employee> getAllEmployee() {
        return empList;
    }

}
