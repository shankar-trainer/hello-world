package com.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PersonMain implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(PersonMain.class,args);
    }

    @Autowired
    PersonController userController;

    @Override
    public void run(String... args) throws Exception {
     userController.addPerson(Person.builder().name("amit kumar").password("abcd").roles("ADMIN").build());
        userController.personList().forEach(System.out::println);
    }
}
