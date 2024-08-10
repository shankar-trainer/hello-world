package com.example;

import com.example.model.Address;
import com.example.model.Student;
import com.example.repository.AddressRepository;
import com.example.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Main implements CommandLineRunner {
    public static void main(String[] args) {
        SpringApplication.run(Main.class,args);
    }

    @Autowired
    StudentRepository studentRepository;

    @Autowired
    AddressRepository addressRepository;

    @Override
    public void run(String... args) throws Exception {
        Student student1=new Student();
        student1.setName("suresh kumar");
        student1.setSubject("Math");

        Address address=new Address();
        address.setLocation("sector 34");
        address.setCity("new delhi");

        student1.setAddress(address);
        addressRepository.save(address);
        studentRepository.save(student1);

        studentRepository.findAll().forEach(System.out::println);
    }
}
