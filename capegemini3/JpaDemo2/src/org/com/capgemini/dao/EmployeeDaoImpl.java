package org.com.capgemini.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.com.capgemini.model.Employee;

public class EmployeeDaoImpl implements EmployeeDao {

	EntityManagerFactory ef;
	EntityManager em;
	EntityTransaction tr;
	Employee emp;

	public EmployeeDaoImpl() {
		ef = Persistence.createEntityManagerFactory("jpaDemo2");
		em = ef.createEntityManager();
		tr = em.getTransaction();
	}

	@Override
	public boolean addEmployee(Employee e) {
		emp = null;
		emp = searchEmployee(e.getId());
		if (emp == null) {
			tr.begin();
			em.persist(e);
			tr.commit();
			return true;
		}
		return false;
	}

	@Override
	public Employee searchEmployee(int id) {
		emp = null;
		emp = em.find(Employee.class, id);
		return emp;
	}

	@Override
	public List<Employee> getAllEmployee() {
		Query createQuery = em.createQuery("from Employee");
		return createQuery.getResultList();
	}

	@Override
	public boolean removeEmployee(Employee e) {
		emp = null;
		emp = searchEmployee(e.getId());
		if (emp != null) {
			tr.begin();
			em.remove(em.contains(emp) ? emp : em.merge(emp));

			tr.commit();
			return true;
		}
		return false;
	}
}
