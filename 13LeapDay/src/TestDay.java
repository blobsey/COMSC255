//Assignment #: 13

//Student Name:  Blake Randall

 //Class:  COMSC-255

//Section: 8306

import javax.swing.*;

public class TestDay {
	
	public static void main(String[] args)
	{
		int day = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter day: " ));
		int month = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter month: " ));
		
		Day currentDay = new Day(day, month);
		JOptionPane.showMessageDialog(null, "Day number for: " + month + "/" + day + ": " + currentDay.findDayNum());
	}
}
