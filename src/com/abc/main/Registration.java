package com.abc.main;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class Registration extends JFrame {

	JLabel label1, label2, label3, label4, label5, label6, label7, label8,
			label9;
	JTextField t1, t2, t3, t4, t5, t6, t7;
	JButton b1, b2;
	JRadioButton radioButton1, radioButton2;
	ButtonGroup buttonGroup;
	JComboBox<String> city;
	JComboBox<String> country;

	public Registration() {
		city = new JComboBox<>();
		city.addItem("delhi");
		city.addItem("chennai");
		city.addItem("patna");
		city.addItem("mumbai");
		city.addItem("kolkotta");
		city.addItem("madurai");

		country = new JComboBox<>();
		country.addItem("India");
		country.addItem("UK");
		country.addItem("SriLnaka");
		country.addItem("Nepal");
		country.addItem("Mayamar");

		label1 = new JLabel("Registration Page");
		label1.setFont(new Font(Font.DIALOG, Font.BOLD, 20));

		JPanel jPanel1 = new JPanel();
		JPanel jPanel2 = new JPanel();

		setLayout(new BorderLayout());
		jPanel1.add(label1);
		add("North", jPanel1);

		label2 = new JLabel("Enter Id");
		label3 = new JLabel("Enter Password");
		label4 = new JLabel("Enter RePassword");
		label5 = new JLabel("Enter Name");
		label6 = new JLabel("Enter Age");
		label7 = new JLabel("Select Gender");
		label8 = new JLabel("Select City");
		label9 = new JLabel("Enter Country");

		t1 = new JTextField(12);
		t2 = new JTextField(12);
		t3 = new JTextField(12);
		t4 = new JTextField(12);
		t5 = new JTextField(12);
		t6 = new JTextField(12);

		radioButton1 = new JRadioButton("Male");
		radioButton1.setActionCommand("Male");

		radioButton2 = new JRadioButton("Female");
		radioButton2.setActionCommand("Female");

		buttonGroup = new ButtonGroup();
		buttonGroup.add(radioButton1);
		buttonGroup.add(radioButton2);
		b1 = new JButton("Register");
		b2 = new JButton("Cancel");

		b1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		
		b2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
			  	t1.setText("");
			  	t2.setText("");
			  	t3.setText("");
			  	t4.setText("");
			  	t5.setText("");
			  	city.setSelectedIndex(0);
			  	country.setSelectedIndex(0);
			  	buttonGroup.clearSelection();
			}
		});
		
		jPanel2.setLayout(new GridLayout(9, 2));
		jPanel2.add(label2);
		jPanel2.add(t1);

		jPanel2.add(label3);
		jPanel2.add(t2);

		jPanel2.add(label4);
		jPanel2.add(t3);

		jPanel2.add(label5);
		jPanel2.add(t4);

		jPanel2.add(label6);
		jPanel2.add(t5);

		jPanel2.add(label7);
		JPanel jPanel = new JPanel();
		jPanel.add(radioButton1);
		jPanel.add(radioButton2);

		jPanel2.add(jPanel);

		// jPanel2.add(new JLabel());

		jPanel2.add(label8);
		jPanel2.add(city);

		jPanel2.add(label9);
		jPanel2.add(country);

		jPanel2.add(b1);
		jPanel2.add(b2);

		add("South", jPanel2);

		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		setSize(400, 500);
		setLocation(400, 100);
		pack();
	}
/*
	public static void main(String[] args) {
		new Registration();
	}
	*/
}
