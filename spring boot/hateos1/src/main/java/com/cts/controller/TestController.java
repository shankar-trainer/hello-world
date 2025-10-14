package com.cts.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/test")
public class TestController {

    @GetMapping
    public String hello(){
        return "hello";
    }
    @GetMapping("/welcome")
    public String welcome(){
        return "<h1>welcome</h1>";
    }

    //@GetMapping("emp1")
    @RequestMapping(value = "/emp1", method = RequestMethod.GET)
    public Employee getEmployee(){
        return new Employee(90001,"jayant kumar",67000.0f);
    }

    @GetMapping("/all")
    public Employee[] getAllEmployees(){
        return  employee;
    }

    @GetMapping("/all1")
    public List<Employee> getAllEmployees1(){
//        return  employee;
        return Arrays.asList(employee);
    }

  static  Employee employee[];
    static{
        employee=new Employee[4];
        employee[0]=new Employee(10001,"kamal kumar",20000);
        employee[1]=new Employee(10002,"vimal kumar",30000);
        employee[2]=new Employee(10003,"anil kumar",40000);
        employee[3]=new Employee(10004,"mukesh kumar",50000);
    }

}
