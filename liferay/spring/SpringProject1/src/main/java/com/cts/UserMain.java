package com.cts;

import com.cts.model.User;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserMain {

    public static void main(String[] args) {

        BeanFactory factory = new ClassPathXmlApplicationContext("beans.xml");
        User user = (User) factory.getBean("user1");
//
//        System.out.println("id " + user.getId());
//        System.out.println("name " + user.getName());
//        System.out.println("salary " + user.getSalary());

        User user1 = (User) factory.getBean("user1");

        user1.setId(90009);
        user1.setName("deepak anand");
        user1.setSalary(45000);

        System.out.println("user");
        System.out.println("id " + user.getId());
        System.out.println("name " + user.getName());
        System.out.println("salary " + user.getSalary());

        System.out.println("user1");
        System.out.println("id " + user1.getId());
        System.out.println("name " + user1.getName());
        System.out.println("salary " + user1.getSalary());



    }
}
