import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo {

	public static void main(String[] args) {
		
		//Step 1: Represent or locate an output file
		File outputFile = new File("/Users/santhoshgutta/Desktop/outputFile.txt");
		
		try {
			//Step 2: Create an output stream connection object
			FileOutputStream fileOutputStream = new FileOutputStream(outputFile, true);
			
			//Step 3: Prepare data to output
			String tempData = "ksadjhf askljdhf kjlashdf lasdhf kaslhf asd\n\n";
			
			//Step 4: Output the data to a file using fileOutputStream object
			byte[] allOutputBytes = tempData.getBytes();
			fileOutputStream.write(allOutputBytes);
			
			//Step 5: Flush and Close the output stream
			fileOutputStream.flush();//flushes any cached/buffered data to a sink, in this case a file
			fileOutputStream.close();//closes the connection
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
