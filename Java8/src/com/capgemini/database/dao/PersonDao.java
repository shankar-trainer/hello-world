package com.capgemini.database.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;

import com.capgemini.database.model.Person;
import com.capgemini.database.util.DatabaseUtil;

public class PersonDao {

	Connection connection;
	Statement st;
	ResultSet rs;
	Person person;

	Map<Integer, Person> map;

	public PersonDao() throws SQLException {
		connection = DatabaseUtil.myConnection();
	}

	public Map<Integer, Person> getAllPerson() throws SQLException {
		st = connection.createStatement();
		rs = st.executeQuery("select * from person");
		map = null;
		map = new HashMap<>();

		while (rs.next()) {
			person = null;
			person = new Person();

			person.setId(rs.getInt(1));
			person.setName(rs.getString(2));
			person.setSalary(rs.getFloat(3));
			person.setDob(rs.getDate(4));
			map.put(person.getId(), person);
		}
		return map;
	}
}
