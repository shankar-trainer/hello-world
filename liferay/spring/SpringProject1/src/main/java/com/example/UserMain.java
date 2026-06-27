package com.example;

import com.example.model.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserMain {
    public static void main(String[] args) {
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("application.xml");

//     User user=   applicationContext.getBean(User.class);
     User user=   applicationContext.getBean
             ("user1",User.class);
        System.out.println(user);

    }
}
