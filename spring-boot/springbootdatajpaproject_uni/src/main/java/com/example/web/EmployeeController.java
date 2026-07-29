package com.example.web;

import com.example.dao.EmployeeDao;
import com.example.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/emp")
public class EmployeeController {

    @Autowired
    private EmployeeDao dao;

    @GetMapping("/employee")
    public List<Employee> getAllEmployees() {
        return dao.findAll();
    }

    @PostMapping("/employee")
    public Employee addEmployee(@RequestBody Employee employee) {
        return dao.save(employee);
    }

    @PutMapping("/employee")
    public Employee updateEmployee(@RequestBody Employee employee) {
        return dao.save(employee);
    }

    @GetMapping("/employee/{id}")
    public Employee searchEmployeeById(@PathVariable("id") int id) {
        Optional<Employee> byId = dao.findById(id);
        if (byId.isEmpty())
            return null;
        else if (byId.isPresent())
            return byId.get();
        return null;
    }

    @DeleteMapping("/employee/{id}")
    public Employee deleteEmployeeById(@PathVariable("id") int id) {
        Optional<Employee> byId = dao.findById(id);
//       Employee e= byId.get();
        var e = byId.get();
        if (byId.isEmpty())
            return null;
        else if (byId.isPresent()) {
            dao.deleteById(id);
            return e;
        }
        return null;
    }

}
//http://localhost:8080/emp/employee