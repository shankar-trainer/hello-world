package org.example;

import org.example.model.Customer;
import org.example.model.Employee;
import org.example.model.Person;
import org.example.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;

@SpringBootApplication
public class Inheritance1Application  implements CommandLineRunner {

    public static void main(String[] args) {

        SpringApplication.run(Inheritance1Application.class, args);
    }

    @Autowired
    private PersonRepository repository;

    @Override
    public void run(String... args) throws Exception {

        Person person=new Person();
        person.setFirstName("Jack");
        person.setLastName("Sam");

//        Person person = Person.builder().firstName("suresh").lastName("kumar").build();
//
//        repository.save(person);
//
//        Employee employee=Employee.builder().joiningDate(LocalDate.of(2022,11,22)).departmentName("training").build();
//
//        repository.save(employee);


        Employee employee=new Employee();

        employee.setFirstName("ram");
        employee.setLastName("kumar");
        employee.setJoiningDate(LocalDate.now());
        employee.setDepartmentName("development");
        repository.save(employee);

        Customer customer=new Customer();
        customer.setFirstName("arvind");
        customer.setLastName("verma");
        customer.setDepartmentName("Transport");
        customer.setLocation("chennai");
        customer.setState("tamilnadu");

        repository.save(customer);

        repository.findAll().forEach(System.out::println);



    }
}
