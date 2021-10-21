package org.com.webservice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.jws.WebService;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

import org.com.webservice.exception.CustomerException;
import org.com.webservice.model.Customer;

@WebService(endpointInterface = "org.com.webservice.CustomerWebService")

public class CustomerWebServiceImpl implements CustomerWebService {

	Connection con;
	DataSource ds;
	Context ctx;

	PreparedStatement pst;
	ResultSet rs;
	Customer customer;

	public CustomerWebServiceImpl() throws NamingException, SQLException {
		/*
		 * ctx = new InitialContext(); ds = (DataSource)
		 * ctx.lookup("java:comp/env/jdbc/data1"); con = ds.getConnection();
		 */		
		DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
		con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "manager");
	
	}

	@Override
	public Customer SearchCustomer(int id) throws CustomerException {
		try {
			pst = con.prepareStatement("select * from customer where id=?");
			pst.setInt(1, id);

			rs = pst.executeQuery();
			customer = new Customer();
			if (rs.next()) {
				customer.setId(rs.getInt(1));
				customer.setName(rs.getString(2));
				customer.setLocation(rs.getString(3));
			}
			else 
				throw new CustomerException("Customer not found with id "+id);

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return customer;
	}

	@Override
	public List<Customer> getAllCustomer() {
		// TODO Auto-generated method stub
		return null;
	}

}
