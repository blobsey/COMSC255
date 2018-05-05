//Assignment #: 3

//Student Name:  Blake Randall

 //Class:  COMSC-255

//Section: 8306




public class Rectangle {
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
	
}
