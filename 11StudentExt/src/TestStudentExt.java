//Assignment #: 11

//Student Name:  Blake Randall

 //Class:  COMSC-255

//Section: 8306
import javax.swing.*;
import java.util.StringTokenizer;

	public class TestStudentExt {
		public static void main(String[] args) {
			int numStudentExts = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter number of students: "));
			
			int tempID;
			String tempName;
			int[] tempGrades;
			StudentExt[] students = new StudentExt[numStudentExts];
			
			
			for(int i = 0; i < numStudentExts; i++) {
				StringTokenizer st = new StringTokenizer(JOptionPane.showInputDialog(null, "Enter student data: "), ",");
				tempID = Integer.parseInt(st.nextToken());
				tempName = st.nextToken();
				int numScores = Integer.parseInt(st.nextToken());
				tempGrades = new int[numScores];
				for(int j = 0; j < numScores; j++) 
					tempGrades[j] = Integer.parseInt(st.nextToken());
				String gradeType = st.nextToken();
				students[i] = new StudentExt(tempID, tempName, tempGrades, gradeType);
			}
			
			String[] out = {"", "", "", "", "", "", ""};
			
			
			for(int i = 0; i < numStudentExts; i++) {
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
			
			displayResults(out);
			
		}
		
		public static void displayResults(String[] s) {
			String outAll = "";
			for(int i = 0; i < s.length; i++) {
				StringTokenizer st = new StringTokenizer(s[i], ",");
				int j = st.countTokens();
				for(int k = 0; k < j; k++)
					outAll += st.nextToken() + "\n";
				
			}
			
			JOptionPane.showMessageDialog(null, outAll);
			
		}
	}


