package blog.panditmandar.code.mvcapp.dao;

import java.util.List;

import blog.panditmandar.code.mvcapp.model.Student;

/**
 * Student Dao Interface for Simple Spring MVC CRUD App
 * 
 * @author Mandar Pandit
 */
public interface StudentDao {

	Student getStudent(Long id);

	Long saveStudent(Student st);

	List<Student> listAllStudents();

	void updateStudent(Student st);

	void deleteStudent(Student st);

}
