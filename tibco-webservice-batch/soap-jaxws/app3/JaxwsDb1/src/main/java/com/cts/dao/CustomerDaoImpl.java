package com.cts.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.cts.model.Customer;
import jakarta.jws.WebService;

@WebService
public class CustomerDaoImpl implements CustomerDao {

	private Connection connection;
	private Statement statement;
	private PreparedStatement preparedStatement;
	private ResultSet resultSet;

	public CustomerDaoImpl() throws SQLException {

		DriverManager.registerDriver(new org.postgresql.Driver());
		connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/db2", "postgres", "postgresql");
		statement = connection.createStatement();
	}

	@Override
	public boolean addCustomer(Customer c) throws Exception {
		preparedStatement = connection.prepareStatement("insert into customer  values(?,?,?)");
		preparedStatement.setInt(1, c.getId());
		preparedStatement.setString(2, c.getName());
		preparedStatement.setFloat(3, c.getSalary());

		int x = preparedStatement.executeUpdate();
		if (x == 1)
			return true;
		else
			return false;
	}

	List<Customer> list1;
	Customer customer;

	@Override
	public List<Customer> getAllCustomer() throws Exception {
		preparedStatement = connection.prepareStatement("select * from customer");
		resultSet = preparedStatement.executeQuery();
		list1 = null;
		
		list1 = new ArrayList<Customer>();
		while (resultSet.next()) {
			customer=null;
			customer=new Customer();
			customer.setId(resultSet.getInt(1)); 	
			customer.setName(resultSet.getString(2)); 	
			customer.setSalary(resultSet.getFloat(3)); 	
            list1.add(customer);
		}
		return list1;
	}

}
