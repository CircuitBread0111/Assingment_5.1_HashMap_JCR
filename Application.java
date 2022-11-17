//imports
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * 
 * @author Jerrin C. Redmon
 * @version 1.0
 *
 */
public class Application {
	public static void main(String[] args) throws FileNotFoundException {
		final String filename = "DictionaryWordValuePairs.csv";
		Scanner scanFile = new Scanner(new File(filename));
		Dictionary dict = new Dictionary();
		while (scanFile.hasNextLine()) {
			String line = scanFile.nextLine();
			String[] pair = line.split(",", 2);
			dict.add(pair[0], pair[1]);
		}
		
		System.out.println(dict);
		
		System.out.println("ye:" + dict.getValue("ye") + "  :hashcode: " + "ye".hashCode());
		System.out.println("'tis:" + dict.getValue("'tis") + "  :hashcode: " + "'tis".hashCode());
		System.out.println("jade:" + dict.getValue("jade") + "  :hashcode: " + "jade".hashCode());
		System.out.println("sooth:" + dict.getValue("sooth") + "  :hashcode: " + "sooth".hashCode());
		System.out.println("mage:" + dict.getValue("mage") + "  :hashcode: " + "mage".hashCode());
		
		
		scanFile.close();
	}
}
