package org.com.springJpa;

import java.util.List;

import org.apache.commons.dbcp.BasicDataSource;
import org.com.dao.StudentDao;
import org.com.model.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@ComponentScans(value = { @ComponentScan("org.com.dao"), @ComponentScan("org.com.model") })

public class App {
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		StudentDao studentDao = (StudentDao) context.getBean("studentDao");
		Student student = new Student();
		student.setName("Ram kumar");
		student.setMarks(80);

		studentDao.store(student);

		student.setName("shyam kumar");
		student.setMarks(90);
		studentDao.store(student);

		student.setName("Aman kumar");
		student.setMarks(88);
		studentDao.store(student);

		List<Student> students = studentDao.findAll();

		students.stream().forEach(System.out::println);

		Integer studentId = students.get(0).getRoll();
		student = studentDao.findById(studentId);

		System.out.println(student);
	}
}
