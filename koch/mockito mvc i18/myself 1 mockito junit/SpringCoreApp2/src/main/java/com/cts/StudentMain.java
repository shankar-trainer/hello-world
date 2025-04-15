package com.cts;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.cts.config.StudentConfig;
import com.cts.model.Student;

/**
 *Student main is going to run the student project  
 * 
 * 
 * @author ram kumar
 *
 */

public class StudentMain {

	public static void main(String[] args) {

		ApplicationContext ctx = new AnnotationConfigApplicationContext(StudentConfig.class);

		Student st1 = ctx.getBean(Student.class);

		System.out.println(st1);

	}
}
