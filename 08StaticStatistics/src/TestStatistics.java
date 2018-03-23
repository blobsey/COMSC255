//Assignment #: 8

//Student Name:  Blake Randall

 //Class:  COMSC-255

//Section: 8306


import javax.swing.*;
import java.util.StringTokenizer;
import java.text.DecimalFormat;

public class TestStatistics {
	public static void main(String[] args)
	{
		String input = JOptionPane.showInputDialog(null, "Enter Data <separated by commas>: ");
		StringTokenizer st = new StringTokenizer(input, ",");
		
		int decimalplaces = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter how many decimal places: "));
		String str = "#.";
		for(int i = 0; i < decimalplaces; i++)
			str += "0";
		DecimalFormat df = new DecimalFormat(str);
		
		int numValues = st.countTokens();
		double[] data = new double[numValues];
		
		for(int i = 0; i < numValues; i++)
			data[i] = Double.parseDouble(st.nextToken());
				
		Statistics stats = new Statistics(data, numValues);
		
		double[] statsData = stats.getOrigData(), 
				statsSdata = stats.getSortedData(), 
				statsStaticSdata = Statistics.computeSortedData(data);
		String printData = "" + statsData[0], 
				printSdata = "" + statsSdata[0], 
				printStaticSdata = "" + statsStaticSdata[0];
		for(int i = 1; i < numValues; i++)
		{
			printData += ", " + statsData[i];
			printSdata += ", " + statsSdata[i];
			printStaticSdata += ", " + statsStaticSdata[i];
		}
		
		JOptionPane.showMessageDialog(null, 
				"Original Data:\n" + 
				printData +
				"\n\nResults Using Instance Methods:\n" +
				"\nSorted Data:\n" +
				printSdata +
				"\nMin Value: " + df.format(stats.findMin()) +
				"\nMax Value: " + df.format(stats.findMax()) +
				"\nMean: " + df.format(stats.findMean()) + 
				"\nMedian: " + df.format(stats.findMedian()) +
		
				"\n\nResults Using Static Methods:\n" + 
				"\nSorted Data:\n" +
				printStaticSdata +
				"\nMin Value: " + df.format(Statistics.computeMin(data)) +
				"\nMax Value: " + df.format(Statistics.computeMax(data)) +
				"\nMean: " + df.format(Statistics.computeMean(data)) + 
				"\nMedian: " + df.format(Statistics.computeMedian(data)) + 
				
				"\nThe Total number of Statistics objects\ncreated during execution: " + 
				Statistics.count);

		
	}
}
