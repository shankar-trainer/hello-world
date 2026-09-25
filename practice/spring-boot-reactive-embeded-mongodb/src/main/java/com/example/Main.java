package com.example;

import com.example.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.example.model.User;
import java.util.Arrays;
import java.util.List;

@SpringBootApplication(scanBasePackages = "com.example.repository")
public class Main //implements CommandLineRunner 
{

    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }

//     @Autowired
//     private UserRepository repo;

//     @Override
//     public void run(String... args) throws Exception {
//         User user[] = new User[]{
//             new User("ram", "ram@gmail.com"),
//             new User("shyam", "shyam@gmail.com"),
//             new User("mohan", "mohan@gmail.com"),};

//         List<User> list1 = Arrays.asList(user);
//         repo.saveAll(list1);

// //        repo.saveAll(Flux.just(
// //                    new User("Alice", "alice@example.com"),
// //                    new User("Bob", "bob@example.com")
// //                )).subscribe();
//     }

}
