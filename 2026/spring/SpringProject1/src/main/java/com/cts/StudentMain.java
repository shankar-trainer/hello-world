package com.cts;

import com.cts.model.Employee;
import com.cts.model.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentMain {

    public static void main(String[] args) {

        ApplicationContext factory = new ClassPathXmlApplicationContext
                ("application.xml");

        Student student =factory.getBean(Student.class);

        System.out.println(student);
    }
}
