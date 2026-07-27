//package com.example.springbootdatajpaproject;
package com.example;

import com.example.dao.EmployeeDao;
import com.example.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class SpringbootdatajpaprojectApplication
//implements       CommandLineRunner
{
    public static void main(String[] args) {


        SpringApplication.run(SpringbootdatajpaprojectApplication.class, args);
    }
//    @Autowired
//    private EmployeeDao dao;
//
//    @Override
//    public void run(String... args) throws Exception {
//        Employee employee1=new Employee();
//        Scanner scanner=new java.util.Scanner(System.in);
//        System.out.println("enter name and salary");
//        employee1.setName(scanner.nextLine());
//        employee1.setSalary(scanner.nextFloat());
//        System.out.println("add operation");
//        dao.save(employee1);
//        dao.findAll().forEach(a->System.out.println(a.getId()+"\t"+a.getName()+"\t"+a.getSalary()));
//    }
}
