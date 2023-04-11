package com.audintel.database;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.audintel.database.util.DatabaseUtil;

public class ProductDao {
	Connection connection;
	Statement st;
	PreparedStatement pst;
	ResultSet rs;
	ResultSetMetaData metaData;

	public ProductDao() throws SQLException {
		connection = DatabaseUtil.retrieveConnection();
	}

	public Product addProduct(Product prd) throws SQLException {
		pst = connection.prepareStatement("insert into product values(?,?,?) ");
		pst.setLong(1, prd.getPrdId());
		pst.setString(2, prd.getPrdName());
		pst.setFloat(3, prd.getPrdCost());

		int p = pst.executeUpdate();
		if (p == 1)
			return prd;
		return null;
	}
	public String[] getMaxMinAvgTotalCost() throws SQLException {
		String ar[]=new String[4];
		st=null;
		st = connection.createStatement();
		rs=null;
		rs=st.executeQuery("select max(cost) from product");		
		if(rs.next())
			ar[0]=Float.valueOf(rs.getFloat(1)).toString();
		
		rs=null;
		rs=st.executeQuery("select min(cost) from product");		
		if(rs.next())
			ar[1]=Float.valueOf(rs.getFloat(1)).toString();
		
		rs=null;
		rs=st.executeQuery("select avg(cost) from product");		
		if(rs.next())
			ar[2]=Float.valueOf(rs.getFloat(1)).toString();
		
		rs=null;
		rs=st.executeQuery("select sum(cost) from product");		
		if(rs.next())
			ar[3]=Float.valueOf(rs.getFloat(1)).toString();
		
		return ar;
	}
	

	public String[] getAllColumnName() throws SQLException {
		st = connection.createStatement();
		rs = st.executeQuery("select * from product");
		metaData = rs.getMetaData();
		String column[] = new String[metaData.getColumnCount()];

		for (int i = 0; i < column.length; i++) {
			column[i] = metaData.getColumnName(i + 1);
		}
		return column;
	}

	Product prd1 = null;

	public List<Product> getAllProduct() throws SQLException {
		st = connection.createStatement();
		rs = st.executeQuery("select * from product");
		metaData = rs.getMetaData();
		List<Product> prdList = new ArrayList<>();

		while (rs.next()) {
			prd1=null;
			prd1 = new Product();
			prd1.setPrdId(rs.getLong(1));
			prd1.setPrdName(rs.getString(2));
			prd1.setPrdCost(rs.getFloat(3));
			prdList.add(prd1);
		}
		return prdList;
	}

	CallableStatement cst,cst1;

	public Product searchByProductId(int id) throws SQLException {
		cst = connection.prepareCall("{call searchUsingId(?)}");
		cst.setLong(1, id);
		rs = null;
		rs = cst.executeQuery();
		if (rs.next()) {
			prd1 = null;
			prd1 = new Product();
			prd1.setPrdId(rs.getLong(1));
			prd1.setPrdName(rs.getString(2));
			prd1.setPrdCost(rs.getFloat(3));
			return prd1;
		}
		return null;
	}
	
	public Product searchByProductId1(int id) throws SQLException {
		cst1 = connection.prepareCall("{call searchUsingId1(?,?,?)}");
		cst1.setLong(1, id);
		cst1.registerOutParameter(2, java.sql.Types.VARCHAR);
		cst1.registerOutParameter(3, java.sql.Types.FLOAT);
	 cst1.execute();
	 
	 String nm=cst1.getString(2);
	 float sal=cst1.getFloat(3);
	 
		if (nm!=null || sal!=0) {
			prd1 = null;
			prd1 = new Product();
			prd1.setPrdId(id);
			prd1.setPrdName(nm);
			prd1.setPrdCost(sal);
			return prd1;
		}
		return null;
	}

}
