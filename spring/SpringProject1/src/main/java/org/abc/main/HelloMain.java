package org.abc.main;

import org.abc.model.Hello;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by shankar on 4/11/2023.
 */
public class HelloMain {
    public static void main(String[] args) {

        BeanFactory beanFactory = new ClassPathXmlApplicationContext("beans.xml");
        Hello hello = (Hello) beanFactory.getBean("hello");
        hello.greeting();
    }
}
