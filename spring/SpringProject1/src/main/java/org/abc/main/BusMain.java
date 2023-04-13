package org.abc.main;

import org.abc.model.Bus;
import org.abc.model.Product;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BusMain {
    public static void main(String[] args) {

        //ApplicationContext
        ConfigurableApplicationContext beanFactory = new ClassPathXmlApplicationContext("context.xml");
        //Bus bean = beanFactory.getBean("bus",Bus.class);
        //Bus bean = beanFactory.getBean(Bus.class);
        Bus bean = beanFactory.getBean("mybus", Bus.class);

        System.out.println(bean);
        beanFactory.close();
    }
}
