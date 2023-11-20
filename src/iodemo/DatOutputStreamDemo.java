package iodemo;
import java.io.*;
//DatOutputStreamDemo clsss allows to write primitive data types
public class DatOutputStreamDemo {

	public static void main(String[] args) {
		try {
			FileOutputStream fos=new FileOutputStream("c:/demo/file.txt");
			DataOutputStream dout=new DataOutputStream(fos);
			dout.writeDouble(2000.45);
			dout.writeInt(55);
			dout.writeBoolean(true);
			dout.writeChar('D');
			System.out.println("Binary data written successfully");
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
		try {
			FileInputStream fis=new FileInputStream("c:/demo/file.txt");
			DataInputStream din=new DataInputStream(fis);
			double a=din.readDouble();
			int b=din.readInt();
			boolean c=din.readBoolean();
			char d=din.readChar();
			System.out.println("Values: "+a+" "+b+" "+c+" "+d);
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
	}

}
