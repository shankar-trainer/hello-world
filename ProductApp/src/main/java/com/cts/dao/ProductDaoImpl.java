package com.cts.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;

import com.cts.entity.Product;
import com.cts.exception.ProductException;
import com.cts.util.DatabaseUtil;

public class ProductDaoImpl implements ProductDao {

	private Connection connection;
	private Statement statement;
	private PreparedStatement pst;
	private ResultSet rs;

	Product product;
	HashMap<Integer, Product> hashMap;

	public ProductDaoImpl() throws SQLException {
		connection = DatabaseUtil.myConnection();
	}

	public Product searchProduct(Product p) throws SQLException {
		product = null;
		pst = connection.prepareStatement("select * from product where prd_Id=?");
		pst.setInt(1, p.getPrdId());
		rs = null;
		rs = pst.executeQuery();
		if (rs.next()) {
			product = null;
			product = new Product();
			product.setPrdId(rs.getInt(1));
			product.setPrdName(rs.getString(2));
			product.setPrdCost(rs.getFloat(3));
		}
		return product;
	}

	public HashMap<Integer, Product> getAllProduct() throws SQLException {
		statement = connection.createStatement();
		rs = statement.executeQuery("select * from product");
		hashMap = new HashMap<Integer, Product>();

		while (rs.next()) {
			product = null;
			product = new Product();
			product.setPrdId(rs.getInt(1));
			product.setPrdName(rs.getString(2));
			product.setPrdCost(rs.getFloat(3));

			hashMap.put(product.getPrdId(), product);
		}
		return hashMap;
	}

	public boolean addProduct(Product p) throws SQLException, ProductException {
		product = null;
		product = searchProduct(p);
		if (product == null) {
			pst = connection.prepareStatement("insert into product values(?,?,?)");
			pst.setInt(1, p.getPrdId());
			pst.setString(2, p.getPrdName());
			pst.setFloat(3, p.getPrdCost());
			pst.executeUpdate();
			return true;
		} else
			throw new ProductException("Product already present in database");
	}

	public boolean removeProduct(Product p) {
		return false;
	}

	public boolean updateProduct(Product p) {
		return false;
	}

}
