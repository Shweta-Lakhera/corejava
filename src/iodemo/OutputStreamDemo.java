package iodemo;
import java.io.*;
//Read/write byte streams - inputStream
public class OutputStreamDemo {

	public static void main(String[] args) {
		try {
			FileOutputStream fos=new FileOutputStream("c:/demo/data1.txt");
			String text="Its a sunny day";
			byte[] myBytes=text.getBytes();
			fos.write(myBytes);
			System.out.println("Data written to binary file");
		}
		catch(Exception e) {
			e.printStackTrace();
		}

	}

}
