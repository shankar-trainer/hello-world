package com.cts;

import com.cts.model.Person;
import com.cts.model.User;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PersonMain {

    public static void main(String[] args) {

//        BeanFactory factory = new ClassPathXmlApplicationContext("beans.xml");
        ApplicationContext factory = new ClassPathXmlApplicationContext
                ("beans.xml");

        Person person=factory.getBean(Person.class,"person1");

        System.out.println(person);
    }
}
