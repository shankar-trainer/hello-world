package test;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

public class GetSelectedJRadioButtonFromButtonGroup extends JFrame implements
		ActionListener {

	private static final long serialVersionUID = 1L;

	private JRadioButton java;
	private JRadioButton c;
	private JRadioButton net;
	private JButton button;
	private ButtonGroup buttonGroup;

	public GetSelectedJRadioButtonFromButtonGroup() {

		// set flow layout for the frame
		this.getContentPane().setLayout(new FlowLayout());

		java = new JRadioButton("Java");
		java.setActionCommand("Java");

		c = new JRadioButton("C/C++");
		c.setActionCommand("c");

		net = new JRadioButton(".NET");
		net.setActionCommand("net");

		java.setSelected(true);

		button = new JButton("Check");

		button.addActionListener(this);

		buttonGroup = new ButtonGroup();

		// add radio buttons
		buttonGroup.add(java);
		buttonGroup.add(c);
		buttonGroup.add(net);

		add(java);
		add(c);
		add(net);
		add(button);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand().equals("Check")) {
			System.out.println("Selected Radio Button: "
					+ buttonGroup.getSelection().getActionCommand());
		}
	}

	private static void createAndShowGUI() {

		// Create and set up the window.

		JFrame frame = new GetSelectedJRadioButtonFromButtonGroup();

		// Display the window.

		frame.pack();

		frame.setVisible(true);

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	public static void main(String[] args) {

		// Schedule a job for the event-dispatching thread:

		// creating and showing this application's GUI.

		javax.swing.SwingUtilities.invokeLater(new Runnable() {

			public void run() {

				createAndShowGUI();

			}

		});
	}

}
