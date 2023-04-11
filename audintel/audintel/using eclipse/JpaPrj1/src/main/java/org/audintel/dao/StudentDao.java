package org.audintel.dao;

import java.util.List;

import org.audintel.model.Student;

public interface  StudentDao {
    public List<Student> getAllStudent();
    public Student searchStudent(int roll);
    public Student removeStudent(int roll);
    public Student addStudent(Student student);
    public Student updateStudent(Student student);
	
}
