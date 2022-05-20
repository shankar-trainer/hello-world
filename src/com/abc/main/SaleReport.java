package com.abc.main;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.sql.SQLException;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import com.abc.database.SaleDao;

public class SaleReport extends JFrame {

	JPanel jPanel1, jPanel2;
	JLabel jLabel[];
	String msg[] = {"Order Id", "Sale Date", "Comapany Name", "Product Type",
			"Total Sold Item", "Quantity", "Profit" };

	SaleDao dao;
	JTable jTable;
	Object data[][] ;

	public SaleReport() throws SQLException {
		setLayout(new BorderLayout());
		JLabel label=new JLabel("                 SalesReport");
		label.setFont(new Font(Font.DIALOG, Font.BOLD, 20));
		
		add("North",label);
		
		dao=new SaleDao();
		
		List<String> salesReport = dao.salesReport();
		System.out.println(salesReport.size());
		
		data= new Object[salesReport.size()/7][7];

		for (int i = 0,k=0; i <salesReport.size()/7; i++) {
			for (int j = 0; j <7; j++) {
				data[i][j]=salesReport.get(k++);
			}
		}
		
		jTable=new JTable(data, msg);
		
		JScrollPane sc = new JScrollPane(jTable);
		add("South",sc);
		
		setVisible(true);
		setDefaultCloseOperation(HIDE_ON_CLOSE);
		//setSize(300, 200);
		pack();
	}

	public static void main(String[] args) throws SQLException {
		new SaleReport();
	}
}
