/**
 * 
 */
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
/**
 * @author Colin Bradshaw
 *
 */
public class AppendToFile {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the absolute path of the text file you would like to append to: ");
		String path = in.nextLine();
		System.out.print("Enter the text you would like to append: ");
		String text = in.nextLine();
		try (BufferedWriter bf = new BufferedWriter(new FileWriter(new File(path), true))){
			bf.append(text);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			in.close();
		}
	}
}
