package org.example;

import org.example.dao.EmployeeDao;
import org.example.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by shankar on 4/25/2023.
 */
@SpringBootApplication
public class EmployeeMain1 {
    public static void main(String[] args) {
        SpringApplication.run(EmployeeMain1.class, args);
    }
}
