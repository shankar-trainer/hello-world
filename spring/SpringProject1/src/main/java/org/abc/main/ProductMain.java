package org.abc.main;

import org.abc.model.Product;
import org.abc.model.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by shankar on 4/11/2023.
 */
public class ProductMain {
    public static void main(String[] args) {

        ApplicationContext beanFactory = new ClassPathXmlApplicationContext("application.xml");
        Product bean = beanFactory.getBean("prd1", Product.class);
        System.out.println(bean);
        System.out.println(bean.getOrder1());
    }
}
