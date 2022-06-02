package com.cognizant.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.cognizant.model.Employee;

class EmpRowMapper implements RowMapper<Employee> {

	public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
		Employee e = new Employee();
		e.setId(rs.getInt(1));
		e.setName(rs.getString(2));
		e.setSalary(rs.getFloat(1));
		return e;
	}
}

public class EmployeeDaoImpl implements EmployeeDao {
	private JdbcTemplate jdbcTemplate;
	

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public boolean addEmployee(Employee emp) {
		int x = jdbcTemplate.update(
				"insert into employee values(" + emp.getId() + ",'" + emp.getName() + "'," + emp.getSalary() + ")");
		if (x == 1)
			return true;
		else
			return false;
	}

	public boolean removeEmployee(int id) {
		try {
			int x = jdbcTemplate.update("delete from employee where id=" + id);
			if (x == 1)
				return true;
			return false;
		} catch (DataAccessException e) {
			System.out.println("record not present " + e);

		}
		return false;
	}

	public Employee searchEmployee(int id1) {
		emp = null;
		emp = jdbcTemplate.queryForObject("select * from employee where id=?",new Object[]{id1} ,new EmpRowMapper());

		return emp;
	}

	public boolean updateEmployee(Employee emp) {
		// TODO Auto-generated method stub
		return false;
	}

	Employee emp;
	List<Employee> empList = null;

	public List<Employee> showAllEmployee() {
		empList = null;
		empList = new ArrayList<Employee>();
		List<Map<String, Object>> queryForList = jdbcTemplate.queryForList("select * from employee");

		for (Map<String, Object> map1 : queryForList) {
			emp = null;
			emp = new Employee();

			emp.setId(Integer.parseInt(String.valueOf(map1.get("id"))));
			emp.setName(map1.get("name").toString());

			emp.setSalary(Float.parseFloat(String.valueOf(map1.get("salary"))));

			empList.add(emp);
		}

		return empList;
	}

}
