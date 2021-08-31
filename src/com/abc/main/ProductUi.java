package com.abc.main;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import com.abc.database.LoginDao;

public class ProductUi extends JFrame {
	JPanel jPanel1, jPanel2;
	JButton b1, b2, b3, b4, b5,b6,b7;

	public ProductUi() {
		setLayout(new BorderLayout());
		add("North", new JLabel("Product UI Page"));
		jPanel1 = new JPanel();
		b1 = new JButton("update product");
		b2 = new JButton("add product");
		b3 = new JButton("delete product");
		b4 = new JButton("search product");
		b5 = new JButton("show all product");
		b6 = new JButton("Sale Product");
		b7 = new JButton("Sale Report");

		b1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				try {
					new UpdateProduct();
				} catch (HeadlessException e) {
					e.printStackTrace();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		});
		b2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				try {
					new AddProdudct();
				} catch (HeadlessException e) {
					e.printStackTrace();
				} catch (SQLException e) {
					e.printStackTrace();
				}
				// dispose();
			}
		});
		b3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				try {
					new DeleteProduct();
					
				} catch (HeadlessException e) {
					e.printStackTrace();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		});
		b4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				try {
					new SearchProdudct();
				} catch (HeadlessException | SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
           
			}
		});
		b5.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				try {
					new ShowAllProdudct();
					// dispose();
				} catch (HeadlessException e) {
					e.printStackTrace();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		});
		
		b6.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				try {
					new SaleUI();
					// dispose();
				} catch (HeadlessException e) {
					e.printStackTrace();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		});

		b7.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				try {
					new SaleReport();					// dispose();
				} catch (HeadlessException e) {
					e.printStackTrace();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		});
		
		jPanel1.setLayout(new GridLayout(4, 2));
		jPanel1.add(b1);
		jPanel1.add(b2);
		jPanel1.add(b3);
		jPanel1.add(b4);
		jPanel1.add(b5);
		jPanel1.add(b6);
		jPanel1.add(b7);

		add("Center", jPanel1);
		// setDefaultCloseOperation(EXIT_ON_CLOSE);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		//setSize(200, 300);
		setLocation(400, 100);
		 pack();
	}

	public static void main(String[] args) {
		new ProductUi();
	}
}
