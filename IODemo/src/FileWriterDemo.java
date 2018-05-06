import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {

	public static void main(String[] args) {
		
		//Step 1: Represent or locate an output file
		File outputFile = new File("/Users/santhoshgutta/Desktop/outputFile.txt");
		
		try {
			//Step 2: Create an output stream connection object
			FileWriter fileWriter = new FileWriter(outputFile, true);
			BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
			
			//Step 3: Prepare data to output
			String tempData = "File Writer Demo\n\n";
			
			//Step 4: Output the data to a file using fileOutputStream object
//			char[] allCharacters = tempData.toCharArray();
			//fileWriter.write(allCharacters);
			bufferedWriter.write(tempData);
			
			//Step 5: Flush and Close the output stream
//			fileWriter.flush();//flushes any cached/buffered data to a sink, in this case a file
//			fileWriter.close();//closes the connection
			
			bufferedWriter.flush();
			bufferedWriter.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		

	}

}
