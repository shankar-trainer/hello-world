package com.cts.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.cts.model.Product;
import com.cts.util.DatabaseUtil;

public class ProductDao {

	Connection connection;
	PreparedStatement pst;
	Statement st;
	ResultSet rs;

	Product product;

	List<Product> plist;

	public ProductDao() throws SQLException {
		connection = DatabaseUtil.myConnection();
	}

	public List<Product> getAllProduct() throws SQLException {
		st = connection.createStatement();
		rs = st.executeQuery("select * from product");
		plist = new ArrayList<Product>();

		while (rs.next()) {
			product = null;
			product = new Product();

			product.setPrdId(rs.getInt(1));
			product.setPrdName(rs.getString(2));
			product.setCost(rs.getFloat(4));
			plist.add(product);

		}
		return plist;
	}

}
