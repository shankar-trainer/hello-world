package com.cts.dao;

import java.util.List;

import com.cts.model.Student;

public interface StudentDao {

	public Student addStudent(Student student);

	public List<Student> getAllStudent();

}
