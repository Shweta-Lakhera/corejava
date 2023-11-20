package oopsdemo2;

// Child class - Single Inheritance- is a relationship
public class Developer extends Employee {
	
	private String technology;
	
	public Developer(int empId, String name,String technology) {
		super(empId, name); //invokes base class constructor
		this.technology=technology;
	}
	void print() {
		System.out.println("Tech stack: "+technology);
	}
	
	
	
}
