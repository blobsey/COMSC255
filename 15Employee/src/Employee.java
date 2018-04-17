//Assignment #: 15

//Student Name:  Blake Randall

//Class:  COMSC-255

//Section: 8306

public abstract class Employee {
	String name;
	double salary;
	
	public Employee(String name, double salary) {
		this.name = name;
		this.salary = salary;
	}
	
	public String getName() {
		return name;
	}
	
	public double getSalary() {
		return salary;
	}
	
	public abstract double computeBonus();
}
