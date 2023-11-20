package exceptiondemo;

public class ThrowsDemo {

	private int num1,num2,result;
	ThrowsDemo(int num1,int num2){
		this.num1=num1;
		this.num2=num2;
	}
	public void Division() throws ArithmeticException {
		result=num1/num2;
		System.out.println("The division is: "+result);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThrowsDemo t1=new ThrowsDemo(200,100);
		ThrowsDemo t2=new ThrowsDemo(200,0);
		try {
			t1.Division();
			t2.Division();
		}
		catch(ArithmeticException e){
			System.out.println(e.toString());
		}
	}

}
