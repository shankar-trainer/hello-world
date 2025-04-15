package com.example.web;

import com.example.feign.EmployeeFeign;
import com.example.model.Employee;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
@Slf4j
public class EmpController {

    @Autowired
    private EmployeeFeign employeeFeign;

    @GetMapping("/employee")
    public ResponseEntity<List<Employee>> getAllEmployeeList() {
        return employeeFeign.getAllEmployeeList();
    }

    @PostMapping("/employee")
    public ResponseEntity<Employee> addEmployee(@RequestBody Employee employee) {
        return employeeFeign.addEmployee(employee);
    }

    @DeleteMapping("/employee/{id}")
    public ResponseEntity<Employee> deleteEmployee(@PathVariable("id") int id) {
       log.info("delete called with id "+id);
        return employeeFeign.deleteEmployee(id);
    }

    @GetMapping("/employee/{id}")
    public ResponseEntity<Employee> searchEmployee(@PathVariable("id") int id) {
        return  employeeFeign.searchEmployee(id);
    }
}
