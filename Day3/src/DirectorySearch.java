import java.io.File;
import java.util.Scanner;

/**
 * 
 */

/**
 * @author Colin Bradshaw
 *
 */
public class DirectorySearch {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		DirectorySearch ds = new DirectorySearch();
		
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the absolute path of the directory to search: ");
		String path = in.nextLine();
		// do not create a null file
		if(path!= null) {
			File origin = new File(path);
			ds.printDirsAndFiles(origin);
		}
		in.close();
	}
	// get all files in given directory in an array
	// iterate over contents while printing and calling recursively
	public void printDirsAndFiles(File origin) {
		File[] contents = origin.listFiles();
		if(contents != null) {
			for(File f: contents) {
				System.out.println(f.getName());
				printDirsAndFiles(f);
			}
		}
	}
}
