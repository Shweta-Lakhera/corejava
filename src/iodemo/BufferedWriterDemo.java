package iodemo;
import java.io.*;
public class BufferedWriterDemo {

	public static void main(String[] args) {
		try {
			//Create writer object in append mode-TRUE
			FileWriter writer=new FileWriter("c:/demo/names.txt",true);
			//improves efficiency while writing data to file
			BufferedWriter bwr=new BufferedWriter(writer);
			bwr.write("\nShweta");
			bwr.write("\nJungkook");
			bwr.write("\nJimin");
			System.out.println("Data written succesfully");
			bwr.close();
		}catch(IOException ex) {
			ex.printStackTrace();
		}

	}

}
