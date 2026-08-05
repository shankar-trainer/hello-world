package com.coforge.service;

import com.coforge.dao.EmployeeRepository;
import com.coforge.exception.EmployeeException;
import com.coforge.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository repository;

    public Employee addEmployee(Employee emp) throws EmployeeException {
        return repository.save(emp);
    }

    public Employee searchEmployeeByid(int id) throws EmployeeException {
        if (repository.findById(id).isEmpty())
            throw new EmployeeException("employee with id  " + id + " is not present");
        return repository.findById(id).get();
    }

    public Employee updateEmployee(Employee emp) throws EmployeeException {
        if (repository.findById(emp.getId()).isEmpty())
            throw new EmployeeException("employee with id  " + emp.getId()+ " is not present");

        return repository.save(emp);
    }



    public Employee removeEmployeeById(int id) throws EmployeeException {
        if (repository.findById(id).isEmpty())
            throw new EmployeeException("employee with id  " + id + " is not present");

        var emp = repository.findById(id).get();
        repository.deleteById(id);
        return emp;
    }


    public List<Employee> getAllEmployee() throws EmployeeException {
        if (repository.findAll().isEmpty()) {
            throw new EmployeeException("employee list is empty");
        } else {
            return repository.findAll();
        }
    }


}
