//Assignment #: 2

//Student Name:  Blake Randall

 //Class:  COMSC-255

//Section: 8306

package test;

import javax.swing.*;

public class Average {

	public static void main(String args[])
	{
		double[] nums = new double[3];
		double sum = 0;
		for(int i = 1; i < 4; i++)
			nums[i - 1] = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter number "  + i + ": ")); 
		
		for(int i = 0; i < 3; i++)
			sum += nums[i];
		
		JOptionPane.showMessageDialog(null, "Sum: " + sum + "\nAvg: " + sum/3.0);
	}
}
