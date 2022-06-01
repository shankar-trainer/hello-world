package com.cognizant;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.cognizant.dao.EmployeeDaoImpl;
import com.cognizant.model.Employee;

@SpringBootApplication
public class Application implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Bean
	public EmployeeDaoImpl getEmpdao() {
		EmployeeDaoImpl dao = new EmployeeDaoImpl();
		JdbcTemplate jdbcTemplate = new JdbcTemplate();
		jdbcTemplate.setDataSource(getDataSource());
		dao.setJdbcTemplate(jdbcTemplate);
		return dao;
	}

	@Bean
	public DriverManagerDataSource getDataSource() {
		DriverManagerDataSource ds = new DriverManagerDataSource();
		ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
		ds.setPassword("mysql");
		ds.setUrl("jdbc:mysql://localhost:3306/db1");
		ds.setUsername("root");
		return ds;
	}

	@Autowired
	EmployeeDaoImpl dao;

	@Override
	public void run(String... args) throws Exception {
		System.out.println("all records ");
		dao.showAllEmployee()
				.forEach(emp -> System.out.println(emp.getId() + "\t" + emp.getName() + "\t" + emp.getSalary()));
		System.out.println("Employee search with id 1001");
		int ar[] = new int[] { 1, 2, 3, 4 };

		if (dao.searchEmployee(1001) != null) {
			System.out.println("found with id 1001");
			Employee e = dao.searchEmployee(1001);
			System.out.println(e.getId() + "\t" + e.getName() + "\t" + e.getSalary());
		} else
			System.out.println("not found with id 1001");
		System.out.println("Employee search with id 10001");

		if (dao.searchEmployee(10001) != null) {
			System.out.println("found with id 10001");
			Employee e = dao.searchEmployee(10001);
			System.out.println(e.getId() + "\t" + e.getName() + "\t" + e.getSalary());
		} else
			System.out.println("not found with id 10001");
		Employee emp[] = new Employee[] {

				new Employee(8001, "rajesh kumar", 56000.0f), new Employee(8002, "umesh kumar", 86000.0f),
				new Employee(8003, "barjesh kumar", 56000.0f) }

		;

		dao.addEmployee(emp[0]);
		dao.addEmployee(emp[1]);
		dao.addEmployee(emp[2]);
		
		System.out.println("after adding all records are \n");
		dao.showAllEmployee()
				.forEach(emp1 -> System.out.println(emp1.getId() + "\t" + emp1.getName() + "\t" + emp1.getSalary()));
		
	}

}