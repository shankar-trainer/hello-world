package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ManagerMain implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(ManagerMain.class,args);
    }

    @Autowired
    ManagerController managerController;

    @Override
    public void run(String... args) throws Exception {
     managerController.addManager(Manager.builder().name("amit kumar").build());
     managerController.personList().forEach(System.out::println);

    }
}
//http://localhost:7070/h2-console/
