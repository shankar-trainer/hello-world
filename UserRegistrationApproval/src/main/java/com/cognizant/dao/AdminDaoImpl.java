package com.cognizant.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.cognizant.model.Admin;
import com.cognizant.model.User;


public class  AdminDaoImpl implements AdminDao {
	private JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	
	List<User>  userList;
	User user;
	public List<User> getUserList() {
		
		
		userList = null;
		userList = new ArrayList<User>();
		List<Map<String, Object>> queryForList = jdbcTemplate.queryForList("select * from user1");

		for (Map<String, Object> map1 : queryForList) {
			user = null;
			user = new User();

			user.setId(Integer.parseInt(String.valueOf(map1.get("id"))));
			user.setName(map1.get("name").toString());
			user.setAge(Integer.parseInt(String.valueOf(map1.get("age"))));
			user.setPass(map1.get("password").toString());
			user.setApproved(map1.get("approved").toString());
			userList.add(user);
		}

		return userList;
	}

	public boolean chceckLogin(Admin admin) {
		try {
			Admin  admin1 = jdbcTemplate.queryForObject("select * from admin where id=? and password=?", new Object[] { admin.getId(),admin.getPass() },
					new AdminRowMapper());
			return true;
		} catch (EmptyResultDataAccessException e) {
			return false;
		}
	}
}

class AdminRowMapper implements RowMapper<Admin> {

	public Admin mapRow(ResultSet rs, int rowNum) throws SQLException {
		Admin e = new Admin();
		e.setId(rs.getInt(1));
		e.setPass(rs.getString(2));
		return e;
	}
}

