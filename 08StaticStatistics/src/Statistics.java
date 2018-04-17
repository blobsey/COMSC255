//Assignment #: 8

//Student Name:  Blake Randall

 //Class:  COMSC-255

//Section: 8306


import java.util.*;

public class Statistics {
	
	private double[] data;
	private double[] sdata;
	private int size;
	public static int count = 0;
	
	public Statistics(double[] data, int size) {
		count++;
		this.size = size;
		this.data = new double[size];
		
		System.arraycopy(data, 0, this.data, 0, size);
		
		sdata = new double[size];
		System.arraycopy(data, 0, sdata, 0, size);
		Arrays.sort(sdata);
		
	}
	
	public double[] getOrigData() {
		double[] dataCopy = new double[size];
		System.arraycopy(data, 0, dataCopy, 0, size);
		return dataCopy;
	}
	
	public double[] getSortedData() {
		double[] sdataCopy = new double[size];
		System.arraycopy(sdata, 0, sdataCopy, 0, size);
		return sdataCopy;
	}
	
	public double findMin() {
		return sdata[0];
	}
	
	public double findMax() {
		return sdata[size - 1];
	}
	
	public double findMean() {
		double sum = 0;
		for(double d : data)
			sum += d;
		return sum / size;
	}
	
	public double findMedian() {
		return ((sdata[(size / 2)] + sdata[(size - 1) / 2]) / 2.0);
	}
	
	public static double[] computeSortedData(double[] data) {
		double[] sData = new double[data.length];
		System.arraycopy(data, 0, sData, 0, data.length);
		Arrays.sort(sData);
		return sData;
	}
	
	public static double computeMin(double[] data) {
		double min = data[0];
		for(int i = 0; i < data.length; i++)
			if(data[i] < min)
				min = data[i];
		return min;
			
	}
	
	public static double computeMax(double[] data) {
		double max = data[0];
		for(int i = 0; i < data.length; i++)
			if(data[i] > max)
				max = data[i];
		return max;
	}
	
	public static double computeMean(double[] data) {
		double sum = 0;
		for(int i = 0; i < data.length; i++)
			sum += data[i];
		return(sum / data.length);
	}
	
	public static double computeMedian(double[] data) {
		double[] sData = computeSortedData(data);
		return ((sData[(data.length / 2)] + sData[(data.length - 1) / 2]) / 2.0);
	}
	
}
