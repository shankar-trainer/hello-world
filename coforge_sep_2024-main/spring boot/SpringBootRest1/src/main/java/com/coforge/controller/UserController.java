package com.coforge.controller;
import com.coforge.model.User;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

@RestController
@RequestMapping("/")
public class UserController {

    @GetMapping("/")
    public  String welcome(){
        return  "Hello world";
    }

    @GetMapping("/user")
    public  User getUser(){
        User user=new User();
        user.setId(10001);
        user.setName("surendra partap");
        user.setSalary(12000);
        return  user;
    }

    @GetMapping("/all")
    public List<User> getUserList(){
        return  list;
    }
    @GetMapping("/search/{id}")
    public User searchUser(@PathVariable("id") int id1){
          return list.stream().filter(a -> a.getId() == id1).findFirst().get();
    }

    static List<User> list;
    static{
        list=Arrays.asList(new User[]{
             User.builder().id(1001).name("amit kumar").salary(12000).build(),
             User.builder().id(1002).name("rahul kumar").salary(32000).build(),
             User.builder().id(1003).name("nitin kumar").salary(20000).build(),
             User.builder().id(1004).name("deepak kumar").salary(62000).build(),
             User.builder().id(1005).name("ranjan kumar").salary(92000).build(),
             User.builder().id(1006).name("parag kumar").salary(72000).build(),
        });
    }
}
