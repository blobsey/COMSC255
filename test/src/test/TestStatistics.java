//Assignment #: 6

//Student Name:  Blake Randall

 //Class:  COMSC-255

//Section: 8306


package test;
import javax.swing.*;

public class TestStatistics {
	public static void main(String[] args)
	{
		int numValues;
		double[] data;
		numValues = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the Number of Data Values: "));
		data = new double[numValues];
		
		for(int i = 1; i <= numValues; i++)
			data[i - 1] = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter Data Value " + i + ": "));
			
		Statistics stats = new Statistics(data, numValues);
		double[] statsData = stats.getOrigData(), statsSdata = stats.getSortedData();
		String printData = "" + statsData[0], printSdata = "" + statsSdata[0];
		for(int i = 1; i < numValues; i++)
		{
			printData += ", " + statsData[i];
			printSdata += ", " + statsSdata[i];
		}
		
		JOptionPane.showMessageDialog(null, "Original Data:\n" + 
											printData +
											"\nSorted Data:\n" +
											printSdata +
											"\nMin Value: " + stats.findMin() +
											"\nMax Value: " + stats.findMax() +
											"\nMean: " + stats.findMean() + 
											"\nMedian: " + stats.findMedian());
	}
}
