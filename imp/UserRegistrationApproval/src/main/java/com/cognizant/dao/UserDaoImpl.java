package com.cognizant.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.dao.DataAccessException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import com.cognizant.model.User;


class UserRowMapper implements RowMapper<User> {

	public User mapRow(ResultSet rs, int rowNum) throws SQLException {
		User e = new User();
		e.setId(rs.getInt(1));
		e.setName(rs.getString(2));
		e.setAge(rs.getInt(3));
		e.setName(rs.getString(4));
		
		return e;
	}
}


public class UserDaoImpl implements  UserDao  {
	private JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	public boolean userRegistration(User user) {
		int x = 0;
		try {
			x = jdbcTemplate.update(
					"insert into user1 values(" + user.getId() + ",'" + user.getName() + "'," + user.getAge() + ",'" + user.getPass() + "','not approved')");
			if (x == 1)
				return true;
			else
				return false;
		} catch (DataAccessException e) {
			System.out.println("error is "+e);
		}
		return false;
	}
	
}


