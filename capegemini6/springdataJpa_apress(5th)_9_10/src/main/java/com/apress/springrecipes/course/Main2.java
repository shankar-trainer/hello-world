package com.apress.springrecipes.course;

import java.util.GregorianCalendar;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.apress.springrecipes.course.config.CourseConfiguration;

public class Main2 {
	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(CourseConfiguration.class);
		// CourseDao courseDao = context.getBean(CourseDao.class);
		CourseRepository courseDao = context.getBean(CourseRepository.class);

		Course course = new Course();
		course.setTitle("Core Spring");
		course.setBeginDate(new GregorianCalendar(2007, 8, 1).getTime());
		course.setEndDate(new GregorianCalendar(2007, 9, 1).getTime());
		course.setFee(1000);

		System.out.println("\nCourse before persisting");
		System.out.println(course);

		Course persisted = courseDao.save(course);

		System.out.println("\nCourse after persisting");
		System.out.println(persisted);

		Long courseId = persisted.getId();
		Course courseFromDb=null;
		if(courseDao.findById(course.getId()).isPresent())
			courseFromDb= courseDao.findById(course.getId()).get();
		((ConfigurableApplicationContext) context).stop();
	}
}
