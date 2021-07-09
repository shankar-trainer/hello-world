//package cts.database.dao;
//
//import java.sql.Connection;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.sql.Statement;
//import java.util.Set;
//
//import cts.database.util.DatabaseUtil;
//
//public class EmployeeDao {
//
//	private Connection con;
//	private Statement st;
//	private PreparedStatement pst;
//	private ResultSet rs;
//
//	private Set<Employee> empSet;
//
//	public EmployeeDao() throws SQLException {
//		con = DatabaseUtil.MyConnection();
//	}
//
//	public boolean addEmployee(Employee employee) {
//
//		/*
//		 * pst = con.prepareStatement("insert into employee values(?,?,?,?)");
//		 * pst.setInt(1, employee.getEmpId()); pst.setString(2, employee.getEmpName());
//		 * pst.setFloat(3, employee.getSalary());
//		 */
//		// pst.setInt(4, employee.getDob());
//	}
//
//	/*
//	 * public Employee searachEmployee(int id) {
//	 * 
//	 * }
//	 * 
//	 * public showAllEmployee()
//	 */
//}
