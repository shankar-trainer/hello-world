package com.example;

import com.example.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.example.model.User;

import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class Main //implements CommandLineRunner
{

    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }
//
//    @Autowired
//    private UserRepository repo;
//
//    @Override
//    public void run(String... args) throws Exception {
//        User[] users = new User[]{
//                new User(null, "ram", "ram@gmail.com"),
//                new User( null,"shyam", "shyam@gmail.com"),
//                new User( null,"mohan", "mohan@gmail.com")
//        };
//
//        List<User> list1 = Arrays.asList(users);
//
//        // 1. Clear existing data (optional) and save all reactively
//        repo.deleteAll()
//                .thenMany(repo.saveAll(list1))
//                .blockLast(); // Forces the save operation to complete
//
//        // 2. Fetch and print all users
//        repo.findAll()
//                .doOnNext(user -> System.out.println(user))
//                .blockLast(); // Forces the find operation to execute and print
//    }
}

// show dbs-- show all databases
// use dbname -- create or use existing database
//show collections -- will show all collections(table) in database
// db.collectionname.find()-- will display all records
//db.dropDatabase() -- drop current database

