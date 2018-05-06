import java.io.File;

public class ListAllDrives {

	public static void main(String[] args) {
		
		File[] drives = File.listRoots();
		for (int index = 0; index < drives.length; index++) {
			System.out.println(drives[index].getAbsolutePath());
		}

	}

}
