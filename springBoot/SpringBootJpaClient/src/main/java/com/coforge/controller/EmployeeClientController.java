package com.coforge.controller;


import com.coforge.model.Employee;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@RestController
public class EmployeeClientController {
    RestTemplate restTemplate=new RestTemplate();

    @GetMapping("/all")
    public  List<Employee> allEmployee() {
        try {
            Employee forObject[] = restTemplate.getForObject("http://localhost:9090/allEmployee", Employee[].class);
            return   Arrays.asList(forObject);
        }
        catch (RestClientException e){
            System.err.println(e);
        }
        return  null;
    }

    @GetMapping("/search/{id}")
    public  Employee searchEmployee(@PathVariable("id") int id ) {
        try {
            Employee forObject = restTemplate.getForObject("http://localhost:9090/allEmployee/" + id, Employee.class);
            return forObject;
        }
        catch (RestClientException e){
            System.err.println(e);
        }
        return  null;
    }
  @GetMapping("/search1/")
    public  Employee searchEmployee1() {
        try {

            Employee forObject = restTemplate.getForObject("http://localhost:9090/allEmployee/1", Employee.class);
            return forObject;
        }
        catch (RestClientException e){
            System.err.println(e);
        }
        return  null;
    }
    @PostMapping("/add")
    public  Employee addEmployee1(@RequestBody Employee emp) {
        try {
            Employee forObject = restTemplate.postForObject("http://localhost:9090/allEmployee",emp,  Employee.class);
            return forObject;
        }
        catch (RestClientException e){
            System.err.println(e);
        }
        return  null;
    }

}
