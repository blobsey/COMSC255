//Assignment #: 9

//Student Name:  Blake Randall

 //Class:  COMSC-255

//Section: 8306

public class Student {
	
	private int id;
	private String name;
	private int[] scores;
		
	public Student(int tempID, String tempName, int[] tempGrades) {
		id = tempID;
		name = tempName;
		scores = tempGrades;
	}

	public String findGrade()
	{
		double sum = 0;
		for(int score : scores) 
			sum += score;
		
		sum = sum / (double)scores.length;
		
		if(sum > 90.0)
			return "A";
		if(sum > 80.0)
			return "B";
		if(sum > 70.0)
			return "C";
		if(sum > 60.0)
			return "D";
		return "F";
	}
	
	public int getID() {
		return id;
	}
	
	public String getName() {
		return name;
	}
}
