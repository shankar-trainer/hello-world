package com.abc.service;

import com.abc.dao.EmployeeRepository;
import com.abc.exception.EmployeeExeption;
import com.abc.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository repository;

    public List<Employee> getEmployeeList() throws EmployeeExeption {
        if (repository.findAll().isEmpty())
            throw new EmployeeExeption("list is empty");
        else
            return repository.findAll();
    }

    public Employee searchEmployee(int id) throws EmployeeExeption {
        if (repository.findById(id).isPresent())
            return repository.findById(id).get();
        else
            throw new EmployeeExeption("id not present");
    }

    public Employee addEmployee(Employee employee) throws EmployeeExeption {

        if (repository.findById(employee.getEmployeeId()).isPresent())
            throw new EmployeeExeption("id already present");

        return repository.save(employee);

    }
}



