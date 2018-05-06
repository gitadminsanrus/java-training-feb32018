import java.io.File;

public class ListFilesDemo {

	public static void main(String[] args) {
		
		File downloadsFolder = new File("/Users/santhoshgutta/Downloads");
		File[] allFilesAndFoldersUnderDownloads = downloadsFolder.listFiles();
		
		for (int index = 0; index < allFilesAndFoldersUnderDownloads.length; index++) {
			File eachFileOrFolder = allFilesAndFoldersUnderDownloads[index];
			
			String name = eachFileOrFolder.getName();
			boolean isDirectory = eachFileOrFolder.isDirectory();
			long fileLength = eachFileOrFolder.length();
			long lastModifiedDate = eachFileOrFolder.lastModified();
			
			System.out.println(name + "\t" 
								+ (isDirectory ? "d" : "f") + "\t"
								+ (fileLength / (1024.0 * 1024)) + "MB" + "\t"
								+ lastModifiedDate);
		}

	}

}
