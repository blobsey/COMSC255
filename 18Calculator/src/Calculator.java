//Assignment #: 18

//Student Name:  Blake Randall

//Class:  COMSC-255

//Section: 8306

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculator extends JFrame implements ActionListener{
	double num1, num2, result;
	boolean isCleared;
	private JPanel jpMain = new JPanel();
	private JPanel jpNum1 = new JPanel();
	private JPanel jpNum2 = new JPanel();
	private JPanel jpResult = new JPanel();
	private JPanel jpButtons = new JPanel();
	private JLabel jlNum1 = new JLabel("Number 1: ");
	private JLabel jlNum2 = new JLabel("Number 2: ");
	private JLabel jlResult = new JLabel("Result: ");
	private JTextField jtfNum1 = new JTextField(10);
	private JTextField jtfNum2 = new JTextField(10);
	private JTextField jtfResult = new JTextField(10);
	private JButton jbAdd = new JButton("Add");
	private JButton jbSubt = new JButton("Subtract");
	private JButton jbMult = new JButton("Multiply");
	private JButton jbDiv = new JButton("Divide");
	private JButton jbClear = new JButton("Clear");
	
	public Calculator() {
		num1 = 0;
		num2 = 0;
		result = 0;
		isCleared = false;
		
		setTitle("Calculator Application");
		setSize(600, 400);
		setVisible(true);
		
		this.setContentPane(jpMain);
		GridLayout gl = new GridLayout(4, 1);
		this.setLayout(gl);
		
		jpMain.add(jpNum1);
		jpNum1.add(jlNum1);
		jpNum1.add(jtfNum1);
		jpNum1.setBackground(Color.RED);
		
		jpMain.add(jpNum2);
		jpNum2.add(jlNum2);
		jpNum2.add(jtfNum2);
		jpNum2.setBackground(Color.GREEN);
		
		jpMain.add(jpResult);
		jpResult.add(jlResult);
		jpResult.add(jtfResult);
		jpResult.setBackground(Color.MAGENTA);
		
		jpMain.add(jpButtons);
		jpButtons.add(jbAdd);
		jpButtons.add(jbSubt);
		jpButtons.add(jbMult);
		jpButtons.add(jbDiv);
		jpButtons.add(jbClear);
		jpButtons.setBackground(Color.CYAN);
		
		jbAdd.addActionListener(this);
		jbSubt.addActionListener(this);
		jbMult.addActionListener(this);
		jbDiv.addActionListener(this);
		jbClear.addActionListener(this);
		
		
	}
	
	public void actionPerformed(ActionEvent e) {
		
		if(jtfNum1.getText().equals("") || jtfNum2.getText().equals(""))
			isCleared = true;		
		if(isCleared)
			JOptionPane.showMessageDialog(null, "Please enter values first");
		else if(e.getSource() == jbClear)
		{
			jtfNum1.setText("");
			jtfNum2.setText("");
			jtfResult.setText("");
			isCleared = true;
		}
		else
			{
			num1 = Double.parseDouble(jtfNum1.getText());
			num2 = Double.parseDouble(jtfNum2.getText());
			
			if(e.getSource() == jbAdd)
				result = num1 + num2;
			if(e.getSource() == jbSubt)
				result = num1 - num2;
			if(e.getSource() == jbMult)
				result = num1 * num2;
			if(e.getSource() == jbDiv) {
				if(num2 == 0)
					JOptionPane.showMessageDialog(null, "Error cannot divide by 0");
				else
					result = num1 / num2;
			}
			jtfResult.setText(Double.toString(result));
			
		}

	}
	
}
