package org.example.service;


import org.example.dao.EmployeeDao;
import org.example.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * Created by shankar on 4/26/2023.
 */
@Service
public class EmployeeService {

    @Autowired
    EmployeeDao dao;

    public List<Employee> getAllEmployee() {
        return dao.findAll();
    }

    public Employee searchEmployee(int id) {
        Optional<Employee> byId = dao.findById(id);

        if (byId.isPresent())
            return byId.get();
        else
            return null;
    }


    public Employee addEmployee(Employee emp) {
        Optional<Employee> byId = dao.findById(emp.getEmpId());

        if (byId.isPresent())
            return null;
        else
            return dao.save(emp);
    }

    public Employee updateEmployee(Employee emp) {
        Optional<Employee> byId = dao.findById(emp.getEmpId());

        if (byId.isPresent())
            return dao.save(emp);
        else
            return null;

    }


    public Employee removeEmployee(int id) {

        Optional<Employee> byId = dao.findById(id);

        if (byId.isPresent()) {
            Employee employee = byId.get();

            dao.deleteById(id);
            return employee;
        }

        return null;
    }


}
