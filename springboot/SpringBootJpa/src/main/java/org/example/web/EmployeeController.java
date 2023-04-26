package org.example.web;

import org.example.dao.EmployeeDao;
import org.example.model.Employee;
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
    EmployeeDao dao;

    @GetMapping("/allemplolyee")
    public List<Employee> getAllEmployee() {
        return dao.getAllEmployee();
    }

    @GetMapping("/searchemployee/{id}")
    public Employee searchEmployee(@PathVariable("id") int id) {
        return dao.searchEmployee(id);
    }

    @PostMapping ("/addemployee")
    public Employee addEmployee(@RequestBody Employee employee) {
        return dao.addEmployee(employee);
    }

     @PutMapping ("/updateemployee")
    public Employee updateEmployee(@RequestBody Employee employee) {
        return dao.updateEmployee(employee);
    }

    @DeleteMapping  ("/deleteemployee/{id}")
    public Employee deleteEmployee(@PathVariable("id") int id ) {
        return dao.deleteEmployee(id);
    }





}
