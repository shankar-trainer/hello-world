package com.abc.main;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Hello1 extends JFrame {
Image image;
Image img;

	public Hello1() {
		ImageIcon ii=new ImageIcon("tomcat.gif");
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		add(new JLabel(ii));
		setVisible(true);
	}

	public static void main(String[] args) {
		new Hello1();
	}
}
