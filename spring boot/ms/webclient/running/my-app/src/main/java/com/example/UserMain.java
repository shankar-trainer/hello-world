package com.example;

import com.example.dao.UserRepository;
import com.example.model.User;
import com.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class UserMain implements CommandLineRunner {
    public static void main(String[] args) {
        SpringApplication.run(UserMain.class, args);
    }

    @Autowired
    UserService userService;

    @Autowired
    UserRepository repository;

    @Override
    public void run(String... args) throws Exception {
        repository.saveAll(
                Arrays.asList(new User[]{
                        User.builder().userId(87677676).name("amit kumar").build(),
                        User.builder().userId(87677678).name("sumit kumar").build(),
                        User.builder().userId(87677679).name("parvin kumar").build(),
                })
        );
        repository.findAll().forEach(System.out::println);
    }
}
