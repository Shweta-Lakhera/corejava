package basicdemo;

import java.util.Scanner;

/*
 * Program to find greatest of 2 number
 */
public class Greatest2 {

	public static void main(String[] args) {
		int a,b;
		Scanner scan=new Scanner(System.in);
		
				
		System.out.println("Enter 2 Numbers :");
		a=scan.nextInt();
		b=scan.nextInt();
		
		scan.close();
		
		if(a>b) {
			System.out.println(a+" is greatest.");
		}
		else {
			System.out.println(b+" is greatest.");
		}

	}

}
