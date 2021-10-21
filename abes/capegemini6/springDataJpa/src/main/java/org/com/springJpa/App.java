package org.com.springJpa;

import java.util.List;
import java.util.Optional;

import org.com.config.AppConfig;
import org.com.dao.StudentDao;
import org.com.model.Student;
//import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

//@EntityScan(basePackages = { "org.com.dao", "org.com.model","org.com.service" })
//@EnableJpaRepositories(basePackages = { "org.com.dao", "org.com.model","org.com.service" })

public class App {
	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		StudentDao studentDao = (StudentDao) context.getBean("studentDao");
		Student student = new Student();
		student.setName("Ram kumar");
		student.setMarks(80);
		studentDao.save(student);

		student.setName("shyam kumar");
		student.setMarks(90);
		studentDao.save(student);

		student.setName("Aman kumar");
		student.setMarks(88);
		studentDao.save(student);

		List<Student> students = studentDao.findAll();

		students.stream().forEach(System.out::println);

		Integer studentId = students.get(0).getRoll();
		Optional<Student> optional = studentDao.findById(studentId);
		
		if(optional.isPresent())

		System.out.println(optional.get());
		
		studentDao.deleteById(studentId);
		context.close();
	}
}
