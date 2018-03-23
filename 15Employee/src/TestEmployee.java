//Assignment #: 15

//Student Name:  Blake Randall

//Class:  COMSC-255

//Section: 8306

import javax.swing.*;
import java.util.StringTokenizer;
import java.text.DecimalFormat;

public class TestEmployee {
	public static void main(String[] args) {
		int[] workerNumbers = new int[3]; //numWorkers, numManagers, numExecutives
		String[] workerTypes = {"Worker", "Manager", "Executive"};
		Employee[] employees;
		StringTokenizer st;
		
		
		String inputBuffer, nameBuf;
		double salaryBuf, pctBonusBuf, travelExpenseBuf;
		int optionsCountBuf;
		int employeeNumber = 0;
		
		for(int i = 0; i < 3; i++)
			workerNumbers[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter Number of " + workerTypes[i] + "s:"));
		
		employees = new Employee[workerNumbers[0] + workerNumbers[1] + workerNumbers[2]];
		
		for(int i = 0; i < 3; i++)
			for(int j = 0; j < workerNumbers[i]; j++) 
			{
				inputBuffer = JOptionPane.showInputDialog(null, "Enter " + workerTypes[i] + " data: ");
				st = new StringTokenizer(inputBuffer, ",");
				nameBuf = st.nextToken();
				salaryBuf = Double.parseDouble(st.nextToken());
				pctBonusBuf = Double.parseDouble(st.nextToken());
				if(i == 0)
					employees[employeeNumber] = new Worker(nameBuf, salaryBuf, pctBonusBuf);
				else
				{
					travelExpenseBuf = Double.parseDouble(st.nextToken());
					if(i == 1)
						employees[employeeNumber] = new Manager(nameBuf, salaryBuf, pctBonusBuf, travelExpenseBuf);
					else
					{
						optionsCountBuf = Integer.parseInt(st.nextToken());
						employees[employeeNumber] = new Executive(nameBuf, salaryBuf, pctBonusBuf, travelExpenseBuf, optionsCountBuf);

					}
				}	
				employeeNumber++;
			}
		
		String outAll = "";
		for(int i = 0; i < employees.length; i++)
			outAll += printEmployee(employees[i]) + "\n\n";
		
		JOptionPane.showMessageDialog(null, outAll);
		
		
	
	}
	
	private static String printEmployee(Employee e) {
		DecimalFormat df = new DecimalFormat("$#.00");
		DecimalFormat pct = new DecimalFormat(".00");
		String output = "Name: " + e.getName() + 
						"\nSalary: " + df.format(e.getSalary());
		
		if(e instanceof Worker) 
			return output + "\nPercentBonus: " + pct.format(((Worker) e).getPctBonus()) + 
							"\nTotal Bonus: " + df.format(e.computeBonus());
		if(e instanceof Manager)
			return output + "\nPercentBonus: " + pct.format(((Manager) e).getPctBonus()) +
							"\nTotal Bonus: " + df.format(e.computeBonus()) + 
							"\nTravelExpense:" + df.format(((Manager) e).getTravelExpense());
		if(e instanceof Executive)
			return output + "\nPercentBonus: " + pct.format(((Executive) e).getPctBonus()) +
							"\nTotal Bonus " + df.format(e.computeBonus()) +
							"\nTravelExpense: " + df.format(((Executive) e).getTravelExpense()) + 
							"\nOptions Count: " + ((Executive) e).getOptionsCount();
		
		return "";
							
	}
}
