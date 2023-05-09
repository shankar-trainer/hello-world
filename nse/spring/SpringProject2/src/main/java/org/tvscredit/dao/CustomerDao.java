package org.tvscredit.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.tvscredit.model.Customer;

public class CustomerDao {
	private JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public int saveCustomer(Customer customer) {
		return jdbcTemplate.update("insert into customer values(" + customer.getCustId() + ",'" + customer.getCustName()
				+ "'," + customer.getCustSalary() + ")");
	}

	public Customer searchCustomer(int id) {
		return jdbcTemplate.queryForObject("select * from customer where customerid=?", new Object[] { id },
				new RowMapper<Customer>() {

					@Override
					public Customer mapRow(ResultSet rs, int rowNum) throws SQLException {
						Customer c = new Customer();
						c.setCustId(rs.getInt(1));
						c.setCustName(rs.getString(2));
						c.setCustSalary(rs.getFloat(3));
						return c;
					}
				});
	}

	public int deleteCustomer(int id) {
		return jdbcTemplate.update("delete from  customer where customerid=" + id);
	}

	public int updateCustomer(Customer customer) {
		return jdbcTemplate.update("update  customer set customername='" + customer.getCustName() + "', salary="
				+ customer.getCustSalary() + " where customerid=" + customer.getCustId());
	}

	List<Customer> clist;

	public List<Customer> showAllCustomer() {
		clist = new ArrayList<Customer>();
		Customer customer;
		List<Map<String, Object>> queryForList = jdbcTemplate.queryForList("select * from customer");
		for (Map<String, Object> map : queryForList) {
			customer = null;
			customer = new Customer();
			customer.setCustId(Integer.parseInt(String.valueOf(map.get("customerid"))));
			customer.setCustName(map.get("customername").toString());
			customer.setCustSalary(Float.parseFloat(String.valueOf(map.get("salary"))));
			clist.add(customer);
		}
		return clist;
	}

}
