package com.abc.main; 

import javax.swing.*;

import com.abc.database.ProductDao;
import com.abc.model.Product;

import java.awt.*;
import java.sql.SQLException;
import java.util.List;

public class ShowAllProdudct extends JFrame {
	JTable table;
	ProductDao dao;
	Product product;

	public ShowAllProdudct() throws HeadlessException, SQLException {
		dao = new ProductDao();
		List<String> colNames = dao.getColNames();
		Object[] array = colNames.toArray();
		
		colNames.clear();
		for (Object object : array) {
			colNames.add(object.toString().toUpperCase());
		}
		
		colNames.add("Profit".toUpperCase());

		List<Product> productList = dao.getProductList();
		int rowno = productList.size();

		Object data[][] = new Object[rowno][colNames.size() + 1];

		Object ob[][] = new Object[productList.size()][colNames.size() + 1];
		int k = 0;
		for (Product p : productList) {
			ob[k][0] = p.getPrdId();
			ob[k][1] = p.getCname();
			ob[k][2] = p.getPrdType();
			ob[k][3] = p.getPrdColor();
			ob[k][4] = p.getQty();
			ob[k][5] = p.getBuyPrice();
			ob[k][6] = p.getSellPrice();
			ob[k][7] = p.getQty()*p.getSellPrice() - p.getQty()*p.getBuyPrice();
			k++;
		}

		for (int x = 0; x < rowno; x++) {
			for (int i = 0; i < colNames.size(); i++) {
				data[x][i] = ob[x][i];
			}
		}
		
	 table = new JTable(data, colNames.toArray());
		JScrollPane sc = new JScrollPane(table);
		sc.setBackground(Color.CYAN);

		add(sc);
		setDefaultCloseOperation(HIDE_ON_CLOSE);
		setVisible(true);
		setSize(600, 500);
		setLocation(600, 200);

		// pack();
	}

	public static void main(String[] args) {
		try {
			new ShowAllProdudct();
		} catch (HeadlessException | SQLException e) {
			e.printStackTrace();
		}
	}
}
