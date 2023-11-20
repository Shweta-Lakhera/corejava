package basicdemo;

import java.util.Scanner;

/*
 * Program to find sum and average of 3 numbers
 * using scanner input to take values at runtime
 */
public class SumAverage {

	public static void main(String[] args) {
		
		// Variable declarations
		int a,b,c,sum;
		float avg,marks;
		String name;
		
		Scanner s = new Scanner(System.in);
		
		// Input from user
		System.out.println("Enter your name: ");
		name=s.next();  //for string input
		System.out.println("Enter your marks: ");
		marks=s.nextFloat();  //float input
		
		System.out.println("Enter 3 number: ");
		a=s.nextInt();
		b=s.nextInt();  // integer input
		c=s.nextInt();
		
		//Process
		sum=a+b+c;
		avg=(float)sum/3;  //type casting -converting data type to another
		
		// Output
		System.out.println("The sum of 3 numbers is: "+sum);
		System.out.println("The average of 3 numbers is: "+avg);
		System.out.println("Hello "+name+". You have scored "+marks+" marks." );
		
		s.close();
		
	}

}
