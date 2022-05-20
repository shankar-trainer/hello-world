package test;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class RadioButtonTest extends JFrame {
	JButton b1;
	JRadioButton radio1, radio2;
	ButtonGroup group;
	public RadioButtonTest() {
		b1 = new JButton("select");
		JPanel radioPanel = new JPanel();
		// Create a FlowLayout JPanel with 5 pixel horizontal gaps
		// and no vertical gaps
		radioPanel.setLayout(new FlowLayout(FlowLayout.LEFT, 5, 0));

		 group= new ButtonGroup();

		radio1 = new JRadioButton("Male");
		radio1.setSelected(true);
		radio1.setActionCommand("Male");
		group.add(radio1);

		radio2 = new JRadioButton("Female");
		radio2.setActionCommand("Female");
		group.add(radio2);

		radioPanel.add(radio1);
		radioPanel.add(radio2);
		radioPanel.add(b1);

		add(radioPanel);

		setSize(200, 300);
		setVisible(true);
		b1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				//System.out.println(e.getActionCommand());
				//System.out.println(e.getSource() == radio1);
				System.out.println(group.getSelection().getActionCommand());
				// JOptionPane.showMessageDialog(null);
			}
		});
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new RadioButtonTest();
	}
}