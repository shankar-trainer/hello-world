package com.cts.database.dao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.cts.database.DatabasaUtil;
import com.cts.database.model.Product;

public class ProductDao {

	Connection con;
	ResultSet rs;
	PreparedStatement pst;
	Statement st;
	List<Product> prdList;
	CallableStatement cst;
	public ProductDao() throws SQLException {
		con = DatabasaUtil.myConnection();
	}

	public boolean saveProduct(Product product) throws SQLException {
		pst=con.prepareStatement("insert into product values(?,?,?,?)");
		Date date1=product.getMfd();
		java.sql.Date date2=new java.sql.Date(date1.getTime());
		
		pst.setInt(1, product.getId());
		pst.setString(2, product.getName());
		pst.setFloat(3, product.getCost());
		pst.setDate(4, date2);
		
	     pst.executeUpdate();
		
		return true;
	}

	public boolean searchProduct(int id) throws SQLException {
	
		cst=con.prepareCall("{call searchproduct(?,?,?,?)}");
		cst.setInt(1, id);
		
		cst.registerOutParameter(2, java.sql.Types.VARCHAR);
		cst.registerOutParameter(3, java.sql.Types.FLOAT);
		cst.registerOutParameter(4, java.sql.Types.DATE);
		
		cst.execute();
		if(cst.getString(2)==null) {
         		return false;
		}
		else {
	System.out.println("name "+cst.getString(2)+" \ncost "+cst.getFloat(3)+"\nmfd"+cst.getDate(4));
			
			return true;
		}
	}

	public List<Product> getAllProduct() throws SQLException {
		st = con.createStatement();
		rs = st.executeQuery("select * from product");
		prdList = new ArrayList<Product>();
		Product p = null;

		while (rs.next()) {
			p = new Product();
			p.setId(rs.getInt(1));
			p.setName(rs.getString(2));
			p.setCost(rs.getFloat(3));
			p.setMfd(rs.getDate(4));
			prdList.add(p);
		}
		return prdList;
	}

}
