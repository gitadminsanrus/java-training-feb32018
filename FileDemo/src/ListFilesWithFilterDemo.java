import java.io.File;

public class ListFilesWithFilterDemo {
	
	public static void main(String[] args) {
		
		File contentFolder = new File("/Users/santhoshgutta/Desktop/Content");
//		File[] allPictures = contentFolder.listFiles(new PicturesFileFilter());
		
//		for (int index = 0; index < allPictures.length; index++) {
//			System.out.println(allPictures[index].getAbsolutePath());
//		}
		
		//get only .txt files
		File[] textFiles = contentFolder.listFiles(new TextFilesFilter());
		
		for (int index = 0; index < textFiles.length; index++) {
			System.out.println(textFiles[index].getAbsolutePath());
		}
	}

}
