import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 * 
 */

/**
 * @author Colin Bradshaw
 *
 */
public class CharSearch {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the absolute path of the file you would like to search: ");
		String path = in.nextLine();
		System.out.print("Enter the character you would like to search the file for: ");
		//take only the first character regardless of what is entered.
		char search = in.next().charAt(0);
		int counter = 0;
		String line;
		
		try (BufferedReader br = new BufferedReader(new FileReader(new File(path)));){
			while((line = br.readLine()) != null) {
				char[] searchLine = line.toCharArray();
				for(char x: searchLine) {
					if(x==search) {
						counter++;
					}
				}
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			in.close();
			System.out.println("Specified character was found: " + counter + " times in the file.");
		}
	}

}
