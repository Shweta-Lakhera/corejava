package basicdemo;

import java.util.Scanner;
/*
 * Java program to find the area of a circle
 */
public class Area {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		float a,r;  //Variable declaration
		final float PI=3.14f;  // constant declaration. constant names should be uppercase
		
		System.out.println("Enter radius of a circle: ");
		r=s.nextFloat();
		
		a=PI*r*r;
		System.out.println("The area of a cricle is: "+a);
		System.out.print("The area of a circle is: ");
		System.out.format("%.2f",a);
		s.close();
		
	}

}
