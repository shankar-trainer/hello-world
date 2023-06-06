package com.example;

import com.example.exception.PersonException;
import com.example.model.Person;
import com.example.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootJpa1Application implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootJpa1Application.class, args);
    }

    @Autowired
    PersonService service;

    @Override
    public void run(String... args) throws Exception {
        Person person1 = new Person();
        person1.setPersonName("johny walker");
        person1.setPersonSalary(34000);

        Person person2 = new Person();
        person2.setPersonName("may lucifer");
        person2.setPersonSalary(39000);

        //service.addPerson(person1);
        //service.addPerson(person2);

        try {
            Person person = service.searchPerson(15299);
            System.out.println("found " + person);
        }
        catch (PersonException e){
            System.err.println(e.getMessage());
        }
        service.getAllPerson().forEach(System.out::println);
    }
}
