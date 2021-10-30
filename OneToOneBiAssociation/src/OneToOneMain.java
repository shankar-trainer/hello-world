//package org.com.model;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.com.model.Department;
import org.com.model.Employee;

public class OneToOneMain {

	public static void main(String[] args) {
		EntityManagerFactory ef = Persistence.createEntityManagerFactory("prdonetoone");
		EntityManager em = ef.createEntityManager();
		EntityTransaction tr = em.getTransaction();

		Department department = new Department();
		Employee employee = new Employee();

		department.setDept_name("training");
		department.setDept_location("noida");

		employee.setEmp_name("pankaj kumar");
		employee.setEmp_salary(20000);
		employee.setDepartment(department);

		department.setEmployee(employee);

		tr.begin();
		em.persist(department);
		em.persist(employee);

		tr.commit();

		// em.createQuery("from
		// Employee").getResultList().stream().forEach(System.out::println);

		List<Department> resultList = em.createQuery("from Department").getResultList();

		for (Department d : resultList) {
			System.out.println("\n\nDepartment Information \n");
			System.out.println("department id " + d.getDept_id());
			System.out.println("department name " + d.getDept_name());
			System.out.println("department location " + d.getDept_location());
			Employee e = d.getEmployee();
			System.out.println("\nEmployee Information \n");

			System.out.println("Employee id " + e.getEmp_id());
			System.out.println("Employee name " + e.getEmp_name());
			System.out.println("Employee salary " + e.getEmp_salary());

		}
		ef.close();
	}
}
