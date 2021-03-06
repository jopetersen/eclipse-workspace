import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class ReadFile {
	public static readFile(int fileNum, String fileName) throws IOException {
	      FileInputStream fileByteStream = null; // File input stream
	      Scanner inFS = null;                   // Scanner object

	      // Try to open file
	      System.out.println("Opening file numbers.txt.");
	      fileByteStream = new FileInputStream("src/numbers.txt");
	      inFS = new Scanner(fileByteStream);

	      // File is open and valid if we got this far (otherwise exception thrown)
	      System.out.println("Reading and printing numbers.");

	      while (inFS.hasNextInt()) {
	         fileNum = inFS.nextInt();
	         System.out.println("num: " + fileNum);
	      }

	      // Done with file, so try to close it
	      System.out.println("Closing file myfile.txt.");
	      fileByteStream.close(); // close() may throw IOException if fails
	      return;
	   }
}
