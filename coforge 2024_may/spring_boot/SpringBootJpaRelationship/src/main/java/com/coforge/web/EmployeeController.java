package com.coforge.web;

import com.coforge.dao.EmployeeRepository;
import com.coforge.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmployeeController {
    @Autowired
    EmployeeRepository employeeRepository;

    @GetMapping("/allEmployee")
    public List<Employee> getAllEmployee(){
        return employeeRepository.findAll();
    }

}
