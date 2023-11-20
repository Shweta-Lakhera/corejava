package oopsdemo;
// Main class to test Employee1 class methods
public class EmployeeTest {

	public static void main(String[] args) {
		
		// Create objects of Employee1 class
		Employee1 e1=new Employee1();
		Employee1 e2=new Employee1();
		Employee1 e3=new Employee1();
		
		// Invoke methods if Employee1 class
		e1.inputEmployeeDetails();
		e1.calculateNetSalary();
		e1.displayEmployeeDetails();
		
		e2.inputEmployeeDetails();
		e2.calculateNetSalary();
		e2.displayEmployeeDetails();
		
		e3.inputEmployeeDetails();
		e3.calculateNetSalary();
		e3.displayEmployeeDetails();
	}

}
