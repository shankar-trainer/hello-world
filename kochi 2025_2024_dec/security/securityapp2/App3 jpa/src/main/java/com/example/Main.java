package com.example;

import com.example.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication

public class Main  implements CommandLineRunner {
    public static void main(String[] args) {
        SpringApplication.run(Main.class,args);
    }

    @Override
    public void run(String... args) throws Exception {

    }

    @Autowired
    UserRepository userRepository;

}
//insert into users (id,user_name,password) values(1,'ram kumar','$2a$12$nq3xL/pOmid1K1QWS/peDOk6OIOkIjFAWooTH8RnSPDi9o7tVDOjm');
//http://localhost:8080/hello -- give user name ram kumar, password ram kumar
//https://codeload.github.com/lakshay1341/Movie-Review-System-API/zip/refs/heads/main
//https://bcrypt-generator.com/