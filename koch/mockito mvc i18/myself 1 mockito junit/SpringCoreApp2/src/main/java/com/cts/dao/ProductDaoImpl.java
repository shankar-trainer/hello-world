package com.cts.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;

import com.cts.model.Product;

public class ProductDaoImpl implements ProductDao {
	DataSource ds;
	JdbcTemplate jt;

	public DataSource getDs() {
		return ds;
	}

	public void setDs(DataSource ds) {
		this.ds = ds;
	}

	@Override
	public boolean addProduct(Product product) {
		jt = new JdbcTemplate(ds);
		int p = jt.update("insert into product values(?,?,?)", product.getpId(), product.getpName(),
				product.getpCost());
		if (p == 1)
			return true;
		else
			return false;
	}

	List<Product> plist;

	@Override
	public List<Product> showAllProduct() {
		jt = new JdbcTemplate(ds);
		plist = new ArrayList<Product>();

		List<Map<String, Object>> queryForList = jt.queryForList("select * from product");
		Product product;

		for (Map<String, Object> m : queryForList) {
			product = null;
			product = new Product();

			product.setpId(Integer.parseInt(m.get("prd_Id").toString()));
			// product.setpId(Integer.parseInt(String.valueOf(m.get("prd_Id"))));

			product.setpName(m.get("prd_name").toString());
			product.setpCost(Float.parseFloat(m.get("prd_cost").toString()));

			plist.add(product);
		}
		return plist;
	}

	@Override
	public boolean removeProduct(Product product) {
		return false;
	}

	@Override
	public boolean searchProduct(Product product) {
		return false;
	}

	@Override
	public boolean updateProduct(Product product) {
		return false;
	}

	@Override
	public List<Product> showAllProduct1() {
		jt = new JdbcTemplate(ds);
		
		return jt.query("select * from product", new ResultSetExtractor<List<Product>>() {
			@Override
			public List<Product> extractData(ResultSet rs) throws SQLException {
				ArrayList<Product> elist = new ArrayList<>();
				Product p;
				while (rs.next()) {
					p = new Product();
					p.setpId(rs.getInt(1));
					p.setpName(rs.getString(2));
					p.setpCost(rs.getFloat(3));
					elist.add(p);
				}
				return elist;
			}
		});

	}

}
