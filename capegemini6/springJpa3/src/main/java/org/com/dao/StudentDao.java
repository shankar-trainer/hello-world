package org.com.dao;

import java.util.List;

import org.com.model.Student;

public interface StudentDao {
	public void store(Student student);

	public void delete(Integer studentId);

	public Student findById(Integer studentId);

	public List<Student> findAll();
}