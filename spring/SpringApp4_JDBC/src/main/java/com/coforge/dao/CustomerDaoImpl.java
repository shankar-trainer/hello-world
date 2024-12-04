package com.coforge.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.stereotype.Repository;

import com.coforge.model.Customer;

import lombok.Data;

@Data
@Repository
public class CustomerDaoImpl implements CustomerDao {

	@Autowired
	JdbcTemplate template;

	@Override
	public List<Customer> getAllCustomer() {
		
		
	return 	template.query("select * from customer ", new ResultSetExtractor<List<Customer>>() {
			@Override
			public List<Customer> extractData(ResultSet rs) throws SQLException, DataAccessException {
				
				List<Customer> list=new ArrayList<Customer>();
				Customer customer=null;
				
				while(rs.next()) {
					customer=null;
					customer=new Customer();
					customer.setId(rs.getInt(1));
					customer.setName(rs.getString(2));
					customer.setSalary(rs.getFloat(3));
					list.add(customer);
				}
				
				return list;
			}
		} );
		
	}

	@Override
	public Customer saveCustomer(Customer c) throws DuplicateKeyException{
		int r = template
				.update("insert into customer values(" + c.getId() + ",'" + c.getName() + "'," + c.getSalary() + ")");
		if (r == 0)
			return null;
		else
			return c;
	}

	@Override
	public Customer searchCustomer(int id) {
		return null;
	}

}
