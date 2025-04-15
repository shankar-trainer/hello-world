package com.example.service;

import com.example.exception.EmployeeException;
import com.example.model.Employee;
import com.example.repository.EmployeeRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {

    private static final Logger log = LoggerFactory.getLogger(EmployeeService.class);
    @Autowired
    private EmployeeRepository employeeRepository;

    public Employee addEmployee(Employee employee) {
        Optional<Employee> byId = employeeRepository.findById(employee.getId());
        if (byId.isPresent()) {
            log.error("id already present");
            throw new EmployeeException("id already present");
        } else {
            log.info("employee saved ");
            return employeeRepository.save(employee);
        }
    }

    public Employee deleteEmployee(int id) {
        Optional<Employee> byId = employeeRepository.findById(id);
        if (byId.isEmpty()) {
            log.error("id not present");
            throw new EmployeeException("id not present");
        } else {
            log.info("employee deleted ");
            employeeRepository.deleteById(id);
            return byId.get();
        }
    }

    /*    public List<Employee> findEmployeeByname(String name) {
            return employeeRepository.findByname(name);
        }*/
    public List<Employee> findEmployeeByname(String name) {
        if (employeeRepository.findByname(name).isEmpty()) {
            log.error("name not found");
            throw new EmployeeException("name not found");
        } else
            return employeeRepository.findByname(name);
    }

    public List<Employee> findByNameAndSalary(String name, float salary) {
        return employeeRepository.findByNameAndSalary(name, salary);
    }

    public Employee findEmployeeById(int id) {
        Optional<Employee> byId = employeeRepository.findById(id);
        if (byId.isEmpty()) {
            log.error("id not present");
            throw new EmployeeException("id not present");
        } else {
            log.info("employee found " + byId.get());
            return byId.get();
        }
    }

   public Employee updateEmployee(String name, int id) {
        if (employeeRepository.updateEmployee(name, id) != 1) {
            throw new EmployeeException("id not present");
        } else {
            employeeRepository.updateEmployee(name, id);
            return employeeRepository.findById(id).get();
        }
    }


    public Employee updateEmployeeById(Employee employee) {
        Optional<Employee> byId = employeeRepository.findById(employee.getId());
        if (byId.isEmpty()) {
            log.error("id not present");
            throw new EmployeeException("id not present");
        } else {
            log.info("employee updated " + employee);
            return employeeRepository.save(employee);
        }
    }

    public List<Employee> getAllEmployeeList() {
        if (employeeRepository.findAll().isEmpty()) {
            log.error("list is empty");
            throw new EmployeeException("employee list is empty");
        } else {
            log.info("all employee" + employeeRepository.findAll());
            return employeeRepository.findAll();
        }
    }

    public List<Employee> searchwithsalary(float salary) {
        if (employeeRepository.searchwithsalary(salary) == null) {
            throw new EmployeeException("no record found by salary");
        } else
            return employeeRepository.searchwithsalary(salary);
    }
}
