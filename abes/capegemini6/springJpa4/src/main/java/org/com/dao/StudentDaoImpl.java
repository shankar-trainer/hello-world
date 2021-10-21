package org.com.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.com.model.Student;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class StudentDaoImpl implements StudentDao {
	@PersistenceContext
	private EntityManager entityManager;

	@Transactional
	public void store(Student student) {
		entityManager.merge(student);
	}

	@Transactional
	public void delete(Integer studentId) {
		Student student = entityManager.find(Student.class, studentId);
		entityManager.remove(student);
	}

	@Transactional(readOnly = true)
	public Student findById(Integer studentId) {
		return entityManager.find(Student.class, studentId);
	}

	@Transactional(readOnly = true)
	public List<Student> findAll() {
		Query query = entityManager.createQuery("from Student");
		return query.getResultList();
	}
}