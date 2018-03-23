//Assignment #: 12

//Student Name:  Blake Randall

 //Class:  COMSC-255

//Section: 8306

import javax.swing.*;
import java.io.*;
import java.util.StringTokenizer;

public class TestStudentExt{

	public static void main(String[] args) throws Exception{
		String in, outAll, tempName, tempGradeType;
		int numStudents, tempID;
		int[] tempGrades;
		
		BufferedReader br = new BufferedReader(new FileReader("in.txt"));
		PrintWriter pw = new PrintWriter(new FileWriter("out.txt"));
		StringTokenizer st;
		StudentExt[] students;
		
		numStudents = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter number of Students: "));
		students = new StudentExt[numStudents];
		
		for(int i = 0; i < numStudents; i++)
		{
			in = br.readLine();
			st = new StringTokenizer(in, ",");
			tempID = Integer.parseInt(st.nextToken());
			tempName = st.nextToken();
			int numScores = Integer.parseInt(st.nextToken());
			tempGrades = new int[numScores];
			for(int j = 0; j < numScores; j++) 
				tempGrades[j] = Integer.parseInt(st.nextToken());
			tempGradeType = st.nextToken();
			students[i] = new StudentExt(tempID, tempName, tempGrades, tempGradeType);
		}
		
		String[] out = {"", "", "", "", "", "", ""};
		
		
		for(int i = 0; i < numStudents; i++) {
			String currentGrade = students[i].findGrade();
			if(currentGrade.equalsIgnoreCase("A"))
				out[0] += students[i].getID() + " " + students[i].getName() + " (" + currentGrade + "),";
			else if(currentGrade.equalsIgnoreCase("B"))
				out[1] += students[i].getID() + " " + students[i].getName() + " (" + currentGrade + "),";
			else if(currentGrade.equalsIgnoreCase("C"))
				out[2] += students[i].getID() + " " + students[i].getName() + " (" + currentGrade + "),";
			else if(currentGrade.equalsIgnoreCase("D"))
				out[3] += students[i].getID() + " " + students[i].getName() + " (" + currentGrade + "),";
			else if(currentGrade.equalsIgnoreCase("F"))
				out[4] += students[i].getID() + " " + students[i].getName() + " (" + currentGrade + "),";
			else if(currentGrade.equalsIgnoreCase("CR"))
				out[5] += students[i].getID() + " " + students[i].getName() + " (" + currentGrade + "),";
			else
				out[6] += students[i].getID() + " " + students[i].getName() + " (" + currentGrade + "),";

		}
		
		outAll = "";
		for(int i = 0; i < out.length; i++) {
			st = new StringTokenizer(out[i], ",");
			int j = st.countTokens();
			for(int k = 0; k < j; k++)
				outAll += st.nextToken() + "\n";
			
		}
		
		pw.print(outAll);
		
		br.close();
		pw.close();
	}
}