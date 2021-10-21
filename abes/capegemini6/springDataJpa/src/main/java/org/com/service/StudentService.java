package org.com.service;

import java.util.List;

import org.com.dao.StudentDao;
import org.com.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

	@Autowired
	StudentDao dao;

	public List<Student> getAllItem() {
		return dao.findAll();
	}

	public void addStudent(Student student) {
		if (searchStudent(student) != null)
			System.out.println("course cannot be added");
		else {
			dao.save(student);
			System.out.println("Course added");
		}
	}

	public Student searchStudent(Student st) {
		return dao.findById(st.getRoll()).get();
	}

}
