import java.io.File;
import java.io.IOException;

public class FileDemo {

	public static void main(String[] args) {
		
		File desktopFolder = new File("/Users/santhoshgutta/Desktop");
		boolean isFolderExist = desktopFolder.exists();
		System.out.println("Is desktop folder exist = " + isFolderExist);
		
		
		//creating a file under desktop folder, 
		//in this case 'desktopFolder' is a parent to 'temp1.txt' file.
		File tempFile = new File(desktopFolder, "temp1.txt");
		try {
			boolean isNewFileCreated = tempFile.createNewFile();
			System.out.println("is temp1.txt created? => " + isNewFileCreated);
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("is temp1.txt exist? => " + tempFile.exists());
		
		//Deleting a file
		boolean isTempFileDeleted = tempFile.delete();
		System.out.println("is temp1.txt deleted => " + isTempFileDeleted);

		//creating a file using new File(String parent, String child) constructor
		File temp2File = new File("/Users/santhoshgutta/Desktop", "temp2.txt");
		try {
			boolean isTemp2FileCreated = temp2File.createNewFile();
			System.out.println("is temp2.txt created? => " + isTemp2FileCreated);

		} catch (IOException e) {
			e.printStackTrace();
		}
		
		//File object representing the root node
		File rootNodeFile = new File("/");
		System.out.println("Total space => " + rootNodeFile.getTotalSpace() + " bytes");
		System.out.println("Free space => " + rootNodeFile.getFreeSpace() + " bytes");
		
		//Relative Path
		//in case of Eclipse or other IDE, they create 'temp3.txt' in their project folder
		//in case of consoler based applications such as command prompt or unix terminal, then 
		//they create in the same java file directory.
		File temp3File = new File("temp3.txt");
		try {
			temp3File.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		System.out.println("End of FileDemo.main() method");

	}

}
