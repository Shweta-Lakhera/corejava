package oopsdemo;

public class TraineeTest {

	public static void main(String[] args) {
		// Invokes parameterized constructor
		Trainee t1=new Trainee(1090,"Shweta Rani","Java",7000);
		t1.display();
		// Invokes parameterized constructor
		Trainee t2=new Trainee(1091,"Park Jimin","Hibernate",8000);
		t2.display();
		
		// Invokes implicit constructor
		Trainee t3=new Trainee();
		t3.display();
		
	}

}
