package com.abc.main;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.text.ParseException;

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

public class DeleteProdudct extends JFrame {
	ProductDao dao;
	Product product;
	JLabel jLabel[];
	JTextField textField;
	JPanel jPanel, jPanel2;
	JButton b1, b2;

	public DeleteProdudct() throws HeadlessException, SQLException {
		dao = new ProductDao();
		jLabel = new JLabel[2];

		jLabel[0] = new JLabel("Delete Page");

		jLabel[0].setFont(new Font(Font.DIALOG, Font.BOLD, 20));

		setLayout(new BorderLayout());

		jPanel = new JPanel();

		jPanel.add(jLabel[0]);
		add("North", jPanel);

		jPanel2 = new JPanel();
		jPanel2.setLayout(new GridLayout(2, 2));

		jLabel[1] = new JLabel("Enter Product Id");
		textField = new JTextField(10);
		b1 = new JButton("Delete");
		b2 = new JButton("Cancel");

		jPanel2.add(jLabel[1]);
		jPanel2.add(textField);
		jPanel2.add(b1);
		jPanel2.add(b2);

		add("South", jPanel2);

		setDefaultCloseOperation(DISPOSE_ON_CLOSE);

		b1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				try {
					dao = new ProductDao();
					String s = textField.getText();
					if (s.isEmpty())
						JOptionPane.showMessageDialog(null,
								"product id is empty");
					else {
						int prdid = Integer.parseInt(s);
						String deleteProduct = dao.deleteProductById(prdid);
						JOptionPane.showMessageDialog(null, deleteProduct);
					}
				} catch (SQLException e) {
					e.printStackTrace();
				} catch (NumberFormatException e) {
					JOptionPane.showMessageDialog(null,
							"product id must be numeric");
				}
			}
		});
		setSize(300, 150);
		setLocation(600, 100);
		setVisible(true);
		// pack();
	}

	public static void main(String[] args) {
		try {
			new DeleteProdudct();
		} catch (HeadlessException | SQLException e) {
			e.printStackTrace();
		}
	}
}
