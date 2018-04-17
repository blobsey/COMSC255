//Assignment #: 12

//Student Name:  Blake Randall

 //Class:  COMSC-255

//Section: 8306

public class StudentExt extends Student{
	String gradeType;
	
	public StudentExt(int tempID, String tempName, int[] tempGrades, String gradeType) {
		super(tempID, tempName, tempGrades);
		this.gradeType = gradeType;
	}
	
	public String findGrade() {
		String letterGrade = super.findGrade();
		if(gradeType.equalsIgnoreCase("credit"))
		{
			if(letterGrade.equalsIgnoreCase("A") || 
				letterGrade.equalsIgnoreCase("B") || 
				letterGrade.equalsIgnoreCase("C"))
					return "CR";
			else
					return "NCR";
		}
		else
			return letterGrade;
		
	}
}
