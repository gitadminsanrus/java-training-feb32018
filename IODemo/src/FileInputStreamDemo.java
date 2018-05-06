import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamDemo {

	public static void main(String[] args) {
		
		//Step 1: Locate the file or represent a new file.
		File inputFile = new File("/Users/santhoshgutta/Desktop/inputFile.txt");
		
		//Step 2: Create a file input stream object (open the connection)
		try {
			FileInputStream fileInputStream = new FileInputStream(inputFile);
			
			//Step 3: Start reading the bytes
			int data = fileInputStream.read();
			
			while(data != -1) {
				
				//Step 4: print the data on to a console
				System.out.print((char) data);
				
				data = fileInputStream.read();
			}
			
			//Step 5: Close input stream connection
			fileInputStream.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
