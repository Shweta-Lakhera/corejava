package oopsdemo2;

public class SingleInheritancedemo {

	public static void main(String[] args) {
		
		Developer d1=new Developer(101,"Shweta Rani","JDBC");
		Developer d2=new Developer(102,"Kiran Rani","Spring FW");
		
		d1.display(); // child class obj invokes parent class method-inheritance
		d1.print();
		
		d2.display();
		d2.print();
	
	}

}
