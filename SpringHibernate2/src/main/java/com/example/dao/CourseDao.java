package com.example.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.model.Course;

public interface CourseDao {
	
	public Course addCourse(Course course) ;
	

	public void delete(int courseId) ;

	public Course findById(int courseId) ;
	
	public List<Course> findAll() ;
}
