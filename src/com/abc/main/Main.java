package com.abc.main;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Main extends JFrame {
	JButton b1, b2;

	public Main() {
		b1 = new JButton("Sign In");
		b2 = new JButton("Sign Up");

		b1.setFont(new Font(Font.DIALOG, Font.BOLD, 20));
		b2.setFont(new Font(Font.DIALOG, Font.BOLD, 20));

		setLayout(new GridLayout(3, 1));
		add(b1);
		add(new JLabel());
		//add(b2);

		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		setSize(400, 200);
		setLocation(400, 100);
		// pack();

		b1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				new Login();
				dispose();
			}
		});
		b2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				new Registration();
				dispose();
			}
		});
	}

	public static void main(String[] args) {
		new Main();
	}
}
