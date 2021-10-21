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
import com.apress.springrecipes.course.CourseService;
import com.apress.springrecipes.course.config.CourseConfiguration;

@ComponentScan({ "com.apress.springrecipes.course" })
@EntityScan("com.apress.springrecipes.course")
@EnableJpaRepositories("com.apress.springrecipes.course")

@SpringBootTest
public class Main {
	@Test
	public void main() {

		ApplicationContext context = new AnnotationConfigApplicationContext(CourseConfiguration.class);
		CourseService courseDao = context.getBean(CourseService.class);

		Course course1 = new Course();
		course1.setTitle("Core Spring");
		course1.setBeginDate(new GregorianCalendar(2007, 8, 1).getTime());
		course1.setEndDate(new GregorianCalendar(2007, 9, 1).getTime());
		course1.setFee(1000);

		Course course2 = new Course();
		course2.setTitle("Adv Spring");
		course2.setBeginDate(new GregorianCalendar(2007, 8, 1).getTime());
		course2.setEndDate(new GregorianCalendar(2007, 9, 1).getTime());
		course2.setFee(2000);

		Course course3 = new Course();
		course3.setTitle("Spring Boot");
		course3.setBeginDate(new GregorianCalendar(2007, 8, 1).getTime());
		course3.setEndDate(new GregorianCalendar(2007, 9, 1).getTime());
		course3.setFee(1000);

		courseDao.addCourse(course1);
		courseDao.addCourse(course2);
		courseDao.addCourse(course3);

		courseDao.getAllItem();

		((ConfigurableApplicationContext) context).stop();
	}
}
