//Assignment #: 17

//Student Name:  Blake Randall

//Class:  COMSC-255

//Section: 8306
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.text.DecimalFormat;

public class JFrameExt extends JFrame implements ActionListener{
	private JTextField fahrIO = new JTextField(10);
	private JTextField celsIO = new JTextField(10);
	private JButton ftoc = new JButton("FtoC");
	private JButton ctof = new JButton("CtoF");
	private JPanel jpMain = new JPanel();
	private JPanel jpFrom = new JPanel();
	private JPanel jpTo = new JPanel();
	private JPanel jpOp = new JPanel();
	private JLabel jlbFrom = new JLabel("From");
	private JLabel jlbTo = new JLabel("To");
	private double fahrenheit;
	private double celsius;
	private DecimalFormat df = new DecimalFormat("#.00");
	
	
	public JFrameExt() {
		fahrenheit = 0.0;
		celsius = 0.0;
		
		setTitle("Converter");
		setSize(400, 200);
		setVisible(true);
		
		this.setContentPane(jpMain);
		
		GridLayout gl = new GridLayout(3, 1);
		
		jpMain.add(jpFrom);
		jpFrom.setBackground(Color.RED);
		jpFrom.add(jlbFrom);
		jpFrom.add(fahrIO);

		jpMain.add(jpTo);
		jpTo.setBackground(Color.GREEN);
		jpTo.add(jlbTo);
		jpTo.add(celsIO);
		
		jpMain.add(jpOp);
		jpOp.setBackground(Color.MAGENTA);
		jpOp.add(ftoc);
		jpOp.add(ctof);
		
		
		ftoc.addActionListener(this);
		ctof.addActionListener(this);
		
		this.setLayout(gl);
	}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == ftoc)
		{
			fahrenheit = Double.parseDouble(fahrIO.getText());
			celsius = (fahrenheit - 32.0) * 5.0/9.0;
			celsIO.setText(df.format(celsius));
		}
		else if(e.getSource() == ctof)
		{
			celsius = Double.parseDouble(celsIO.getText());
			fahrenheit = (celsius * 9.0/5.0) + 32;
			fahrIO.setText(df.format(fahrenheit));
		}
	}
}
