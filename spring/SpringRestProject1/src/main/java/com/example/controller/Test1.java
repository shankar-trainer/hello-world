package com.example.controller;

import com.example.model.Employee;

import java.util.ArrayList;
import java.util.List;

public class Test1 {
    public static void main(String[] args) {
        List<Employee> empList;
         {
            empList = new ArrayList<Employee>();
            empList.add(new Employee(10001, "ram kumar", 20000));
            empList.add(new Employee(10002, "shyam kumar", 25000));
            empList.add(new Employee(10003, "mohan kumar", 70000));
            empList.add(new Employee(10004, "ramesh kumar", 50000));
            empList.add(new Employee(10005, "suesh kumar", 29000));
            empList.add(new Employee(10006, "diwakar kumar", 45000));
        }

        empList.remove(5);
        empList.forEach(System.out::println);
    }
}
