package test;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class AnotherJFrame extends JFrame
{
    public AnotherJFrame()
    {
        super("Another GUI");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        add(new JLabel("Empty JFrame"));
        pack();
        setVisible(true);
    }
}
