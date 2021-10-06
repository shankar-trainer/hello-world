package org.com;

import java.util.Date;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class main {
	public static void main(String[] args) {

		ApplicationContext ctx = new AnnotationConfigApplicationContext(CourseConfiguration.class);

		CourseDao dao = ctx.getBean(CourseDao.class);

		Course course = new Course();
		// course.setId(9003);
		course.setTitle("hibernate with spring");
		course.setBeginDate(new Date());
		course.setEndDate(new Date(new Date().getTime() + (30 * 3600 * 24l)));
		dao.store(course);

		System.out.println("course added");

		Course course2 = dao.find(9009);
		if (course2 != null) {
			System.out.println("Record found with id ");
			System.out.println("Details are ");
			System.out.println(course2.getId() + " " + course2.getTitle() + "  " + course2.getBeginDate() + "  "
					+ course2.getEndDate());
		} else
			System.out.println("given id not present");

		List<Course> list1 = dao.findAll();

		System.out.println("allr records are  ");
		
		for (Course course3 : list1) {
			System.out.println(course3.getId() + " " + course3.getTitle() + "  " + course3.getBeginDate() + "  "
					+ course3.getEndDate());
		}
	}
}
