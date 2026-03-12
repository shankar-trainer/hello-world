package com.coforge;

import com.coforge.dao.EmployeeRepository;
import com.coforge.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;

/*
@SpringBootApplication
public class EmployeeMain {
    public static void main(String[] args) {
        SpringApplication.run(EmployeeMain.class,args);
    }
}
*/

@SpringBootApplication
public class EmployeeMain  implements CommandLineRunner {
    public static void main(String[] args) {
        SpringApplication.run(EmployeeMain.class,args);
    }

    @Autowired
    EmployeeRepository repository;

    @Override
    public void run(String... args) throws Exception {

        var e=new Employee();
        e.setDob(LocalDate.of(2001, 11,11 ));
        repository.save(e);
    }
}
