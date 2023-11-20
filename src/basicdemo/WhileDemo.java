package basicdemo;
/*
 * Program to display ur name 10 times
 */
public class WhileDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=1; // loop initialization
		while(i<=10) {   //set a condition
			System.out.println(i+" -Shweta Rani");
			i=i+1;  //increment loop
		}
		System.out.println("***********Reverse Loop**************");
		int j=10;
		while(j>=1) {
			System.out.println(j+" ");
			j=j-1;
		}
	}

}
