package iodemo;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
/*
 * Character streams-Read/write textual data 
 * using reader/writer classes of java.io package
 */
public class WriterExample {

	public static void main(String[] args) {
		String content="She sells sea shells in the sea";
		try {
			Writer w=new FileWriter("c:/demo/data.txt");
			w.write(content);
			System.out.println("Data written to file");
			w.close();
		}
		catch(IOException e) {
			System.out.println("Error ");
			e.printStackTrace();
		}
		
	}

}
