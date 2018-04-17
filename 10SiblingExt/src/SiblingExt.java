//Assignment #: 9

//Student Name:  Blake Randall

 //Class:  COMSC-255

//Section: 8306

public class SiblingExt extends Sibling
{
	private double height;
	
	public SiblingExt(String name, int age, double weight, double height) {
		super(name, age, weight);
		this.height = height;
	}
	
	public double getHeight() {
		return height;
		
	}

}
