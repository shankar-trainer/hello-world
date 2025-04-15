package org.abc;


import bean.Student;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentMain {
    public static void main(String[] args) {

        BeanFactory beanFactory = new ClassPathXmlApplicationContext("classpath:application.xml");

     Student student1=   beanFactory.getBean("stud", Student.class);
        System.out.println(student1);
    }
}
