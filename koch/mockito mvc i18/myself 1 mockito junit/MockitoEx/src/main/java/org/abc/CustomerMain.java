package org.abc;

import Inner.Student;
import bean.Customer;
import org.com.Product;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;
import java.util.Locale;

public class CustomerMain {
    public static void main(String[] args) {
        BeanFactory beanFactory = new ClassPathXmlApplicationContext("classpath:application.xml");
        //alert.inventory.checkout

     Customer customer=   beanFactory.getBean("cust", Customer.class);
        System.out.println(customer);
    }
}
