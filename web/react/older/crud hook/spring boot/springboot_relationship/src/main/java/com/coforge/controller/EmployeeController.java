package com.coforge.controller;

import com.coforge.exception.EmployeeException;
import com.coforge.model.Employee;
import com.coforge.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
//@CrossOrigin("http://localhost:4200/")
@CrossOrigin("http://localhost:3000")
// donot add / in last after 3000

public class EmployeeController {

    @Autowired
    private EmployeeService service;

//    @GetMapping("/employee")
//    public List<Employee> getAllEmployee() {
//        try {
//            return  service.getAllEmployee();
//        } catch (EmployeeException e) {
//            throw new RuntimeException(e);
//        }
//    }

    @GetMapping("/employee")
    public ResponseEntity<List<Employee>> getAllEmployee() {
        try {
            return new ResponseEntity<>(service.getAllEmployee(), HttpStatus.CREATED);
        } catch (EmployeeException e) {
            System.err.println(e.getMessage()+" ..............");
            return new ResponseEntity(e.getMessage(), HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("/employee/{id}")
    public ResponseEntity<Employee> searchEmployeeByid(@PathVariable int id){
        try {
            return new ResponseEntity<>(service.searchEmployeeByid(id), HttpStatus.CREATED);
        } catch (EmployeeException e) {
            return new ResponseEntity(e.getMessage(), HttpStatus.NOT_FOUND);
        }
    }

    @PutMapping("/employee")
    public ResponseEntity<Employee> updateEmployee(@RequestBody Employee emp) {
        try {
            return new ResponseEntity<>(service.updateEmployee(emp), HttpStatus.CREATED);
        } catch (EmployeeException e) {
            return new ResponseEntity(e.getMessage(), HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/employee/{id}")
    public ResponseEntity<Employee> removeEmployeeById(@PathVariable int id) {
        try {
            return new ResponseEntity<>(service.removeEmployeeById(id), HttpStatus.CREATED);
        } catch (EmployeeException e) {
            return new ResponseEntity(e.getMessage(), HttpStatus.NOT_FOUND);
        }
    }


    @PostMapping("/employee")
    public ResponseEntity<Employee> addEmployee(@RequestBody Employee emp) {
        try {
            return new ResponseEntity<>(service.addEmployee(emp), HttpStatus.CREATED);
        } catch (EmployeeException e) {
            return new ResponseEntity(e.getMessage(), HttpStatus.NOT_FOUND);
        }
    }

//    @PostMapping("/employee")
//    public Employee addEmployee(@RequestBody  Employee emp) {
//        try {
//            return service.addEmployee(emp);
//        } catch (EmployeeException e) {
//            throw new RuntimeException(e);
//        }
//     }
}
