package com.example.App3;

import com.example.exception.UserException;
import com.example.model.User;
import com.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Map;

@SpringBootApplication(scanBasePackages = {"com.example.model", "com.example.dao", "com.example.service"})
public class UserClient implements CommandLineRunner {
    static void display(Map<Integer, User> map1) {
        System.out.println("All User Records ");
        for (Integer i : map1.keySet())
            System.out.println(map1.get(i).getUserId()+"\t"+map1.get(i).getUserName()+"\t"+map1.get(i).getUserSalary());
    }

    public static void main(String[] args) {
        SpringApplication.run(UserClient.class, args);
    }

    @Autowired
    UserService service;

    @Override
    public void run(String... args) throws Exception {
        try {
            //display( service.getAllUser());

            User user[] = new User[4];
            user[0] = new User(10001, "mark luis", 20000);
            user[1] = new User(10002, "max john", 34000);
            user[2] = new User(10003, "albert luis", 80000);
            user[3] = new User(10004, "arnold ", 90000);

            System.out.println("===================user add operation======================");
            for (User u : user)
                service.addUser(u);
            display( service.getAllUser());

            User user1 = service.searchUser(10001);
            System.out.println("search with id 10001");
            System.out.println(user1.getUserId()+"\t"+user1.getUserName()+"\t"+user1.getUserSalary());
            System.out.println("search with id 89898");
//            User user2 = service.searchUser(89898);
//            System.out.println(user2.getUserId()+"\t"+user2.getUserName()+"\t"+user2.getUserSalary());

            System.out.println("remove  id 10001");
            User user3 = service.removeUser(10001);
            System.out.println("User removed is "+user3.getUserId()+"\t"+user3.getUserName()+"\t"+user3.getUserSalary());

            //System.out.println("remove  id 7888");
            //user3 = service.removeUser(7888);
            System.out.println("User removed is "+user3.getUserId()+"\t"+user3.getUserName()+"\t"+user3.getUserSalary());

            user[2] = new User(10003, "john desoza", 87000);
            service.updateUser(user[2]);
            System.out.println("after update ");
            user3=service.searchUser(10003);
            System.out.println(user3.getUserId()+"\t"+user3.getUserName()+"\t"+user3.getUserSalary());

            System.out.println( ".....program ends .....");
        } catch (UserException e) {
            System.err.println(e.getMessage());
        }
    }
}
