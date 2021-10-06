package com.apress.springrecipes.course;

import java.util.GregorianCalendar;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.apress.springrecipes.course.config.CourseConfiguration;


public class Main2 {
    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(CourseConfiguration.class);

        CourseDao courseDao =context.getBean(CourseDao.class);
		Course course1 = new Course();
		course1.setTitle("Core Spring");
		course1.setBeginDate(new GregorianCalendar(2007, 8, 1).getTime());
		course1.setEndDate(new GregorianCalendar(2007, 9, 1).getTime());
		course1.setFee(1000);
        courseDao.save(course1);
       
        ((ConfigurableApplicationContext) context).stop();
    }
}
