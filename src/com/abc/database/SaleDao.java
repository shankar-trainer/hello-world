package com.abc.database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Time;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.abc.database.util.DatabaseUtil;
import com.abc.model.Product;
import com.abc.model.ProductOrder;

public class SaleDao {

	Statement st;
	PreparedStatement pst, pst1, pst2, pst3;
	Connection con;
	ResultSet rs, rs2, rs3;
	ProductOrder order;
	List<String> list1;

	public SaleDao() throws SQLException {
		con = DatabaseUtil.myConnection();
		st = con.createStatement();
	}

	public List<String> salesReport() throws SQLException {
		st = con.createStatement();
		rs3 = st.executeQuery
		("select order_id, sale_date, po.cname,po.prdtype, sum(po.qty) ,p.qty, sum(po.qty)*po.sellprice-sum(po.qty)*po.buyprice  from product_order po, product p  where po.productid=p.prdid group by po.prdType having  po.sale_date=current_date()");
		list1 = null;
		list1 = new ArrayList<>();
		while (rs3.next()) {
			list1.add(rs3.getString(1));
			list1.add(rs3.getString(2));
			list1.add(rs3.getString(3));
			list1.add(rs3.getString(4));
			list1.add(rs3.getString(5));
			list1.add(rs3.getString(6));
			list1.add(rs3.getString(7));
		}
		return list1;
	}

	public String saleProduct(ProductOrder order) throws SQLException {
		pst1 = con
				.prepareStatement("insert into product_order (cname, prdType, prdColor ,qty ,buyPrice, sellPrice,sale_date,productId,time1) values(?,?,?,?,?,?,?,?,?) ");
		pst1.setString(1, order.getCname());
		pst1.setString(2, order.getPrdType());
		pst1.setString(3, order.getPrdColor());
		pst1.setInt(4, order.getQty());
		pst1.setFloat(5, order.getBuyPrice());
		pst1.setFloat(6, order.getSellPrice());
		pst1.setDate(7, new java.sql.Date(new Date().getTime()));
		pst1.setInt(8, order.getPrdId());
		pst1.setTime(9, new Time(new Date().getTime()));

		// update product_order set qty_left=(select qty from product where
		// prdid=9999) where productId=9999;

		pst2 = con
				.prepareStatement("update product_order set qty_left=(select qty from product where prdid=?) where order_id=?");

		pst = con
				.prepareStatement("update product set qty=qty-? where prdId=?");

		pst.setInt(1, order.getQty());
		pst.setInt(2, order.getPrdId());
		System.out.println(order.getQty() + "  qty   order id    "
				+ order.getOrderId());
		int k = pst.executeUpdate();

		int p = pst1.executeUpdate();

		pst3 = con
				.prepareStatement(" select max(order_id) from product_order;");
		rs2 = pst3.executeQuery();

		pst2.setInt(1, order.getPrdId());
		if (rs2.next())
			pst2.setInt(2, rs2.getInt(1));

		int r = pst2.executeUpdate();

		if (k == 1 && p == 1)
			return "product sold";
		else
			return "some problem";
	}
}
