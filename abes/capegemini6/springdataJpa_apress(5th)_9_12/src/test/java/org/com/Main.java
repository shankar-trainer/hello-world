package org.com;

import java.util.GregorianCalendar;

import org.junit.gen5.api.Test;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.apress.springrecipes.course.Course;
import com.apress.springrecipes.course.CourseDao;
import com.apress.springrecipes.course.config.CourseConfiguration;

@ComponentScan({ "com.apress.springrecipes.course" })
@EntityScan("com.apress.springrecipes.course")
@EnableJpaRepositories("com.apress.springrecipes.course")

@SpringBootTest
public class Main {
	@Test
	public void main() {

		 ApplicationContext context = new AnnotationConfigApplicationContext(CourseConfiguration.class);
	        CourseDao courseDao = context.getBean(CourseDao.class);

	        Course course = new Course();
	        course.setTitle("Core Spring");
	        course.setBeginDate(new GregorianCalendar(2007, 8, 1).getTime());
	        course.setEndDate(new GregorianCalendar(2007, 9, 1).getTime());
	        course.setFee(1000);
	        
	        courseDao.save(course);

	        System.out.println("\nCourse before persisting");
	        System.out.println(course);

	        ((ConfigurableApplicationContext) context).stop();
	}
}
