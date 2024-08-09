package com.abc;

import com.abc.model.Employee;
import com.abc.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;

@SpringBootApplication
public class EmployeeMain  implements CommandLineRunner {
    public static void main(String[] args) {
        SpringApplication.run(EmployeeMain.class,args);
    }

    @Autowired
    EmployeeRepository repository;

    @Override
    public void run(String... args) throws Exception {

        //Employee employee=new Employee();
        Employee employee1=Employee.builder().name("ram kumar").dob(LocalDate.of(1999,11,23)).build();
        Employee employee2=Employee.builder().name("ram kumar").dob(LocalDate.of(1999,11,23)).build();
        Employee employee3=Employee.builder().name("ram kumar").dob(LocalDate.of(1999,11,23)).build();
        Employee employee4=Employee.builder().name("ram kumar").dob(LocalDate.of(1999,11,23)).build();
        repository.save(employee1);
        repository.save(employee2);
        repository.save(employee3);
        repository.save(employee4);

        repository.findAll().forEach(System.out::println);
    }
}
