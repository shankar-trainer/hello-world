package com.abc.main;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
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

public class Login extends JFrame {

	JLabel label1, label2, label3, label4;
	JTextField t1;
	JPasswordField t2, t3;
	JButton b1, b2;
	JPanel jPanel1, jPanel2;

	public Login() {
		label1 = new JLabel("Login Page");
		// label4 = new JLabel("SignUp");

		label1.setFont(new Font(Font.DIALOG, Font.BOLD, 20));

		jPanel1 = new JPanel();
		jPanel2 = new JPanel();

		setLayout(new BorderLayout());
		jPanel1.add(label1);

		label2 = new JLabel("Enter Id");
		label3 = new JLabel("Enter Password");
		label4 = new JLabel("Enter Re Password");

		t1 = new JTextField(20);
		t2 = new JPasswordField(20);
		t3 = new JPasswordField(20);

		b1 = new JButton("Login");
		b2 = new JButton("Cancel");

		b1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				try {
					if (t1.getText() == null || t1.getText().isEmpty())
						JOptionPane.showMessageDialog(null, "id is blank");

					else if (t2.getText() == null || t2.getText().isEmpty())
						JOptionPane
								.showMessageDialog(null, "password is blank");

					else if (!t2.getText() .equals( t3.getText()))
						JOptionPane.showMessageDialog(null,
								"re password is not same ");
					else if (new LoginDao().checkLogin(t1.getText(),
							t2.getText())) {
						new ProductUi();
						dispose();
					}
					else {
						JOptionPane.showMessageDialog(null,
								"either id or password is wrong ");
					}
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
			}
		});

		jPanel2.setLayout(new GridLayout(4, 2));

		jPanel2.add(label2);
		jPanel2.add(t1);

		jPanel2.add(label3);
		jPanel2.add(t2);

		jPanel2.add(label4);
		jPanel2.add(t3);

		jPanel2.add(b1);
		jPanel2.add(b2);

		add(BorderLayout.NORTH, jPanel1);
		add(BorderLayout.SOUTH, jPanel2);

		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		setSize(400, 500);
		setLocation(400, 100);
		pack();

	}

	public static void main(String[] args) {
		new Login();
	}
}
