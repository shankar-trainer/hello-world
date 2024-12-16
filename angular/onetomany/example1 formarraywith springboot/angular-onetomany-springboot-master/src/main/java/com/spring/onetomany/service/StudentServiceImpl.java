package com.spring.onetomany.service;

import java.util.ArrayList;
import java.util.List;

//import javax.persistence.EntityManager;
//import javax.persistence.PersistenceContext;
//import javax.transaction.Transactional;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.onetomany.model.Book;
import com.spring.onetomany.model.Student;
import com.spring.onetomany.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService {
	@Autowired
	StudentRepository studentRepository;

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public List<Student> getAllStudent() {
		return studentRepository.findAll();
	}

	@Override
	public Student getStudentById(int id) {
		return studentRepository.findById(id).get();
	}

	@Override
	public void saveStudent(Student student) {
		List<Book> books = student.getBooks();
		for (Book book : books) {
			book.setStudent(student);
			System.out.println("HHhhhiiiiiii" + book.getBookName() + "mmmm" + book.getStudent().getId());
		}

		studentRepository.save(student);
	}

	@Transactional
	public void editStudent(Student student, int id) {
		Student entity = studentRepository.findById(id).get();
		List<Book> books = new ArrayList<>();

		if (entity != null) {
			entity.setName(student.getName());
			entity.setEmail(student.getEmail());
			entity.setRollNo(student.getRollNo());
			entity.setBranch(student.getBranch());
			entity.setCollege(student.getCollege());
			for (Book book : student.getBooks()) {
				book.setId(book.getId());
				book.setStudent(student);
				book.setBookName(book.getBookName());
				book.setPrice(book.getPrice());
				books.add(book);
			}
			entity.setBooks(books);
			System.out.println("HIIIIH" + entity);
		}
	}

	@Override
	public void deleteStudent(int id) {
		studentRepository.deleteById(id);
	}

}