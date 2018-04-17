//Assignment #: 10

//Student Name:  Blake Randall

 //Class:  COMSC-255

//Section: 8306

import javax.swing.JOptionPane;

public class TestSiblingExt {
	public static void main(String[] args)
	{
		SiblingExt sib1 = new SiblingExt("Jack", 21, 130.0, 69.0);
		SiblingExt sib2 = new SiblingExt("Judy", 24, 118.0, 63.0);
		SiblingExt sib3 = new SiblingExt("John", 26, 145.0, 70.0);
		
		SiblingExt youngest, lightest, tallest;
		
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
		

		if(sib1.getHeight() < sib2.getHeight())
			tallest = sib1;
		else
			tallest = sib2;
		
		if(sib3.getHeight() < tallest.getHeight())
			tallest = sib3;
			
		JOptionPane.showMessageDialog(null,
				"Sibling1:"
				+ "\nName: " + sib1.getName()
				+ "\nAge: " + sib1.getAge()
				+ "\nWeight: " + sib1.getWeight()
				+ "\nHeight: " + sib1.getHeight()
				+"\n\nSibling2:"
				+ "\nName: " + sib2.getName()
				+ "\nAge: " + sib2.getAge()
				+ "\nWeight: " + sib2.getWeight()
				+ "\nHeight: " + sib2.getHeight()
				+"\n\nSibling3:"
				+ "\nName: " + sib3.getName()
				+ "\nAge: " + sib3.getAge()
				+ "\nWeight: " + sib3.getWeight()
				+ "\nHeight: " + sib3.getHeight()
				+ "\n----------------------"
				+ "\nLightest sibling: " + lightest.getName() + " " + lightest.getAge() + " " + lightest.getWeight() + " " + lightest.getHeight()
				+ "\nYoungest sibling: " + youngest.getName() + " " + youngest.getAge() + " " + youngest.getWeight() + " " + youngest.getHeight()
				+ "\nTallest sibling: " + tallest.getName() + " " + tallest.getAge() + " " + tallest.getWeight() + " " + tallest.getHeight());
				
	}
}
