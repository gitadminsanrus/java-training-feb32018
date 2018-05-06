import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo {

	public static void main(String[] args) {
		
		//Step 1: Represent or locate an input file
		File inputFile = new File("/Users/santhoshgutta/Desktop/inputFile.txt");
		
		try {
			//Step 2: Create FileReader object
			FileReader fileReader = new FileReader(inputFile);
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			
//			//Step 3: Start reading data
//			int data = fileReader.read();
//			
//			while (data != -1) {
//				
//				//Step 4: Print data on to the console
//				System.out.print((char) data);
//				
//				data = fileReader.read();
//			}
			
			String dataPerLine = bufferedReader.readLine();
			while (dataPerLine != null) {
				System.out.println(dataPerLine);
				
				dataPerLine = bufferedReader.readLine();
			}
			
			//Step 5: Close the connection
			bufferedReader.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
