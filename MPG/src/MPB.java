import java.util.Scanner;
public class MPB {

	public static void main(String[] args) {

		Scanner scnr = new Scanner(System.in);
		
		// System.in is input 
		
		// variables
		
		float miles; 		//input miles
		float gallons; 		//input gallons 
		
		// float holds 6 decimal places, double holds 32
		
		// prompt the user for input
		
		
		System.out.print("Enter the number of miles: ");
		miles = scnr.nextFloat();
		
		
		System.out.print("Enter the number of galllons: ");
		gallons = scnr.nextFloat();
		
		System.out.printf("MPG = %1f", miles/gallons);
	
		
		//close the scanner
		scnr.close();
		
	}

}
