package com.cts.web;

import com.cts.exception.EmployeeException;
import com.cts.model.Employee;
import com.cts.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/employee")
    public ResponseEntity<Employee> addEmployee(@RequestBody Employee employee) {
        try {
            return new ResponseEntity<>(employeeService.addEmployee(employee), HttpStatus.CREATED);
        } catch (EmployeeException e) {
            return new ResponseEntity(e.getMessage(), HttpStatus.NOT_FOUND);
        }
    }

    @PutMapping("/employee")
    public ResponseEntity<Employee> updateEmployee(@RequestBody Employee employee) {
        try {
            return new ResponseEntity<>(employeeService.updateEmployee(employee), HttpStatus.CREATED);
        } catch (EmployeeException e) {
            return new ResponseEntity(e.getMessage(), HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("/employee")
    public ResponseEntity<List<Employee>> getAllEmployee() {
        try {
            return new ResponseEntity<List<Employee>>(employeeService.getAllEmployee(), HttpStatus.FOUND);
        } catch (EmployeeException e) {
            return new ResponseEntity(e.getMessage(), HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("/employee/{id}")
    public ResponseEntity<Employee> searchEmployeeByid(@PathVariable("id") int id) {
        try {
            return new ResponseEntity<>(employeeService.searchEmployeeByid(id), HttpStatus.FOUND);
        } catch (EmployeeException e) {
            return new ResponseEntity(e.getMessage(), HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/employee/{id}")
    public ResponseEntity<Employee> deleteEmployeeByid(@PathVariable("id") int id) {
        try {
            return new ResponseEntity<>(employeeService.deleteEmployeeByid(id), HttpStatus.FOUND);
        } catch (EmployeeException e) {
            return new ResponseEntity(e.getMessage(), HttpStatus.NOT_FOUND);
        }
    }


}
