package iodemo;
import java.io.*;
public class ReaderExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Reader reader=new FileReader("c:/demo/data.txt");
			int data = reader.read();  // reads unicode value of character
			while (data!=-1) {   //-1 when stream ends
				System.out.print((char) data);
				data=reader.read();
			}
			reader.close();
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
	}

}
