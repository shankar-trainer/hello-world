package database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import database.model.Student;
import database.util.DatabaseUtil;

public class StudentOperation {

	Connection con;
	ResultSet rs;
	Statement st;
	PreparedStatement pst;

	public StudentOperation() {
		con = DatabaseUtil.retrieveConnection();
	}

	List<Student> list_stud;

	public List<Student> showAllStudent() throws SQLException {
		st = null;
		rs = null;
		st = con.createStatement();

		list_stud = null;
		list_stud = new ArrayList<Student>();
		rs = st.executeQuery("select * from student");
		while (rs.next()) {
			Student stud = new Student();
			stud.setRoll(rs.getInt(1));
			stud.setName(rs.getString(2));
			stud.setMarks(rs.getFloat(3));
			stud.setDob(rs.getDate(4));
			list_stud.add(stud);
		}
		return list_stud;
	}

	public boolean searchStudent(Student student) throws SQLException {
		pst = con.prepareStatement("select * from student where roll=?");
		pst.setInt(1, student.getRoll());
		rs = null;

		rs = pst.executeQuery();
		if (rs.next())
			return true;
		else
			return false;

	}

	public boolean addStudent(Student student) throws SQLException {
		if (searchStudent(student)) {
			return false;
		} else {
			pst = con.prepareStatement("insert into student values(?,?,?,?)");
			pst.setInt(1, student.getRoll());
			pst.setString(2, student.getName());
			pst.setFloat(3, student.getMarks());
			pst.setDate(4, new java.sql.Date(student.getDob().getTime()));

			pst.executeUpdate();
			return true;
		}

	}

	public boolean removeStudent(Student student) throws SQLException {
		if (searchStudent(student)) {
			pst = null;
			pst = con.prepareStatement("delete from student where roll=?");
			pst.setInt(1, student.getRoll());
			pst.executeUpdate();

			return true;
		}
		return false;
	}

	public boolean updateStudent(Student student) throws SQLException {
		if (searchStudent(student)) {
			pst = null;
			pst = con.prepareStatement("update student set name=?, dob=?,marks=? where roll=?");
			pst.setString(1, student.getName());
			pst.setDate(2, new java.sql.Date(student.getDob().getTime()));
			pst.setFloat(3, student.getMarks());
			pst.setInt(4, student.getRoll());
			return true;
		} else
			return false;
	}

}
