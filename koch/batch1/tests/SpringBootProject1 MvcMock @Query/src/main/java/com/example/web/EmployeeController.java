package com.example.web;

import com.example.exception.EmployeeException;
import com.example.model.Employee;
import com.example.service.EmployeeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/emp")
@Slf4j
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/employee2/{salary}")
    public ResponseEntity<List<Employee>> searchWithsalary(@PathVariable("salary") float salary) {
        try {
            return new ResponseEntity<>(employeeService.searchWithsalary(salary), HttpStatus.FOUND);
        } catch (EmployeeException e) {
            return new ResponseEntity(e.getMessage(), HttpStatus.NOT_FOUND);
        }
    }
    @PutMapping("/employee/{salary}/{id}")
    public  ResponseEntity<Employee> updateEmployeeSalary(@PathVariable("salary") float salary, @PathVariable("id") int id) {
   try{
       return new ResponseEntity<>(employeeService.updateEmployeeSalary(salary,id), HttpStatus.FOUND);
   }
   catch (EmployeeException e){
       return new ResponseEntity(e.getMessage(), HttpStatus.NOT_FOUND);
   }

    }

        @PostMapping("/employee")
    public ResponseEntity<Employee> addEmployee(@RequestBody Employee employee) {
        try {
            log.info("addEmployee called ");
            return new ResponseEntity<>(employeeService.addEmployee(employee), HttpStatus.CREATED);
        } catch (EmployeeException e) {
            log.error("addEmployee error  " + e.getMessage());
            return new ResponseEntity(e.getMessage(), HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("/employee")
    public ResponseEntity<List<Employee>> getAllEmployeeList() {
        try {
            log.info("getAllEmployeeList called ");
            return new ResponseEntity<>(employeeService.getAllEmployeeList(), HttpStatus.FOUND);
        } catch (EmployeeException e) {
            log.error("getAllEmployeeList error  " + e.getMessage());
            return new ResponseEntity(e.getMessage(), HttpStatus.NOT_FOUND);
        }
    }

    @PutMapping("/employee")
    public ResponseEntity<Employee> updateEmployeeById(@RequestBody Employee employee) {
        try {
            log.info("updateEmployeeById called ");
            return new ResponseEntity<>(employeeService.updateEmployeeById(employee), HttpStatus.FOUND);
        } catch (EmployeeException e) {
            log.error("updateEmployeeById error  " + e.getMessage());
            return new ResponseEntity(e.getMessage(), HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/employee/{id}")
    public ResponseEntity<Employee> deleteEmployee(@PathVariable("id") int id) {
        try {
            log.info("deleteEmployee called ");
            return new ResponseEntity<>(employeeService.deleteEmployee(id), HttpStatus.OK);
        } catch (EmployeeException e) {
            log.error("deleteEmployee error  " + e.getMessage());
            return new ResponseEntity(e.getMessage(), HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("/employee/{id}")
    public ResponseEntity<Employee> searchEmployee(@PathVariable("id") int id) {
        try {
            log.info("searchEmployee called ");
            return new ResponseEntity<>(employeeService.findEmployeeById(id), HttpStatus.FOUND);
        } catch (EmployeeException e) {
            log.error("searchEmployee error  " + e.getMessage());
            return new ResponseEntity(e.getMessage(), HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("/employee1/{name}")
    public List<Employee> findEmployeeByname(@PathVariable("name") String name) {
        return employeeService.findEmployeeByname(name);
    }

    @GetMapping("/employee/{name}/{salary}")
    public List<Employee> findEmployeeBynameAndsalary(@PathVariable("name") String name,
                                                      @PathVariable("salary") float salary) {
        return employeeService.findByNameAndSalary(name, salary);
    }

}
