package com.cts.dao;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.cts.config.Config;
import com.cts.model.Employee;

public class EmployeeDaoTest {
	EmployeeDao dao;

	//@Autowired
	private JdbcTemplate jdbcTemplate;
	Employee emp1;
	Employee emp2;

	@BeforeEach
	public void setUp() {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Config.class);
		dao = applicationContext.getBean(EmployeeDao.class);
		jdbcTemplate = applicationContext.getBean(JdbcTemplate.class);
		
		jdbcTemplate.update("delete from employee");

		emp1 = new Employee();
		emp1.setId(788787);
		emp1.setName("surendra kumar");
		emp1.setSalary(20000);

		dao.saveEmploye(emp1);

		emp2 = new Employee();
		emp2.setId(788781);
		emp2.setName("virendra kumar");
		emp2.setSalary(80000);

		dao.saveEmploye(emp2);
	}

	@Test
	public void testAllEmployee() {
		assertEquals(dao.showAll().size(), 2);
	}
	
	@Test
	public void testSearchEmployee() {
		int id1=dao.searchById(emp1.getId()).getId();
		assertEquals(emp1.getId(),id1);
	}
	@Test
	public void testDeleteEmployee() {
		
		dao.deleteEmploye(emp1.getId());
		
		assertThrows(RuntimeException.class, ()->{
			dao.searchById(emp1.getId());
		});
//		  
//		int id1=dao.searchById(emp1.getId()).getId();
//		assertNotEquals(emp1.getId(),id1);
		
	}

}
