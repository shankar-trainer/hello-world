package com.capgemini.database.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
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
	PreparedStatement pst;

	ResultSet rs;
	Person person;

	Map<Integer, Person> map;

	public PersonDao() throws SQLException {
		connection = DatabaseUtil.myConnection();
		st = connection.createStatement();
	}

	public boolean updatePerson(Person person) throws SQLException {
		if (searchPerson(person.getId()) != null) {
			pst = null;
			pst = connection.prepareStatement("update   person  set name=?, salary=?, dob=? where  id=?");
			pst.setString(1, person.getName());
			pst.setFloat(2, person.getSalary());
			pst.setDate(3, new java.sql.Date(person.getDob().getTime()));
			pst.setInt(4, person.getId());

			pst.executeUpdate();
			return true;
		}

		return false;
	}

	public boolean removePerson(int id) throws SQLException {
		if (searchPerson(id) != null) {
			pst = null;
			pst = connection.prepareStatement("delete from  person where  id=?");
			pst.setInt(1, id);
			pst.executeUpdate();

			return true;

		} else {
			return false;
		}
	}

	public boolean addPerson(Person person) throws SQLException {
		if (searchPerson(person.getId()) != null) {
			return false;
		} else {
			pst = connection.prepareStatement("insert into person(id,name,salary,dob) values(?,?,?,?)");
			pst.setInt(1, person.getId());
			pst.setString(2, person.getName());
			pst.setFloat(3, person.getSalary());
			pst.setDate(4, new java.sql.Date(person.getDob().getTime()));

			pst.executeUpdate();
			return true;
		}
	}

	public Person searchPerson(int id) throws SQLException {
		rs = null;
		person = null;
		rs = st.executeQuery("select * from person where id=" + id);
		if (rs.next()) {
			person = new Person();

			person.setId(rs.getInt(1));
			person.setName(rs.getString(2));
			person.setSalary(rs.getFloat(3));
			person.setDob(rs.getDate(4));
		}
		return person;
	}

	public Map<Integer, Person> getAllPerson() throws SQLException {
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
