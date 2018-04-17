//Assignment #: 15

//Student Name:  Blake Randall

//Class:  COMSC-255

//Section: 8306

public class Manager extends Employee {
	double pctBonus;
	double travelExpense;
	
	public Manager(String name, double salary, double pctBonus, double travelExpense) {
		super(name, salary);
		this.pctBonus = pctBonus;
		this.travelExpense = travelExpense;
	}
	
	public double computeBonus() {
		return (salary * pctBonus) + 500.00;
	}
	
	public double getPctBonus() {
		return pctBonus;
	}
	
	public double getTravelExpense() {
		return travelExpense;
	}
}
