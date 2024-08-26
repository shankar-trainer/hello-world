package com.ukg;

import com.ukg.dao.EmployeeDao;
import com.ukg.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;
import java.util.Optional;

@SpringBootApplication
public class AppMain   implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(AppMain.class,args);
    }

    @Autowired
    EmployeeDao dao;

    @Override
    public void run(String... args) throws Exception {
        Employee employee1=new Employee();
        employee1.setId(10003);
        employee1.setName("raghvendra kumar");
        employee1.setSalary(40000);
        System.out.println("add record operation");
        dao.save(employee1);

        System.out.println("findall operation ");
        //List<Employee> all = dao.findAll();
        dao.findAll().forEach(System.out::println);

        Optional<Employee> byId = dao.findById(10002);
        System.out.println("find by id operation ");

        if(byId.isPresent())
            System.out.println("Record found "+byId.get());
        else
            System.out.println("not found");

        System.out.println("delete  by id operation ");
        byId = dao.findById(10002);

        if(byId.isPresent()){
            System.out.println("Record found  ");
            dao.delete(byId.get());
            System.out.println("Record deleted");
        }
        else
            System.out.println("not found not deleted");


    }
}
