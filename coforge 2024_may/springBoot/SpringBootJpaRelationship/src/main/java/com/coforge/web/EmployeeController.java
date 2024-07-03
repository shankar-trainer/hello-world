package com.coforge.web;

import com.coforge.dao.AddressRepository;
import com.coforge.dao.EmployeeRepository;
import com.coforge.model.Address;
import com.coforge.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class EmployeeController {
    @Autowired
    EmployeeRepository employeeRepository;

    @Autowired
    AddressRepository addressRepository;

    @GetMapping("/allEmployee")
    public List<Employee> getAllEmployee() {
        return employeeRepository.findAll();
    }

    @PostMapping("/allEmployee")
    public Employee addEmployee(@RequestBody Employee employee) {
        return employeeRepository.save(employee);
    }

    @GetMapping("/allEmployee/{id}")
    public Employee searchEmployee(@PathVariable("id") int id) {
        return employeeRepository.findById(id).get();
    }


    @GetMapping("/address/{addrid}")
    public Address searchAddress(@PathVariable("addrid") int addrid) {
        return addressRepository.findById(addrid).get();
    }


}
