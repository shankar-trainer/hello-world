package org.abc;

import Inner.Student;
import org.com.Product;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;
import java.util.Locale;

public class CourseMain {
    public static void main(String[] args) {
        BeanFactory beanFactory = new ClassPathXmlApplicationContext("classpath:beans.xml");
        Student st1 = (Student) beanFactory.getBean("st1");
        System.out.println(st1);

        Product product = beanFactory.getBean("prd", Product.class);

        System.out.println(product.getPid());
        System.out.println(product.getName());
        System.out.println(product.getSpecialDiscount());

        String alert = ((ClassPathXmlApplicationContext) beanFactory).getMessage("alert.checkout",null,null);
        System.out.println(alert);

        String alert2 = ((ClassPathXmlApplicationContext) beanFactory).getMessage("alert.checkout",new Object[] { 4, new Date() },null);
        System.out.println(alert2);

        String alert1 = ((ClassPathXmlApplicationContext) beanFactory).getMessage("alert.inventory.checkout", new Object[] { "[DVD-RW 3.0]", new Date() }, Locale.US);

        System.out.println(alert1);

        alert1 = ((ClassPathXmlApplicationContext) beanFactory).getMessage("alert.inventory.checkout", new Object[] { "hello", "welcome" }, Locale.US);
        System.out.println(alert1);
        //alert.inventory.checkout
    }
}
