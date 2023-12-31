package oopsdemo;
/*
 * Constructor is a special method with the same name of a class, 
 * which initializes an Object.
 * Same name as the class and no return type.
 * Special Method invoked whenever an instance of a given class is created. 
 */
public class ConstructorDemo {
	
	int id;
	String name;
	
	ConstructorDemo(){    //Implicit constructor--it dones'nt take arguments
		System.out.println("I'm Implicit constructor.");
	}
	
	ConstructorDemo(int id, String name){ //Parametermized constructor-- it takes aurguments
		this.id=id;
		this.name=name;
	}
	
	void display() {
		System.out.println(this.id+" "+this.name);
	}
	
	public static void main(String[] args) {
		ConstructorDemo cd1=new ConstructorDemo();  //invoke implicit constructor
		//constructors are called automatically. when we create the object.
		ConstructorDemo cd2=new ConstructorDemo();
		ConstructorDemo cd3=new ConstructorDemo();
		//it is automatic itialization of an object.
		ConstructorDemo cd4=new ConstructorDemo(101,"Shweta"); //invokes parameterized constructor
		cd4.display();
	}

}
