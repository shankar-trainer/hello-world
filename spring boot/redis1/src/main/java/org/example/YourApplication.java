package org.example;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
    import org.springframework.boot.autoconfigure.SpringBootApplication;
    import org.springframework.cache.annotation.EnableCaching;

import java.util.Arrays;

@SpringBootApplication
    @EnableCaching
    public class YourApplication {
        public static void main(String[] args) {
            SpringApplication.run(YourApplication.class, args);
        }

        @Autowired
        CustomerRepo repo;

        @PostConstruct
        public void add(){
        Customer customer1=new Customer(10001,"ram kumar",54545454,"ram@gmail.com");
        Customer customer2=new Customer(10002,"ram kumar",54545454,"ram@gmail.com");
        Customer customer3=new Customer(10003,"ram kumar",54545454,"ram@gmail.com");
        Customer customer4=new Customer(10004,"ram kumar",54545454,"ram@gmail.com");

        repo.saveAll(Arrays.asList(new Customer[]{customer1,customer2,customer3,customer4}));
        repo.findAll().forEach(System.out::println);
        }
    }