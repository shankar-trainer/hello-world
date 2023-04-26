package org.example.web;

import org.example.dao.EmployeeDao;
import org.example.model.Employee;
import org.example.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by shankar on 4/25/2023.
 */
@RestController
@RequestMapping("/")
public class EmployeeController {

    @Autowired
    EmployeeService service;

    @GetMapping("/allemployee")
    public List<Employee> getAllEmployee() {
        return service.getAllEmployee();
    }

    @GetMapping("/searchemployee/{id}")
    public Employee searchEmployee(@PathVariable("id") int id) {
        return service.searchEmployee(id);
    }

    @PostMapping ("/addemployee")
    public Employee addEmployee(@RequestBody Employee employee) {
        return service.addEmployee(employee);
    }

     @PutMapping ("/updateemployee")
    public Employee updateEmployee(@RequestBody Employee employee) {
        return service.updateEmployee(employee);
    }

    @DeleteMapping  ("/deleteemployee/{id}")
    public Employee deleteEmployee(@PathVariable("id") int id ) {

        return service.removeEmployee(id);
    }
}
