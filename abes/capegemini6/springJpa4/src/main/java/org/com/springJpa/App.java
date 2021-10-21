package org.com.springJpa;

import java.util.List;

import org.com.config.AppConfig;
import org.com.dao.StudentDao;
import org.com.model.Student;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		StudentDao studentDao = (StudentDao) context.getBean("studentDaoImpl");
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
		studentDao.delete(studentId);
		context.close();
		
	}
}
