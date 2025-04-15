package com.cts.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.cts.model.Employee;

public class EmployeeDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public Employee searchById(int id) {
		List<Map<String, Object>> queryForList = jdbcTemplate.queryForList("select * from employee where id=?", id);
		Employee employee = null;

		for (Map<String, Object> map1 : queryForList) {
			employee = null;
			employee = new Employee();

			employee.setId(Integer.parseInt(map1.get("id").toString()));
			employee.setName((map1.get("name").toString()));
			employee.setSalary(Float.parseFloat(map1.get("salary").toString()));
		}
		if (queryForList.size() == 0)
			throw new RuntimeException("no record found with id " + id);
		else
			return employee;

	}

	public List<Employee> showAll() {
		List<Map<String, Object>> queryForList = jdbcTemplate.queryForList("select * from employee");

		List<Employee> list1 = new ArrayList<Employee>();
		Employee employee = null;

		for (Map<String, Object> map1 : queryForList) {
			employee = null;
			employee = new Employee();

			employee.setId(Integer.parseInt(map1.get("id").toString()));
			employee.setName((map1.get("name").toString()));
			employee.setSalary(Float.parseFloat(map1.get("salary").toString()));
			list1.add(employee);
		}
		if (list1.size() == 0)
			throw new RuntimeException("Employee list is empty");
		return list1;
	}

	public boolean updateEmploye(Employee employee) {
		Employee searchById = searchById(employee.getId());
		if (searchById != null) {
			int x = jdbcTemplate.update("update employee set  name=?, salary=? where id=?", employee.getName(),employee.getSalary(), employee.getId());
			if (x == 1)
				return true;
		} else {
			throw new RuntimeException("id not found");
		}
		return true;
	}

	public boolean saveEmploye(Employee employee) throws DuplicateKeyException {

		int x = jdbcTemplate.update("insert into employee values(" + employee.getId() + ",'" + employee.getName() + "',"
				+ employee.getSalary() + ")");
		if (x == 1)
			return true;
		return false;
	}

	public boolean deleteEmploye(int id) {

		int x = jdbcTemplate.update("delete from employee where id=?", id);
		if (x == 1)
			return true;
		return false;
	}

}
