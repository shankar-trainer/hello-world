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
import java.util.List;

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

public class DeleteProduct extends JFrame implements ActionListener {
	private ProductDao dao;
	private Product product;
	private JLabel jLabel[];
	private JTextField textField;
	private JPanel jPanel, jPanel2;
	private JButton b1[], b2;
	private String ar[] = {"Delete By PrdId", "Delete By Company Name",
			"Delete By Product Type", "Delete By Product Color",
			"Delete By Quantity", "Delete By Buy Price", "Delete By Sell Price"};

	public DeleteProduct() throws HeadlessException, SQLException {
		dao = new ProductDao();
		jLabel = new JLabel[2];

		jLabel[0] = new JLabel("Search Page");
		jLabel[0].setFont(new Font(Font.DIALOG, Font.BOLD, 20));

		setLayout(new BorderLayout());
		jPanel = new JPanel();

		jPanel.add(jLabel[0]);
		add("North", jPanel);

		jPanel2 = new JPanel();
		jPanel2.setLayout(new GridLayout(6, 2));

		jLabel[1] = new JLabel("Enter Search Key");
		textField = new JTextField(10);

		b2 = new JButton("Cancel");

		jPanel2.add(jLabel[1]);
		jPanel2.add(textField);

		jPanel2.add(new JLabel(""));
		jPanel2.add(new JLabel(""));

		b1 = new JButton[7];
		for (int i = 0; i < b1.length; i++) {
			b1[i] = new JButton(ar[i]);
			b1[i].addActionListener(this);
			jPanel2.add(b1[i]);
		}

		jPanel2.add(b2);
		add("South", jPanel2);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setVisible(true);
		pack();
	}

	public static void main(String[] args) {
		try {
			new SearchProdudct();
		} catch (HeadlessException | SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		int prdid = 0;
		try {
			dao = new ProductDao();
			String s = textField.getText();
			if (s.isEmpty())
				JOptionPane.showMessageDialog(null, "product id is empty");
			else if (arg0.getActionCommand().equals("Delete By PrdId")) {
				prdid = Integer.parseInt(s);
				String s1 = dao.deleteProductById(prdid);
					JOptionPane
							.showMessageDialog(null, s1);

			} else if (arg0.getActionCommand().equals("Delete By Company Name")) {
				String s1 = dao.deleteProductByCname(s);
				JOptionPane
						.showMessageDialog(null, s1);

			} else if (arg0.getActionCommand().equals("Delete By Product Type")) {
				String s1 = dao.deleteProductByProductType(s);
				JOptionPane
						.showMessageDialog(null, s1);

			} else if (arg0.getActionCommand().equals("Delete By Product Color")) {
				String s1 = dao.deleteProductByPrdColor(s);
				JOptionPane
						.showMessageDialog(null, s1);
			} else if (arg0.getActionCommand().equals("Delete By Quantity")) {
				prdid = Integer.parseInt(s);
				String s1 = dao.deleteProductByQty(prdid);
				JOptionPane
						.showMessageDialog(null, s1);

			} else if (arg0.getActionCommand().equals("Delete By Buy Price")) {
				float buyprice = Float.parseFloat(s);
				String s1 = dao.deleteProductByBuyPrice(buyprice);
				JOptionPane
						.showMessageDialog(null, s1);

			} else if (arg0.getActionCommand().equals("Delete By Sell Price")) {
				float sellprice = Float.parseFloat(s);
				String s1 = dao.deleteProductBySellPrice(sellprice);
				JOptionPane
						.showMessageDialog(null, s1);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "product id must be numeric");
		}
	}
}
