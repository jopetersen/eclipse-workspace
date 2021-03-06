/* Written by Jordan Petersen
 * Programming assignment 3
 * Last edited: 10/2/2021
 */

// get scanner, we'll need it at some point
import java.util.Scanner;



public class ProgrammingAssignment3 {

	public static void main (String [] args) {
		Scanner scnr = new Scanner(System.in);
		
		/* Problem Statement: 
		 * Write a program that takes in an integer in the range 11-100 as input. 
		 * The output is a countdown starting from the integer and stopping when both 
		 * output digits are identical.

		 	*/
		
		// declare interger that a user inputs
		
		int  userVal;
		

		// get user input, which must be between 11 and 100
		userVal = scnr.nextInt();
		
		// get the first digit by dividing by 10
		int firstDigit = (userVal/10);

		
		// get the second digit of a number
		//declare second digit variable
		int secondDigit = (userVal % 10);
		//The modulo operator gives remainder of a number while divide operator 
		// gives quotient as a result.	
		
		
		// validate that input is > 100 or <= 100)
		if (userVal >= 11 && userVal <= 100) {
			System.out.print(userVal+ " ");
		
			// while function to compare digits
			while (firstDigit != secondDigit) {
				//System.out.print(userVal+ " ");	
				// decrement userval by 1
				userVal= userVal-1; 
				
				System.out.print(userVal + " ");
				// recalculate digits so that they can br compared
				firstDigit = (userVal/10);
				secondDigit = (userVal % 10);
				
			}
		System.out.println();
		} 
		
		
		else {
			System.out.println("Input must be 11-100");
		}
		
			
			
	
		
			
		
		/* testing
		System.out.println(secondDigit);
		
		
		System.out.println("First digit: " + firstDigit);
		
		System.out.println("Second digit: " + secondDigit);
		
		// get the second digit of the number
	*/
		
		scnr.close();
	}	
}
