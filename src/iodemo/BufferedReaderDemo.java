package iodemo;
import java.io.*;
public class BufferedReaderDemo {

	public static void main(String[] args) {
		try {
			BufferedReader br=new BufferedReader(new FileReader("c:/demo/names.txt"));
			String line ="";
			while((line=br.readLine())!=null) {
				System.out.println(line);
			}br.close();
		}
		catch(FileNotFoundException ex) {
			System.out.println("File doesnot exist");
			ex.printStackTrace();
		}
		catch(IOException e) {
			System.out.println("An exception occured while reading the file");
			e.printStackTrace();
		}
	}

}
