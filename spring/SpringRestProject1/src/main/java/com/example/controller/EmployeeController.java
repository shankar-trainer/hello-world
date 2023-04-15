package com.example.controller;

import com.example.model.Employee;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by shankar on 4/15/2023.
 */
@RestController
@RequestMapping("/")
//http://localhost:8080/SpringRest/all
public class EmployeeController {
    static List<Employee> empList;

    static {
        empList = new ArrayList<Employee>();
        empList.add(new Employee(10001, "ram kumar", 20000));
        empList.add(new Employee(10002, "shyam kumar", 25000));
        empList.add(new Employee(10003, "mohan kumar", 70000));
        empList.add(new Employee(10004, "ramesh kumar", 50000));
        empList.add(new Employee(10005, "suesh kumar", 29000));
        empList.add(new Employee(10006, "diwakar kumar", 45000));
    }

    //@RequestMapping("/all")
    @GetMapping("/all")
    public List<Employee> getEmployeeList() {
        return empList;
    }

    @GetMapping("/search/{id}")
    public Employee searchEmployee(@PathVariable("id") int empId) {
        for (Employee e : empList) {
            if (e.getEmpId() == empId)
                return e;
        }
        return null;
    }

    @DeleteMapping("/delete/id")
    public Employee deleteEmployee(@PathVariable("id") int empId) {
        if (searchEmployee(empId) != null) {
            Employee employee = searchEmployee(empId);
            empList.remove(employee);
            System.out.println("deleted employee "+employee);
            return employee;
        }
        return null;
    }

//@putmapping not supported in springRest
    @PutMapping("/update")
    public Employee updateEmployee(@RequestBody Employee emp) {
        if(searchEmployee(emp.getEmpId())!=null){
            Employee employee = searchEmployee(emp.getEmpId());
            int i = empList.indexOf(employee);
            empList.removeAll(Collections.singleton(employee));//remove all occurrences
            employee.setEmpName(emp.getEmpName());
            employee.setEmpSalary(emp.getEmpSalary());
            empList.add(i,employee);
              return employee;
        }
        return null;
    }

    @PostMapping("/add")
    public Employee addEmployee(@RequestBody Employee emp) {
        if (searchEmployee(emp.getEmpId()) == null) {
            empList.add(emp);
            return emp;
        }
        return null;
    }
}
