package com.coforge;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.coforge.model.Department;
import com.coforge.model.Employee;
import com.coforge.util.MySessionFactory;

public class EmployeeMain {
	public static void main(String[] args) {
		SessionFactory factory = MySessionFactory.getSessionFactory();
		Session session = factory.openSession();

		Transaction transaction = session.getTransaction();

		String name[] = { "kamal kumar", "vimal kumar", "parkash kumar", "suman kumar" };
		LocalDate dob[] = { LocalDate.of(2001, 11, 26), LocalDate.of(2001, 11, 21), LocalDate.of(2002, 12, 22),
				LocalDate.of(2003, 10, 23) };

		Department department = new Department();
		department.setDeptName("training");
		department.setTotalMember(30);

		Employee employee = null;
		Set<Employee> employeeSet = new HashSet<>();

		for (int i = 0; i < 4; i++) {
			employee = new Employee();
			employee.setEmpName(name[i]);
			employee.setDob(dob[i]);
			// employee.setDepartment(department);
			employeeSet.add(employee);
		}

//		transaction.begin();
//		
//		for(Employee e:employeeSet)
//			session.save(e);		
//		transaction.commit();

		department.setEmployeeSet(employeeSet);

		for (Employee e : employeeSet)
			e.setDepartment(department);

		transaction.begin();
		session.save(department);
		transaction.commit();

	}
}
