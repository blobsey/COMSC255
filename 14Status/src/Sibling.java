//Assignment #: 14

//Student Name:  Blake Randall

 //Class:  COMSC-255

//Section: 8306


import javax.swing.*;

public class Sibling implements Status {
	private String name;
	private int age;
	private double weight;
	
	public Sibling(String name, int age, double weight) {
		this.name = name;
		this.age = age;
		this.weight = weight;
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public double getWeight() {
		return weight;
		
	}
	
	public String getStatus() {
		return ("Sibling" + "\nName=" + name + ", Age=" + age + ", Weight=" + weight + '\n');
	}
	
	public void displayStatus() {
		JOptionPane.showMessageDialog(null, getStatus());	
	}
}
