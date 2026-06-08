package com.cts.service;

import com.cts.exception.EmployeeException;
import com.cts.model.Employee;
import com.cts.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;

    public Employee addEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    public Employee updateEmployee(Employee employee) {

        Optional<Employee> byId = employeeRepository.findById(employee.getId());
        if(byId.isEmpty())
            throw new EmployeeException("id not present");
        return employeeRepository.save(employee);
    }

    public Employee searchEmployeeByid(int id) {
        Optional<Employee> byId = employeeRepository.findById(id);
        if(byId.isEmpty())
            throw new EmployeeException("id not present");
        return employeeRepository.findById(id).get();
    }

    public Employee deleteEmployeeByid(int id) {
        Optional<Employee> byId = employeeRepository.findById(id);
        if(byId.isEmpty())
            throw new EmployeeException("id not present");
        var emp = employeeRepository.findById(id).get();
        employeeRepository.deleteById(id);
        return emp;
    }

    public List<Employee> getAllEmployee() {
        if(employeeRepository.findAll().size()==0)
            throw new EmployeeException("list is empty");
        return employeeRepository.findAll();
    }


}
