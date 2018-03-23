//Assignment #: 14

//Student Name:  Blake Randall

 //Class:  COMSC-255

//Section: 8306

import javax.swing.*;

public class TestStatus {
	public static void main(String[] args) {
		Status[] objects = new Status[6];
		objects[0] = new Rectangle(3, 2);
		objects[1] = new Rectangle(6, 4);
		objects[2] = new Rectangle(30, 20);
		objects[3] = new Sibling("Jack", 21, 130);
		objects[4] = new Sibling("Judy", 24, 118);
		int[] tempGrades = {93, 91, 100};
		objects[5] = new Student(1, "John Adam", tempGrades);
		
		String out = "";
		for(Status o : objects)
			out += o.getStatus() + "\n";
		
		JOptionPane.showMessageDialog(null, out);	
			
		
	}
}
