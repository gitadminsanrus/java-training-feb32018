import java.io.File;

public class CreateDirectoriesDemo {

	public static void main(String[] args) {
		
		File desktopFolder = new File("/Users/santhoshgutta/Desktop/a/b/c/d/f/g/h");
		File temp1Folder = new File(desktopFolder, "temp1Folder");
		temp1Folder.mkdirs();

	}

}
