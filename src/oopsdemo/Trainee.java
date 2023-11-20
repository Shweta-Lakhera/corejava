package oopsdemo;

public class Trainee {
	
	// Attributes
	private int id;
	private String name,tech;
	private double stipend;
	
	//Constructors
	public Trainee() {   // Implicit constructor
		this.id=555;
		this.name="Rod Jhonson";
		this.tech="Spring";
		this.stipend=8600;
		
	}
	// Parameterized Constructor
	public Trainee(int id, String name, String tech, double stipend) {
		this.id = id;
		this.name = name;
		this.tech = tech;
		this.stipend = stipend;
	}
	void display() {
		System.out.println(this.id+" "+this.name+" "+this.tech+" "+this.stipend);
	}
	
	
	
	
	
}
