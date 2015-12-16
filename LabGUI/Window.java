import javax.swing.*;
import java.awt.*;
public class Window extends JFrame{
    private Container pane;

    private JButton b;
    private JLabel l;
    private JTextField t;
    private JCheckBox c;

    public Window() {
	this.setTitle("My first GUI");
	this.setSize(600,400);
	this.setLocation(100,100);
	this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	/*
	pane = this.getContentPane();
	pane.setLayout(new FlowLayout());

	b = new JButton("Do Nothing");
	l = new JLabel("This is AWESOME! (lies)",null,JLabel.CENTER);
	t = new JTextField(12);
	c = new JCheckBox("Overclock!!!");
	pane.add(l);
	pane.add(b);
	pane.add(t);
	pane.add(c);*/
    }

    public static double CToF(double t){
	return t*9/5+32;
    }

    public static double FToC(double t){
	return (t-32)*5/9;
    }

    public static void main(String[] args) {

    }
}