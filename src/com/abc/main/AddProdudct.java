package com.abc.main;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;

import com.abc.database.ProductDao;
import com.abc.model.Product;

public class AddProdudct extends JFrame {
	ProductDao dao;
	Product product;
	JLabel jLabel;
	JPanel jPanel;
	JButton button1, button2;

	JLabel jLabel1[];
	JTextField textField[];
	String label[] = { "Enter product Id", "Enter Company Name",
			"Enter Product Type", "Enter Product Color", "Enter Qty",
			"Enter Buy Price", "Enter Sell price" };

	public AddProdudct() throws HeadlessException, SQLException {
		dao = new ProductDao();
		jLabel = new JLabel("Add Product");
		jLabel.setFont(new Font(Font.DIALOG, Font.BOLD, 20));

		setLayout(new BorderLayout());
		add("North", jLabel);

		jPanel = new JPanel();

		jPanel.setLayout(new GridLayout(8, 2));

		jLabel1 = new JLabel[7];
		textField = new JTextField[7];

		System.out.println(jLabel1.length);

		for (int i = 0; i < jLabel1.length; i++) {
			jLabel1[i] = new JLabel(label[i]);
			jPanel.add(jLabel1[i]);
			textField[i] = new JTextField(10);
			jPanel.add(textField[i]);
		}

		button1 = new JButton("Add Product");
		button2 = new JButton("Cancel Product");

		jPanel.add(button1);
		jPanel.add(button2);

		button2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
			for(JTextField field:textField){
				  field.setText("");
			}
			}
		});

		button1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				product = new Product();
				if (textField[0].getText().isEmpty())
					JOptionPane.showMessageDialog(null, "propduct id is empty");
				else if (textField[1].getText().isEmpty())
					JOptionPane.showMessageDialog(null,
							"propduct company name is empty");
				else if (textField[2].getText().isEmpty())
					JOptionPane.showMessageDialog(null,
							"propduct type is empty");
				else if (textField[3].getText().isEmpty())
					JOptionPane.showMessageDialog(null,
							"propduct color is empty");
				else if (textField[4].getText().isEmpty())
					JOptionPane.showMessageDialog(null,
							"propduct quantity is empty");
				else if (textField[5].getText().isEmpty())
					JOptionPane.showMessageDialog(null,
							"propduct buy price is empty");
				else if (textField[6].getText().isEmpty())
					JOptionPane.showMessageDialog(null,
							"propduct sell price is empty");

				int prdid = Integer.parseInt(textField[0].getText());
				String cname = textField[1].getText();
				String ptype = textField[2].getText();
				String pcolor = textField[3].getText();
				int qty = Integer.parseInt(textField[4].getText());
				float buyprice = Float.parseFloat(textField[5].getText());
				float sellprice = Float.parseFloat(textField[6].getText());

				product.setPrdId(prdid);
				product.setSellPrice(sellprice);
				product.setCname(cname);
				product.setBuyPrice(buyprice);
				product.setPrdColor(pcolor);
				product.setQty(qty);
				product.setPrdType(ptype);

				try {
					JOptionPane.showMessageDialog(null, dao.addProduct(product));
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		});

		jPanel.setBackground(Color.cyan);
		Border border = jPanel.getBorder();

		// Border blackline = BorderFactory.createLineBorder(Color.black);

		Border margin = new EmptyBorder(20, 20, 20, 20);
		jPanel.setBorder(new CompoundBorder(border, margin));
		// setBorder(new CompoundBorder(blackline, margin));

		add("South", jPanel);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		
		setSize(400, 300);
		setLocation(600, 100);

		setVisible(true);
		// pack();
	}

	public static void main(String[] args) {
		try {
			new AddProdudct();
		} catch (HeadlessException | SQLException e) {
			e.printStackTrace();
		}
	}
}
