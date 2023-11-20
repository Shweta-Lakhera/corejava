package oopsdemo3;

public abstract class Employee {
	private String name;
	protected double basic;
	private String address;
	
	public Employee(String name, double basic, String address) {
		super();
		this.name = name;
		this.basic = basic;
		this.address = address;
	}
	void show() {
        System.out.println("Name: \t\t\t" + name);
        System.out.println("Address: \t\t" + address);
        System.out.println("Basic: \t\t\t" + basic);
    }
	
	double deduction(int leave) {
		double lessPay;

		if(leave==0)
		{
			lessPay=0;
		}
		else if (leave <= 5) {
			lessPay = (0.25 * basic);
		} 
		
		else {
			lessPay = (0.5 * basic);
		}
		return lessPay;
	}
//	Abstract method - Method without implementation. 
//	Has to be implemented by derived class
	abstract double totalPay();
	
	
}
