package com.packt.database.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.packt.database.model.PhoneEntry;

public class PhoneEntryRowMapper implements RowMapper<PhoneEntry> {

	@Override
	public PhoneEntry mapRow(ResultSet resultSet, int index) throws SQLException {
		PhoneEntry entry = new PhoneEntry();
		entry.setFirstName(resultSet.getString("fname"));
		entry.setLastName(resultSet.getString("lname"));
		entry.setPhoneNumber(resultSet.getString("num"));
		return entry;
	}

}
