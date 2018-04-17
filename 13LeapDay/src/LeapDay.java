//Assignment #: 13

//Student Name:  Blake Randall

 //Class:  COMSC-255

//Section: 8306



public class LeapDay extends Day {
	private int year;
	
	public LeapDay(int day, int month, int year)
	{
		super(day, month);
		this.year = year;
		
	}
	
	public int getYear() {
		return year;
	}
	
	public int findDayNum() {
		int num = super.findDayNum();
		if(month > 2 && isLeapYear())
			++num;
		return num;
	}
	
	private boolean isLeapYear() {
		return ( year % 400 == 0 || (year % 4 == 0 && year % 100 != 0));
	}
}
