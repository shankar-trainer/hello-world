package blog.panditmandar.code.mvcapp.service;

import java.util.List;

import blog.panditmandar.code.mvcapp.model.Student;

/**
 * Student Service Interface for Simple Spring MVC CRUD App
 * 
 * @author Mandar Pandit
 */
public interface StudentService {

	Student getStudent(Long id);

	Long saveStudent(Student st);

	List<Student> listAllStudents();

	void update(Long id, Student st);

	void delete(Long id);

	boolean isStudentUnique(Long id);
}
