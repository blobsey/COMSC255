//Assignment #: 4

//Student Name:  Blake Randall

 //Class:  COMSC-255

//Section: 8306



import javax.swing.*;

public class TestRectangle {
	public static void main(String[] args) {
		double length1, length2, width1, width2;
		length1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter length1: "));
		width1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter width1: "));
		
		length2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter length2: "));
		width2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter width2: "));
		Rectangle rec1 = new Rectangle(length1, width1);
		Rectangle rec2 = new Rectangle(length2, width2);
		
		JOptionPane.showMessageDialog(null, 
		"Values for the first object:" + 
        "\nLength: " + rec1.getLength() + 
        "\nWidth: " + rec1.getWidth() +
        "\nPerimeter: " + rec1.computePerimeter() +
        "\nArea: " + rec1.computeArea());
		
		
		JOptionPane.showMessageDialog(null, 
		"Values for the second object:" + 
        "\nLength: " + rec2.getLength() + 
        "\nWidth: " + rec2.getWidth() +
        "\nPerimeter: " + rec2.computePerimeter() +
        "\nArea: " + rec2.computeArea());
	}
}
