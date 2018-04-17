//Assignment #: 15

//Student Name:  Blake Randall

//Class:  COMSC-255

//Section: 8306


public class Worker extends Employee{
	double pctBonus;
	
	public Worker(String name, double salary, double pctBonus) {
		super(name, salary);
		this.pctBonus = pctBonus;
	}
	
	public double computeBonus() {
		return salary * pctBonus;
	}
	
	public double getPctBonus() {
		return pctBonus;
	}
}
