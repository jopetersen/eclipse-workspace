// Written by Jordan Petersen 9/16/21
// purpose: to learn how to cast variables & calculate the average of 3 user
//    inputted values

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scnr = new Scanner(System.in);
		
		int test1;
		int test2;
		int test3;
		
		//prompt the user 
		
		System.out.print("Enter test 1: ");
		test1 = scnr.nextInt();
		
		System.out.print("Enter test 2: ");
		test2 = scnr.nextInt();
		
		System.out.print("Enter test 3: ");
		test3 = scnr.nextInt();

		//%f means that it's a floating point interger
		// integer / integer expects an int
		
		System.out.printf("Average = %.1f",
				(float) (test1 + test2 + test3) /3);

		// static cast
		
			scnr.close();
		
	}

}
