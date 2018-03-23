//Assignment #: 6

//Student Name:  Blake Randall

 //Class:  COMSC-255

//Section: 8306


package test;
import java.util.*;

public class Statistics {
	
	private double[] data;
	private double[] sdata;
	private int size;
	
	public Statistics(double[] data, int size) {
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
	
	
	
}
