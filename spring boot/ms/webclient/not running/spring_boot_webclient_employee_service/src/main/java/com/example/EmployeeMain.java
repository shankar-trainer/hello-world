package com.example;

import com.example.entity.Employee;
import com.example.repository.EmployeeRepo;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class EmployeeMain {

    public static void main(String[] args) {
        SpringApplication.run(EmployeeMain.class,args);
    }

    @Autowired
    private EmployeeRepo employeeRepo;

    @PostConstruct
    public void add(){
        Employee employee[]=new Employee[]{
          new Employee("ram kumar","ram@gmail.com","20"),
          new Employee("shyam kumar","shyam@gmail.com","23"),
          new Employee("mohan kumar","mohan@gmail.com","40"),
          new Employee("kamal kumar","kamal@gmail.com","26"),
        };
        employeeRepo.saveAll(Arrays.asList(employee));
        employeeRepo.findAll().forEach(employee1 -> System.out.println(employee1));
    }
}
//http://localhost:8080/employee-service/employees
//http://localhost:8080/employee-service/h2-console/

//http://localhost:8081/address-service/address/1
//http://localhost:8080/employee-service/employees/1

// SELECT ea.id, ea.city, ea.state FROM db9.address ea join db9.employee e on e.id = ea.employee_id where ea.employee_id=1