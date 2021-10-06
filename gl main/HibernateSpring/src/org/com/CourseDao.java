package org.com;

import java.util.List;

public interface CourseDao {

	public void store(Course course);
	public void delete(Course course);
	public Course find(long id);
	public  List<Course> findAll();
	
}
