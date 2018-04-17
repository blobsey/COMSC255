//Assignment #: 14

//Student Name:  Blake Randall

 //Class:  COMSC-255

//Section: 8306

import javax.swing.*;

public class Rectangle implements Status{
	private double length, width;
	
	public Rectangle(double length, double width){
		this.length = length;
		this.width = width;
	}
	public double computeArea(){
		return length*width;
	}
	
	public double computePerimeter() {
		return length * 2 + width * 2;
	}
	
	public double getLength() {
		return length;
	}
	
	public double getWidth() {
		return width;
	}
	
	public String getStatus() {
		return ("Rectangle" + '\n' + "Length=" + length + ", Width=" + width + '\n');
	}
	
	public void displayStatus() {
		JOptionPane.showMessageDialog(null, getStatus());
	}
	
	
}
