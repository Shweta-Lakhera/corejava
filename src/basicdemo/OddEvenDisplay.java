package basicdemo;
//prgm to display odd & even nos between 1 & 10
/*
ODD		EVEN
---		----
1		2
3		4
5		6
7		8
9		10	  
*/	
public class OddEvenDisplay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("ODD\tEven");
		System.out.println("---\t----");
		int i=1;
		while(i<=10) {
			if(i%2==0) {
				System.out.println("\t"+i);
			}else {
				System.out.print(i+"");
			}
			i++;
			
		}
	}

}
