package com.coforge.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.coforge.model.Employee;

import lombok.Data;

@Data
@Repository
public class EmployeeDaoImpl implements EmployeeDao {

	@Autowired
	JdbcTemplate template;
	
	Employee employee;

	@Override
	public List<Employee> getAllEmployee() {
		List<Map<String, Object>> queryForList = template.queryForList("select * from employee");

		List<Employee> list = new ArrayList<>();

		for (Map<String, Object> map : queryForList) {
			employee = null;
			employee = new Employee();
			employee.setId(Integer.parseInt(map.get("id").toString()));
			employee.setName(map.get("name").toString());
			employee.setSalary(Float.parseFloat(map.get("salary").toString()));
			list.add(employee);
		}
		return list;
	}

	@Override
	public Employee saveEmployee(Employee employee) throws DuplicateKeyException {
		int r = template.update("insert into employee values(" + employee.getId() + ",'" + employee.getName() + "',"
				+ employee.getSalary() + ")");
		if (r == 1)
			return employee;
		return null;
	}
}
