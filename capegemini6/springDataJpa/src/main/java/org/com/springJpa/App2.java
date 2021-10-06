package org.com.springJpa;

import java.util.List;
import java.util.Optional;

import org.com.config.AppConfig;
import org.com.model.Student;
import org.com.service.StudentService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

//@EnableJpaRepositories
public class App2 {
	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		StudentService studentservice = (StudentService) context.getBean("studentService");
		Student student1 = new Student();
		student1.setName("Ram kumar");
		student1.setMarks(80);
		studentservice.addStudent(student1);

		Student student2 = new Student();
		student2.setName("shyam kumar");
		student2.setMarks(90);
		studentservice.addStudent(student2);

		Student student3 = new Student();
		student3.setName("Aman kumar");
		student3.setMarks(88);
		studentservice.addStudent(student3);

		List<Student> students = studentservice.getAllItem();

		students.stream().forEach(System.out::println);

		context.close();

	}
}
