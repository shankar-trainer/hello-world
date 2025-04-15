package com.example;

import com.example.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/")
public class EmployeeController {

    //@Autowired
    RestTemplate restTemplate = new RestTemplate();

    @GetMapping("/employee")
    public List<Employee> getAllEmployee() {
        Employee[] forObject = restTemplate.getForObject("http://localhost:8090/emp/employee", Employee[].class);
        return Arrays.asList(forObject);
    }

    @GetMapping("/employee1")
    public ResponseEntity<Employee[]> getAllEmployee1() {
        ResponseEntity<Employee[]> forEntity = restTemplate.getForEntity("http://localhost:8090/emp/employee", Employee[].class);
        return forEntity;
    }

    @PostMapping("/employee")
    public ResponseEntity<Employee> postEmployee(@RequestBody Employee emp) {
        return restTemplate.postForEntity("http://localhost:8090/emp/employee", emp, Employee.class);
    }

    @GetMapping("/employee/{id}")
    public ResponseEntity<Employee> searchEmployee(@PathVariable("id") int id) {
        try {
            return restTemplate.getForEntity("http://localhost:8090/emp/employee/" + id, Employee.class);
        } catch (HttpClientErrorException e) {
            return new ResponseEntity(e.getMessage(), HttpStatus.NOT_FOUND);
        }
    }
    @DeleteMapping("/employee/{id}")
    public ResponseEntity<Employee> deleteEmployee(@PathVariable("id") int id) {
        try {
            return restTemplate.getForEntity("http://localhost:8090/emp/employee/" + id, Employee.class);
        } catch (HttpClientErrorException e) {
            return new ResponseEntity(e.getMessage(), HttpStatus.NOT_FOUND);
        }
    }

    @PutMapping("/employee")
    public ResponseEntity<Employee> putEmployee(@RequestBody Employee emp) {
      restTemplate.put("http://localhost:8090/emp/employee", emp, Employee.class);
      ResponseEntity<Employee> emp2=new ResponseEntity<>(emp,HttpStatus.CREATED);
      return  emp2;
    }


}



