package com.example.service;

import com.example.exception.EmployeeException;
import com.example.model.Employee;
import com.example.repository.EmployeeRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

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

    public List<Employee> findEmployeeByname(String name) {
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

    public List<Employee> searchWithsalary(float salary){
            if(employeeRepository.searchWithsalary(salary).isEmpty())
              throw new EmployeeException("no record found with salary "+salary);
            else
                return employeeRepository.searchWithsalary(salary);
    }

    public Employee updateEmployeeSalary(float salary, int id){
        if(employeeRepository.findById(id).isEmpty())
            throw new EmployeeException("id not present");
        else {
            employeeRepository.updateEmployeeSalary(salary, id);
             return employeeRepository.findById(id).get();
        }
    }

}
