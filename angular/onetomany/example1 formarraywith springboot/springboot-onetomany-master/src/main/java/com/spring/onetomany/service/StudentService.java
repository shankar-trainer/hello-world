package com.spring.onetomany.service;

import java.util.List;

import com.spring.onetomany.model.Student;

public interface StudentService {
	public List<Student> getAllStudent();

	public Student getStudentById(int id);

	public void saveStudent(Student student);
	
	public void editStudent(Student student,int id);

	public void deleteStudent(int id);
}
