import java.util.Scanner; // we need this for reading in vars

// written by Jordan Petersen on 9/13/2021

public class simpleStatistics {

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
		int productTotal; 
		
		// calculates the product of the ints
		productTotal = (num1 * num2 * num3 * num4);
		
		int averageNum = (num1 + num2 + num3 + num4)/4; 
		
		System.out.print(productTotal + " " + averageNum);
		
		// test case: System.out.println("Your number is: " + num1);
		
		
		// part 2 - output the product/average using floating point arithmitic
		// floating points have fractional parts
		
		 System.out.printf("%.3f", productTotal);
		


		
		
	}
	
	
	
}

// https://learn.zybooks.com/zybook/STEVENSCS501SOC501Fall2021/chapter/1/section/2?content_resource_id=49386636
// reference ^
