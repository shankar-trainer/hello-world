package test;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class OpeningWindow extends JFrame implements ActionListener {
	JButton btn = new JButton("Continue");

	public OpeningWindow() {
		setTitle("Opening Window");
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setLocation(200, 100);
		setSize(200, 100);
		Container frame = getContentPane();
		JPanel jp = new JPanel();
		btn.addActionListener(this);
		JLabel lbl = new JLabel("I am the opening window");
		jp.add(lbl, BorderLayout.NORTH);
		jp.add(btn, BorderLayout.SOUTH);
		frame.add(jp);
	}

	public void actionPerformed(ActionEvent ae) {
		new MainWindow().setVisible(true);
		this.dispose();
	}

	public static void main(String[] args) {
		new OpeningWindow().setVisible(true);
	}
}

class MainWindow extends JFrame {
	public MainWindow() {
		setTitle("Main Window");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocation(400, 100);
		setSize(600, 400);
		Container frame = getContentPane();
		JPanel jp = new JPanel();
		JLabel lbl = new JLabel("I am the main window");
		jp.add(lbl);
		frame.add(jp);
	}
}