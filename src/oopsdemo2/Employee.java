package oopsdemo2;

// Base class
public class Employee {
	
	private int empId;
	private String name;
	
	//generate constructor using fields
	public Employee(int empId, String name) {
		
		this.empId = empId;
		this.name = name;
	}
	void display() {
		System.out.println("*************Employee Details****************");
		System.out.println("EmployeeId: "+empId);
		System.out.println("Employee Name: "+name);
	}
	
	
	
	
}
