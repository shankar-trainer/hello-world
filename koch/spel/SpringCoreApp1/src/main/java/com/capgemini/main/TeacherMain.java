package com.capgemini.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.capgemini.beans.School;
import com.capgemini.beans.Teacher;

public class TeacherMain {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("application3.xml");

		Teacher teacher = ctx.getBean("teacher", Teacher.class);

		System.out.println(teacher.getId());
		System.out.println(teacher.getName());
		System.out.println(teacher.getSalary());

		School school = teacher.getSchool();
		System.out.println("scholl information ");
		System.out.println(school.getSchoolRegNo());
		System.out.println(school.getSchoolLocation());
		System.out.println(school.getSchoolName());
	}
}
