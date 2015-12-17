import javax.swing.*;
import java.awt.*;//NEW STUFF!
import java.awt.event.*;
public class TempConversionWindow extends JFrame implements ActionListener{
    private Container pane;

    private JButton toC;
    private JButton toF;
    private JLabel l;
    private JTextField t;

    public TempConversionWindow() {
	this.setTitle("Temp Converter");
	this.setSize(300,200);
	this.setLocation(100,100);
	this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	
	pane = this.getContentPane();
	//	pane.setLayout(new FlowLayout());
	pane.setLayout(new BoxLayout(pane, BoxLayout.Y_AXIS));

	toC = new JButton("toC");
	toC.addActionListener(this);
	toC.setActionCommand("toC");
	toF = new JButton("toF");
	toF.addActionListener(this);
        toF.setActionCommand("toF");
	l = new JLabel("0.0",null,JLabel.CENTER);
	t = new JTextField(10);
	pane.add(l);
	pane.add(t);
	pane.add(toC);
	pane.add(toF);
    }

    private static double CToF(double t){
	return t*9/5+32;
    }

    private static double FToC(double t){
	return (t-32)*5/9;
    }

    public void actionPerformed(ActionEvent e){
	try{
	    Integer.parseInt(t.getText());
	}catch(NumberFormatException x){
	    l.setText("Enter numbers only!");
	    t.setText("0");
	}
	String event = e.getActionCommand();
	if(t.getText().isEmpty()){
	    l.setText("Enter something!");
	}else if(event.equals("toC")){
	    String s = ""+FToC(Integer.parseInt(t.getText()));
	    l.setText(s);
	}else if(event.equals("toF")){
	    String s = ""+CToF(Integer.parseInt(t.getText()));
	    l.setText(s);
	}
    }

    public static void main(String[] args) {

    }
}