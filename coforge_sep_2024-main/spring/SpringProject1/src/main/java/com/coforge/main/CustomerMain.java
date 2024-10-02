package com.coforge.main;

import com.coforge.model.Customer;
import com.coforge.model.Employee;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class CustomerMain {
    public static void main(String[] args) {

        //BeanFactory beanFactory=new ClassPathXmlApplicationContext("beans.xml");
        BeanFactory beanFactory=new FileSystemXmlApplicationContext
                ("src/main/resources/beans.xml");

        Customer bean = beanFactory.getBean(Customer.class);


        System.out.println(bean);
    }
}
