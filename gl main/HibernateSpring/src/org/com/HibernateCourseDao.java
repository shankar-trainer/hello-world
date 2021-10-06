package org.com;

import java.util.List;

import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;

public class HibernateCourseDao implements CourseDao {

	HibernateTemplate hibernateTemplate;

	public HibernateCourseDao(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	@Transactional
	@Override
	public void store(Course course) {
		hibernateTemplate.saveOrUpdate(course);
	}

	@Transactional
	@Override
	public void delete(Course course) {
		hibernateTemplate.delete(course);

	}

	@Override
	public Course find(long id) {
		Course cs = hibernateTemplate.get(Course.class, id);
		return cs;
	}

	@Override
	public List<Course> findAll() {
		List<Course> lcourse = (List<Course>) hibernateTemplate.find("from Course");
		return lcourse;
	}

}
