package org.tvscreditserviceltd.action;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;
import org.tvscreditserviceltd.model.Customer;
import org.tvscreditserviceltd.util.DatabaseUtil;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class CustomerAction extends ActionSupport implements
		ModelDriven<Customer>,SessionAware {
	Connection con;
	ResultSet rs;
	Statement st;
	PreparedStatement pst;

	public CustomerAction() {
		try {
			con = DatabaseUtil.myConnection();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	List<Customer> list1 = new ArrayList<Customer>();
	Customer customer;

	public String getAllData() throws SQLException {
		if(con==null)
			System.out.println("connection is null");
		
		st=con.createStatement();
		rs = st.executeQuery("select * from customer");

		while (rs.next()) {
			customer = null;
			customer = new Customer();
			customer.setCustomerId(rs.getInt(1));
			customer.setCustomerName(rs.getString(2));
			customer.setCustomerSalary(rs.getFloat(3));
			list1.add(customer);
		}
		return SUCCESS;
	}

	@Override
	public String execute() throws Exception {
		System.out.println("execute called..");
		return SUCCESS;
	}

	@Override
	public Customer getModel() {
		return  customer;
	}

	Map map1;
	@Override
	public void setSession(Map arg0) {
		map1=arg0;
		map1.put("list1", list1);
	}
}
