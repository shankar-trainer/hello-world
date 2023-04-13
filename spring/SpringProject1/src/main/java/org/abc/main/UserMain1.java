package org.abc.main;

import org.abc.model.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class UserMain1 {
    public static void main(String[] args) {

        //ApplicationContext beanFactory=new ClassPathXmlApplicationContext("beans.xml");
        ApplicationContext
        beanFactory=new FileSystemXmlApplicationContext("src\\main\\resources\\beans.xml");
        User user = beanFactory.getBean("user1", User.class);
        System.out.println(user);

    }
}
