package com.example.web;

import com.example.model.Employee;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class EmployeeController {

    @RequestMapping("/welcome")
    public String hello() {
        return "hello world";
    }

    @RequestMapping("/emp1")
    public Employee getEmployee() {
        Employee employee = new Employee();
        employee.setId(10001);
        employee.setName("aman kumar");
        employee.setSalary(20000);
        return  employee;
    }
}

