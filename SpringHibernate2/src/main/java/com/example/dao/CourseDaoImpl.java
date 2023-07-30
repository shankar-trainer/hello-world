package com.example.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.model.Course;

@Repository
public class CourseDaoImpl  implements CourseDao{
	private SessionFactory factory;

	public CourseDaoImpl(SessionFactory factory) {
		super();
		this.factory = factory;
	}

	@Transactional
	public Course addCourse(Course course) {
		Session session = factory.getCurrentSession();
		session.save(course);
		return course;
	}

	@Transactional
	public void delete(int courseId) {
		Session session = factory.getCurrentSession();
		Course course = session.get(Course.class, courseId);
		session.delete(course);
	}

	@Transactional(readOnly = true)
	public Course findById(int courseId) {
		Session session = factory.getCurrentSession();
		return session.get(Course.class, courseId);
	}

	@Transactional(readOnly = true)
	public List<Course> findAll() {
		Session session = factory.openSession();
		return session.createQuery("select c from Course c", Course.class).list();
	}
}
