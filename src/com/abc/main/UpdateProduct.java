package com.abc.main;

import com.abc.database.ProductDao;
import com.abc.model.Product;

import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.List;

public class UpdateProduct extends JFrame {
	private ProductDao dao;
	private Product product;
	private JLabel jLabel[];
	private JTextField textField[];
	private JPanel jpanel0,jPanel, jPanel2;
	
	private JButton b1[];
	String label[] = { "Enter product Id", "Enter product Id", "Enter Company Name",
			"Enter Product Type", "Enter Product Color", "Enter Qty",
			"Enter Buy Price", "Enter Sell price" };
	String label1[] = { "Search", "Cancel", "Update", "Cancel" };

	public UpdateProduct() throws HeadlessException, SQLException {
		dao = new ProductDao();
		jLabel = new JLabel[8];
		textField = new JTextField[8];
		b1 = new JButton[4];

		for (int x = 0; x < jLabel.length; x++) {
			jLabel[x] = new JLabel(label[x]);
			textField[x] = new JTextField(10);
		}
		for (int x = 0; x < b1.length; x++) {
			b1[x] = new JButton(label1[x]);
		}
		setLayout(new BorderLayout());

		jPanel = new JPanel();
		jpanel0 = new JPanel();
		jpanel0.add(new JLabel("Update Page"));
		add("North", jpanel0);

		
		//jLabel[0].setFont(new Font(Font.DIALOG, Font.BOLD, 20));
		jPanel.setLayout(new GridLayout(2, 2));

		jPanel.add(jLabel[0]);
		jPanel.add(textField[0]);
		jPanel.add(b1[0]);
		jPanel.add(b1[1]);

		add("Center", jPanel);

		jPanel2 = new JPanel();
		jPanel2.setLayout(new GridLayout(8, 2));

		for (int x = 1; x <= 7; x++) {
			jPanel2.add(jLabel[x]);
			jPanel2.add(textField[x]);
		}
		jPanel2.add(b1[2]);
		jPanel2.add(b1[3]);
		add("South", jPanel2);

		b1[0].addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent actionEvent) {
				try {
					dao = new ProductDao();
					product = null;

					try {
						product = dao.searchById(Integer.parseInt(textField[0]
								.getText()));
						if (product != null) {

							textField[1].setText(new Integer(product.getPrdId())
									.toString());
							textField[2].setText(product.getCname());
							textField[3].setText(product.getPrdType());
							textField[4].setText(product.getPrdColor());
							textField[5].setText(new Integer(product.getQty())
									.toString());
							textField[6].setText(new Float(product
									.getBuyPrice()).toString());
							textField[7].setText(new Float(product
									.getSellPrice()).toString());
						} else
							JOptionPane.showMessageDialog(null,
									"Product not found");

					} catch (NumberFormatException e) {
						JOptionPane.showMessageDialog(null,
								"Please Enter Numeric value");
					}
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		});

		b1[2].addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent actionEvent) {
				try {
					dao = new ProductDao();
					product = null;
					product = new Product();
					product.setPrdId(Integer.parseInt(textField[1].getText()));
					product.setCname(textField[2].getText());
					product.setPrdType(textField[3].getText());
					product.setPrdColor(textField[4].getText());
					product.setQty(Integer.parseInt(textField[5].getText()));
					product.setBuyPrice(Float.parseFloat(textField[6].getText()));
					product.setSellPrice(Float.parseFloat(textField[7]
							.getText()));

					JOptionPane.showMessageDialog(null,
							dao.updateProduct(product));

				} catch (SQLException e) {
					e.printStackTrace();
				}

			}
		});

		b1[1].addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent actionEvent) {
				textField[0].setText("");

			}
		});
		b1[3].addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent actionEvent) {
				for (int i = 1; i <= 7; i++)
					textField[i].setText("");

			}
		});

		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setSize(300, 500);
		setVisible(true);
		pack();
	}

	public static void main(String[] args) {
		try {
			new UpdateProduct();
		} catch (HeadlessException | SQLException e) {
			e.printStackTrace();
		}
	}
}
