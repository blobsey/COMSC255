//Assignment #: 13

//Student Name:  Blake Randall

 //Class:  COMSC-255

//Section: 8306


public class Day {
	private int day;
	protected int month;
	private int dayCounts[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	
	public Day(int day, int month) {
		this.day = day;
		this.month = month;
	}
	
	public int getDay() {
		return day;
	}
	
	public int getMonth() {
		return month;
	}
	
	public int findDayNum(){
		int sum = 0;
		for(int i = 0; i < month - 1; i++)
			sum += dayCounts[i];
		sum += day;
		return sum;
	}
}
