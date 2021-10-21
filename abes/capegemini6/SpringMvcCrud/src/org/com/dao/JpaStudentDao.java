package org.com.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.com.capegemini.controller.Employee;
import org.com.model.Student;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository("studentDao")
public class JpaStudentDao implements EmployeeDao {
	@PersistenceContext
	private EntityManager entityManager;

	@Transactional
	public boolean store(Employee emp) {
		if (findById(emp.getId()) != null) {
			entityManager.merge(emp);
			return true;
		} else
			return false;
	}

	@Transactional
	public boolean delete(Integer empid) {
		Employee e = entityManager.find(Employee.class, empid);
		if (e != null) {
			entityManager.remove(e);
			return true;
		}
		return false;
	}

	@Transactional(readOnly = true)
	public Employee findById(Integer empId) {
		return entityManager.find(Employee.class, empId);
	}

	@Transactional(readOnly = true)
	public List<Employee> findAll() {
		Query query = entityManager.createQuery("from Employee");
		return query.getResultList();
	}
}