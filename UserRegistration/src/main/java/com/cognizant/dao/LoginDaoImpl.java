package com.cognizant.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.cognizant.model.Login;

class LoginRowMapper implements RowMapper<Login> {

	public Login mapRow(ResultSet rs, int rowNum) throws SQLException {
		Login login = new Login();
		login.setId(rs.getString(1));
		login.setPass(rs.getString(2));
		login.setCredential(rs.getString(3));
		return login;
	}
}

//@Repository
public class LoginDaoImpl implements LoginDao {
	private JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public String chceckLogin(Login login) {
		try {
			Login login1 = jdbcTemplate.queryForObject("select * from login where id=? and password=?", new Object[] { login.getId(),login.getPass() },
					new LoginRowMapper());
			return login1.getCredential();
		} catch (EmptyResultDataAccessException e) {
			return null;
		}
	}
}
