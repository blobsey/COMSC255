//Assignment #: 15

//Student Name:  Blake Randall

//Class:  COMSC-255

//Section: 8306

public class Executive extends Employee {
	double pctBonus;
	double travelExpense;
	double optionsCount;
	
	public Executive(String name, double salary, double pctBonus, double travelExpense, double optionsCount) {
		super(name, salary);
		this.pctBonus = pctBonus;
		this.travelExpense = travelExpense;
		this.optionsCount = optionsCount;
	}
	
	public double computeBonus() {
		return (salary * pctBonus) + 1000.00;
	}
	
	public double getPctBonus() {
		return pctBonus;
	}
	
	public double getTravelExpense() {
		return travelExpense;
	}
	
	public double getOptionsCount() {
		return optionsCount;
	}
}
