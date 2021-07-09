package org.cognizant.database.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashSet;
import java.util.Set;

import org.cognizant.database.util.DatabaseUtil;

public class StudentDao {

	Connection con;
	Statement st;
	PreparedStatement pst;
	ResultSet rs;
	Student student;
	Set<Student> studentSet;
	ResultSetMetaData rsmeta;

	public StudentDao() throws SQLException {
		con = DatabaseUtil.myConnection();
	}

	public boolean addStudent(Student student) throws SQLException {
		Student st = searchStudent(student.getRoll());

		if (st == null) {
			pst = con.prepareStatement("insert into student values(?,?,?,?,?)");
			pst.setInt(1, student.getRoll());
			pst.setString(2, student.getName());
			pst.setString(3, student.getSubject());
			pst.setFloat(4, student.getMarks());
			Date date = new Date(student.getDob().getTime());
			pst.setDate(5, date);
			pst.executeUpdate();
			return true;
		}
		return false;
	}

	public Student searchStudent(int roll) throws SQLException {
		pst = null;
		pst = con.prepareStatement("select * from student where roll=?");
		pst.setInt(1, roll);
		rs = pst.executeQuery();
		if (rs.next()) {
			student = null;
			student = new Student(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getFloat(4), rs.getDate(5));
			return student;
		}
		return null;
	}

	public String[] getColNames() throws SQLException {
		st = con.createStatement();
		rs = st.executeQuery("select * from student");
		rsmeta = rs.getMetaData();
		String col[] = new String[rsmeta.getColumnCount()];

		for (int i = 1, j = 0; i <= rsmeta.getColumnCount(); i++) {
			col[j] = rsmeta.getColumnName(i);
			j++;
		}
		return col;
	}

	public Set<Student> getAllStudent() throws SQLException {
		st = null;
		rs = null;
		studentSet = new HashSet<Student>();
		student = null;
		st = con.createStatement();
		rs = st.executeQuery("select * from student");
		studentSet = new HashSet<Student>();
		while (rs.next()) {
			student = new Student(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getFloat(4), rs.getDate(5));
			studentSet.add(student);
		}
		return studentSet;
	}

}
