import java.io.File;
import java.io.FileFilter;

public class PicturesFileFilter implements FileFilter {

	@Override
	public boolean accept(File file) {
		String name = file.getName();
		return name.endsWith("jpeg") 
				|| name.endsWith("jpg") 
				|| name.endsWith("png") 
				|| name.endsWith("gif")
				|| name.endsWith("tiff")
				|| name.endsWith("svg");
	}

}
