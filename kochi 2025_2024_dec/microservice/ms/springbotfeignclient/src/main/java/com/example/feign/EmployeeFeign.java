package com.example.feign;

import com.example.model.Employee;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@FeignClient(name = "SPRING-BOOT-PROJECT" )
//@FeignClient(url ="http://localhost:8090" ,value = "SPRING-BOOT-PROJECT")
public interface EmployeeFeign {
    @GetMapping("/emp/employee")
    public ResponseEntity<List<Employee>> getAllEmployeeList();
    @PostMapping("/emp/employee")
    public ResponseEntity<Employee> addEmployee(@RequestBody Employee employee) ;
    @DeleteMapping("/emp/employee/{id}")
    public ResponseEntity<Employee> deleteEmployee(@PathVariable("id") int id);

    @GetMapping("/emp/employee/{id}")
    public ResponseEntity<Employee> searchEmployee(@PathVariable("id") int id);
}
