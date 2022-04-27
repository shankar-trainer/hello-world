package com.cts.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCallback;
import org.springframework.jdbc.core.RowMapper;

import com.cts.model.Customer;

public class CustomerDaoImpl implements CustomerDao {

	private JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public boolean addCustomer(Customer cs) {

		Customer searchCustomer = searchCustomer(cs.getId());
		if (searchCustomer == null) {
			jdbcTemplate.update(
					"insert into customer values(" + cs.getId() + ",'" + cs.getName() + "'," + cs.getSalary() + ")");
			return true;
		} else
			return false;
	}

	@Override
	public List<Customer> getAllCustomer() {

		return jdbcTemplate.query("select * from customer", new RowMapper<Customer>() {
			@Override
			public Customer mapRow(ResultSet rs, int rowNum) throws SQLException {
				Customer cs1 = new Customer();
				cs1.setId(rs.getInt(1));
				cs1.setName(rs.getString(2));
				cs1.setSalary(rs.getFloat(3));

				return cs1;
			}
		});
	}

	@Override
	public Customer searchCustomer(int id1) {
		try {
			return jdbcTemplate.queryForObject("select * from customer where id=?", new Object[] { id1 },
					new RowMapper<Customer>() {
						@Override
						public Customer mapRow(ResultSet rs, int rowNum) throws SQLException {
							Customer cs1 = new Customer();
							cs1.setId(rs.getInt(1));
							cs1.setName(rs.getString(2));
							cs1.setSalary(rs.getFloat(3));

							return cs1;
						}
					});
		} catch (DataAccessException e) {
			return null;
		}
	}

	@Override
	public boolean updateCustomer(Customer cs) {
		return jdbcTemplate.execute("update  customer set name=?,salary =? where id=?",
				new PreparedStatementCallback<Boolean>() {

					@Override
					public Boolean doInPreparedStatement(PreparedStatement ps)
							throws SQLException, DataAccessException {
						// TODO Auto-
						ps.setInt(1, cs.getId());
						ps.setString(1, cs.getName());
						ps.setFloat(1, cs.getSalary());
						return ps.execute();
					}

				});
	}
}
