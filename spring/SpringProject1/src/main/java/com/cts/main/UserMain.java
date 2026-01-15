package com.cts.main;

import com.cts.model.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserMain {
    public static void main(String[] args) {

        ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
     User u=   context.getBean("user", User.class);
        System.out.println(u);
    }
}
