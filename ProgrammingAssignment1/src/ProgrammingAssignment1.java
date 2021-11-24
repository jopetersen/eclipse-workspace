// Author: Jordan Petersen
// Last modified: 9/19/21
// purpose statements in the body of the program

import java.util.Scanner;
import java.math.BigInteger;

/* 
 * Found this via Google search
 * https://www.geeksforgeeks.org/biginteger-class-in-java/
 
  BigInteger class is used for mathematical operation
  which involves very big integer calculations that are 
  outside the limit of all available primitive data types.




 */


public class ProgrammingAssignment1 {

	public static void main(String[] args) {
		// Simple Statistics part 1
		Scanner scnr = new Scanner(System.in);

		// Given 4 integers, output their product and their average, using integer arithmetic.
		
		// initialize 4 number variables
		int num1;
		int num2;
		int num3;
		int num4;
		
		num1 = scnr.nextInt();
		num2 = scnr.nextInt();
		num3 = scnr.nextInt();
		num4 = scnr.nextInt();
		
		// total value
	//	int productTotal; 
		
		// calculates the product of the ints
	//	productTotal = (num1 * num2 * num3 * num4);
		
	//	int averageNum = (num1 + num2 + num3 + num4)/4; 
		
//		System.out.println(productTotal + " " + averageNum);
		
		// test case: System.out.println("Your number is: " + num1);
		
		
		// part 2 - output the product/average using floating point arithmitic
		// floating points have fractional parts
		
		// now I need the variables in floats, doubles are unnecessary


		// test cases broke the floating points, so using doubles instead
		//float productMult = (num1 * num2 * num3 * num4);
		//float numAverage = (num1 + num2 + num3 + num4)/4.0f;
		
		//double productMult = (num1 * num2 * num3 * num4);
		double numAverage = ((num1/4.0 + num2/4.0 + num3/4.0 + num4/4.0));
		
		// initialize big integer variable
		// syntax: BigInteger(byte[] val); 
		// use biginteger.multiply value
		BigInteger product = new BigInteger(""+num1).multiply(BigInteger.valueOf(num2)).
				multiply(BigInteger.valueOf(num3)).multiply(BigInteger.valueOf(num4));
				
				// note to self: valueOf returns a long;
		
		
		// initialize concise variables to be printed
		// cast numAverage to an int
		// use.intValue to convert biginteger to an integer value
		int print1 = (int) numAverage;
		int print2 = product.intValue();
		
		
		// print out the final values using %d since we used integers, printf is print formatted
		 
		
		System.out.printf("%d %d\n", print2, print1);
		
		// we use f for either a float or a double 
		System.out.printf("%.3f %.3f\n", product.doubleValue(),numAverage);
		
		
/*		System.out.printf("%.3f", product);
		 System.out.print(" ");
		 // %.3f tellls us to use 3 sigfigs
		 System.out.printf("%.3f", numAverage);
		 System.out.println();
		 
		 // printf is (format, arguments)
		 */
		
		// close the scanner (it's good practice)
		 scnr.close();
		 

	}

}
