package org.com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.jws.WebService;

import org.com.dto.Customer;
import org.com.exceptiomn.CustomerException;
import org.com.util.DatabaseUtil;

@WebService
public class CustomerDaoImpl implements CustomerDao {

	Connection connection;
	PreparedStatement pst;
	ResultSet rs;

	public CustomerDaoImpl() {
		try {
			connection = DatabaseUtil.myConnection();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public boolean addCustomer(Customer customer) throws Exception {
		boolean status = false;

		pst = connection.prepareStatement("insert into customer values(?,?,?)");
		pst.setInt(1, customer.getId());
		pst.setString(2, customer.getName());
		pst.setFloat(3, customer.getSalary());
		if (pst.executeUpdate() == 1)
			status = true;
		else
			throw new Exception("customer already present");
		return status;
	}

	@Override
	public boolean removeCustomer(Customer customer) {

		if (searchCustomer(customer) != null) {
			try {
				pst = connection.prepareStatement("delete from customer where id=?");
				pst.setInt(1, customer.getId());
				pst.executeUpdate();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			return true;
		}
		return false;
	}

	Customer customer;

	@Override
	public String searchCustomer(Customer customer) {
		try {
			pst = connection.prepareStatement("select * from customer where id=?");
			pst.setInt(1, customer.getId());
			rs = pst.executeQuery();
			customer = null;

			if (rs.next()) {
				customer = new Customer();
				customer.setId(rs.getInt(1));
				customer.setName(rs.getString(1));
				customer.setSalary(rs.getFloat(3));
				return "Record Found " + customer;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return "Record Not Found";
	}

	List<Customer> clist;

	@Override
	public List<Customer> showAllCustomer() {
		try {
			pst = connection.prepareStatement("select * from customer");
			rs = pst.executeQuery();
			customer = null;
			clist = null;
			clist = new ArrayList<>();

			while (rs.next()) {
				customer = new Customer();
				customer.setId(rs.getInt(1));
				customer.setName(rs.getString(2));
				customer.setSalary(rs.getFloat(3));
				clist.add(customer);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return clist;
	}

	@Override
	public String updateCustomer(Customer customer) {

		if (searchCustomer(customer) != null) {
			try {
				pst = connection.prepareStatement
						("update customer set  name=?, salary=? where id=? ");
				pst.setInt(3, customer.getId());
				pst.setString(1, customer.getName());
				pst.setFloat(2, customer.getSalary());

				pst.executeUpdate();
				if (customer.getSalary() > 12000)
					return "Record Updated but salary is too high";
				else
					return "Record Updated";

			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return "customer not  present";
	}

}
