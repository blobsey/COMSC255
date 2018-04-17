//Assignment #: 5

//Student Name:  Blake Randall

 //Class:  COMSC-255

//Section: 8306


package test;

import javax.swing.JOptionPane;

public class TestSibling {
	public static void main(String[] args)
	{
		Sibling sib1 = new Sibling("Jack", 21, 130.0);
		Sibling sib2 = new Sibling("Judy", 24, 118.0);
		Sibling sib3 = new Sibling("John", 26, 145.0);
		
		Sibling youngest, lightest;
		
		if(sib1.getAge() < sib2.getAge())
			youngest = sib1;
		else
			youngest = sib2;
		
		if(sib3.getAge() < youngest.getAge())
			youngest = sib3;
			

		if(sib1.getWeight() < sib2.getWeight())
			lightest = sib1;
		else
			lightest = sib2;
		
		if(sib3.getWeight() < lightest.getWeight())
			lightest = sib3;
			
		JOptionPane.showMessageDialog(null,
				"Sibling1:"
				+ "\nName: " + sib1.getName()
				+ "\nAge: " + sib1.getAge()
				+ "\nWeight: " + sib1.getWeight()
				+"\n\nSibling2:"
				+ "\nName: " + sib2.getName()
				+ "\nAge: " + sib2.getAge()
				+ "\nWeight: " + sib2.getWeight()
				+"\n\nSibling3:"
				+ "\nName: " + sib3.getName()
				+ "\nAge: " + sib3.getAge()
				+ "\nWeight: " + sib3.getWeight()
				+ "\n----------------------"
				+ "\nLightest sibling: " + lightest.getName() + " " + lightest.getAge() + " " + lightest.getWeight()
				+ "\nYoungest sibling: " + youngest.getName() + " " + youngest.getAge() + " " + youngest.getWeight());
				
	}
}
