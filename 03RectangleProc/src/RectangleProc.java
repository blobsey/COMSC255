//Assignment #: 3

//Student Name:  Blake Randall

 //Class:  COMSC-255

//Section: 8306



import javax.swing.*;

public class RectangleProc {

	public static void main(String[] args)
	{
		double length, width;
		
		length = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter length: "));
		width = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter width: "));
		
		JOptionPane.showMessageDialog(null, "Length: " + length +
							"\nWidth: " + width +
							"\nPerimeter: " + computePerimeter(length, width) +
							"\nArea: " + computeArea(length, width));
	}
	
	static double computeArea(double length, double width){
		return length*width;
	}
	
	static double computePerimeter(double length, double width) {
		return length * 2 + width * 2;
	}
}
