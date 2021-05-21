package com.cts.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.cts.exception.ConsumerException;
import com.cts.model.Consumer;
import com.cts.util.ApplicationUtil;
import com.cts.util.DbConnectionManager;

public class ConsumerDao {

	private Connection connection;
	private Statement statement;
	private PreparedStatement preparedStatement;
	private ResultSet resultSet;
	private List<Consumer> consumerList;
	private Consumer consumer;

	public ConsumerDao() throws SQLException {
		connection = DbConnectionManager.myConnection();
	}

	public Consumer searchConsumer(Consumer consumer) throws SQLException, ConsumerException {
		preparedStatement = connection.prepareStatement("select * from consumer where id=?");
		preparedStatement.setInt(1, consumer.getId());
		resultSet = null;
		consumer = null;
		resultSet = preparedStatement.executeQuery();
		if (resultSet.next()) {
			consumer = new Consumer();
			consumer.setId(resultSet.getInt(1));
			consumer.setName(resultSet.getString(2));
			consumer.setSalary(resultSet.getFloat(3));
			consumer.setDob(resultSet.getDate(4));
			return consumer;
		} else
			 return null;
			//throw new ConsumerException("consumer not found ");
	}

	public Consumer addConsumer(Consumer consumer) throws SQLException, ConsumerException {
		Consumer consumer2 = searchConsumer(consumer);
		if (consumer2 == null) {
			preparedStatement = connection.prepareStatement("insert into  consumer values(?,?,?,?)");
			preparedStatement.setInt(1, consumer.getId());
			preparedStatement.setString(2, consumer.getName());
			preparedStatement.setFloat(3, consumer.getSalary());
			preparedStatement.setDate(4, ApplicationUtil.convertUtilToSqlDate(consumer.getDob()));
			preparedStatement.executeUpdate();
		}
		if (consumer2 == null) {
			return consumer;
		} else {
			throw new ConsumerException("consumer already present ");
		}
	}

	public Consumer updateConsumer(Consumer consumer) throws SQLException, ConsumerException {
		Consumer consumer2 = searchConsumer(consumer);
		if (consumer2 != null) {
			preparedStatement = connection.prepareStatement("update consumer set name=?,salary=?,dob=? where id=?");
			preparedStatement.setInt(4, consumer.getId());
			preparedStatement.setString(1, consumer.getName());
			preparedStatement.setFloat(2, consumer.getSalary());
			preparedStatement.setDate(3, ApplicationUtil.convertUtilToSqlDate(consumer.getDob()));
			preparedStatement.executeUpdate();
		}
		if (consumer2 != null) {
			return consumer;
		} else {
			throw new ConsumerException("consumer doesnot exist ");
					
		}
	}

	public Consumer deleteConsumer(Consumer consumer) throws SQLException, ConsumerException {
		Consumer consumer2 = searchConsumer(consumer);
		if (consumer2 != null) {
			preparedStatement = connection.prepareStatement("delete from  consumer where id=?");
			preparedStatement.setInt(1, consumer.getId());
			preparedStatement.executeUpdate();
		}
		if (consumer2 != null) {
			return consumer2;
		} else {
			throw new ConsumerException("consumer not found ");
		}
	}

	public List<Consumer> getAllConsumer() throws SQLException, ConsumerException {
		statement = connection.createStatement();
		resultSet = statement.executeQuery("select * from consumer");
		consumerList = new ArrayList<Consumer>();

		while (resultSet.next()) {
			consumer = null;
			consumer = new Consumer();
			consumer.setId(resultSet.getInt(1));
			consumer.setName(resultSet.getString(2));
			consumer.setSalary(resultSet.getFloat(3));
			consumer.setDob(resultSet.getDate(4));
			consumerList.add(consumer);
		}
		if(consumerList.size()>=1)
		return consumerList;
		else
			throw new ConsumerException("Consumer Listg is empty ");
		
	}
}
