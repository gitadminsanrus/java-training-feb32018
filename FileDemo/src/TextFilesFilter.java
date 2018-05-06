import java.io.File;
import java.io.FileFilter;

public class TextFilesFilter implements FileFilter {

	@Override
	public boolean accept(File file) {
		return file.getName().endsWith("txt");
	}
	
	

}
