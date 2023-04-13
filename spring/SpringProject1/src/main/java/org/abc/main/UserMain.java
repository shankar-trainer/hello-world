package org.abc.main;

import org.abc.model.Employee;
import org.abc.model.User;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * Created by shankar on 4/11/2023.
 */
public class UserMain {
    public static void main(String[] args) {

        //BeanFactory beanFactory=new ClassPathXmlApplicationContext("beans.xml");
        //ApplicationContext beanFactory=new ClassPathXmlApplicationContext("beans.xml");
        ConfigurableApplicationContext beanFactory = new ClassPathXmlApplicationContext("beans.xml");
        beanFactory=new FileSystemXmlApplicationContext("");
        User user = beanFactory.getBean("user1", User.class);
        System.out.println(user);
        beanFactory.close();

    }
}
