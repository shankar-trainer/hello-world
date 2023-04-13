package org.abc.main;

import org.abc.model.Movie;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.abc.service.CustomerService;
public class CustomerMain {
    public static void main(String[] args) {

        ConfigurableApplicationContext beanFactory = new ClassPathXmlApplicationContext("context.xml");
        CustomerService bean = beanFactory.getBean(CustomerService.class);

        bean.getCustomer().getInfo();

    }
}
