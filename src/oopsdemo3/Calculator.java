package oopsdemo3;

import java.util.Scanner;

//Interface demonstration
public class Calculator implements IMath {

	Scanner s=new Scanner(System.in);
	@Override
	public void add() {
		s = new Scanner(System.in);
        System.out.println("Enter any two integer values to perform addition");
        int a=s.nextInt();
        int b=s.nextInt();
        int su=a+b;
        System.out.println("Sum of "+a+" and "+b+" is "+su);
		
	}

	@Override
	public void sub() {
		s = new Scanner(System.in);
        System.out.println("Enter any two integer values to perform subration");
        int a=s.nextInt();
        int b=s.nextInt();
        int su=a-b;
        System.out.println("Subtration of "+a+" and "+b+" is "+su);
		
	}

	@Override
	public void mul() {
		s = new Scanner(System.in);
        System.out.println("Enter any two integer values to perform multiplication");
        int a=s.nextInt();
        int b=s.nextInt();
        int su=a*b;
        System.out.println("Multiplication of "+a+" and "+b+" is "+su);
		
	}

	@Override
	public void div() {
		s = new Scanner(System.in);
        System.out.println("Enter any two integer values to perform division");
        int a=s.nextInt();
        int b=s.nextInt();
        int su=a/b;
        System.out.println("Division of "+a+" and "+b+" is "+su);		
	}
	public static void main(String[] args) {
		Calculator c1=new Calculator();
		System.out.println("****************Calculator Interface*******************");
		
		c1.add();
		c1.sub();
		c1.mul();
		c1.div();
	}
}
