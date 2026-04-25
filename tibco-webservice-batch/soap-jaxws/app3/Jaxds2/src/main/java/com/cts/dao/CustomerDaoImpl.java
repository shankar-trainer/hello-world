package com.cts.dao;

import com.cts.model.Customer;
import jakarta.jws.WebService;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@WebService(endpointInterface = "com.cts.dao.CustomerDao")
public class CustomerDaoImpl implements CustomerDao {

	private Connection connection;
	private Statement statement;
	private PreparedStatement preparedStatement;
	private ResultSet resultSet;
    //public CustomerDaoImpl(){}

    public CustomerDaoImpl() throws SQLException, ClassNotFoundException {

		//DriverManager.registerDriver(new org.postgresql.Driver());
		Class.forName("org.postgresql.Driver");
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
