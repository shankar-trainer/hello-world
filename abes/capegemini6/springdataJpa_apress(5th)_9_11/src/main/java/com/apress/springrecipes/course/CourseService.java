package com.apress.springrecipes.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService {

	@Autowired
	CourseDao dao;

	public void getAllItem() {
		dao.findAll().stream().forEach(System.out::println);
	}

	public void addCourse(Course course) {
		if (searchStudent1(course) != null)
			System.out.println("course already present");
		else {
			dao.save(course);
			System.out.println("course added");
		}
	}

	public void searchStudent(Course cs) {
		if (dao.findById(cs.getId()).isPresent())
			System.out.println("course found \n" + cs);
		else
			System.out.println("course not found \n");
	}

	public Course searchStudent1(Course cs) {
		if(dao==null)
			System.out.println("dao is null");
		
		if (dao.findById(cs.getId()).isPresent())
			return dao.findById(cs.getId()).get();
		else
			return null;
	}
}
