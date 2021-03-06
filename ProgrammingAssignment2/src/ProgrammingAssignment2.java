// Written by Jordan Petersen
// last modified 9/23/21
import java.util.Scanner;
public class ProgrammingAssignment2 {

	public static void main(String[] args) {
	      Scanner scnr = new Scanner(System.in);

	      // #PROBLEM
/*Golf scores record the number of strokes used to get the ball in the hole. 
 * The expected number of strokes varies from hole to hole and is called par (i.e. 3, 4, or 5).
 * Each score's name is based on the actual strokes taken compared to par
	"Eagle": strokes is two less than par
	"Birdie": strokes is one less than par
	"Par": strokes equals par
	"Bogey": strokes is one more than par
	
	Given two integers that represent par and the number of strokes used, 
	write a program that prints the appropriate score name. 
	Print "Error" if par is not 3, 4, or 5.

	Sample input: 4 3
	
	Output: Birdie
*/
		// define & initialize variables
		// par is read in first.
		int par = 0;
		int numStrokes = 0; 
		
	
		// read in values from user
	
		par = scnr.nextInt();
		numStrokes = scnr.nextInt();
		
		String scoreName = "";
		
		
		// error condition
		if ((par != 3) && (par != 4 ) && (par != 5))
		{
			System.out.print("Error");
			//System.out.println(par); test case
			} 
		
		else  {
				// write a conditional that subtracts par - numStrokes
				//  par - numstrokes = 
				//  par is 4, numstrokes = 3, 1 --> birdie
				if (par-numStrokes >= 2) {

					// greater than or equal since it can be significantly less?
					scoreName = "Eagle";
				} else if (par-numStrokes == 1) { // must use equal because otherwise eagle could be 
					scoreName = "Birdie";
				} else if (par - numStrokes == 0) {
					scoreName = "Par";
				} else { //(par - numStrokes == -1) 
					scoreName = "Bogey";
					}
		
			} 
		System.out.println(scoreName);
		
	}

}
