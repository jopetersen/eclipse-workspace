/* 
Author: Jordan Petersen
Class: Data Structures
Assignment: 1
Last modified - 11/7/2021
*/
// this file's purpose: Define the binary number constructors & the setter/getter methods

/*
 * Binary number basics - ref link: https://www.baeldung.com/java-binary-numbers
 */
package test1;
import java.math.*;

import java.util.Arrays;


class BinaryNumber{
	
	// steps taken - 
	// initialize arrayData (array)and length (int)
		private int arrayData[];
		
		private int length;

		
		//intialize an overflow flag
		
		private boolean overFlow = false;
		
		// create a binary number based on an int pass
    	
    	public BinaryNumber(int length) {	
    		
    		// error checking
    			// Length is not at least 1 number. 
    		if((length != (int)length) || length <= 0) {
    			System.out.println("Invalid number. Please enter a value greater than or equal to 1.");
    			return; // stops the program from continuing after an invalid input
    		} else {
    		
    		// initializing a data array using int
    		// to create a new array, we need to use the new keyword
    		// this essentially says "give me an array with length # of elements
    		
       		arrayData = new int[length];
    		
    		this.length = length; // explicitly define which length it is.
    		
    		// https://www.geeksforgeeks.org/arrays-in-java/ ref link in case future follow up needed
    		// write a loop to add 0s until appropriate length is reached
    		for (int i=0; i<length; i++) {
    			// data[i] uses the index, 0 places the 0 value there
    			arrayData[i] = 0; 			
    		}
    		
    	}
    	}
    // create an overloaded constructor taking a string & returns an int
    	// so "1011" would return 1011
    	
    	public BinaryNumber(String str){
    		
    		// notes from with Connie - need to set 
    		
    		int length1 = 0;
    		int[] arr = new int[str.length()]; 
    		
    		// arrayData = [1, 0, 1, 1];
    		// length should be 4, not index values
    	
    		// error check! make sure that this string is actually a binary number
    			// if the value at every index is not either a 1 or a 0.. it's not binary
    		for (int i =0; i < str.length(); i++) { 			
    			if(!(str.charAt(i) == '0' || str.charAt(i) =='1')){
    				System.out.println("The number that you have entered is not a binary number");
    				return;
    			} else {
    				arr[i] = (int) str.charAt(i);
    				
    			}
    		} 			
    			length = arr.length;
    			arrayData = arr;
    		
    	}
    	
    	
    	// get length of our binary number
    	
    	public int getLength() {
    		return this.length;		// be explicitly 
    	}
    	
    	
    	// create a getDigit function for getting the digit of a binary number given an index
    	// if an index is out of bounds then a message should print that it is
    	
    	public int getDigit(int index) {
    		
    		//error check! Make sure that the number is in bounds.
    		if(!(index <= this.length) || (index < 0)) {
    			System.out.println("The index that you've entered is too large, please enter a smaller number");
    			return -1; // always need to return an int since we used public INT in the method definition
  			} else {
    			return arrayData[index]; // return the proper digit at the index
  			}
    	}
       	
    	public int toDecimal (){
    		
    		// transform binary number to decimal notation using LITTLE endian format
			// little endian machines stored with the last byte stored first. 
			/*	sample input/output	
			 * 	decimal 1010 = 10
			 * 	decimal 10101 = 21
			 *  decimal 11111 = 31
			     	 */
		    
    		// initialize the return variable & the index variable (n)
    		int binaryDecimal = 0;  			    	
    		
    		// write a for loop that uses the length of the array it's being called on
    		// binary review: http://www.steves-internet-guide.com/binary-numbers-explained/
    		
    		// binary  numbers can be represented as exponents with 2. a binary number is 2^(index) effectively
    		
    		
    		for (int i = 0; i < length; i++) {
    			binaryDecimal += arrayData[i]*Math.pow(2, arrayData.length - 1 - i);
    			// use += because we're taking the sum of all of the binary numbers, will need to subtract length 
    			//    by 1 to ensure that we're staying within bounds, then subtract i to specify the specific index
    			}
			return binaryDecimal;		
    	}
    	
    	// shifts all digits in a binary number to AMOUNT number of places to the right
    		// for example shifting 1011 3 places to the right would yield 0001011
    	void shiftR(int amount) {
    		
    		// first we error check - amount should be an integer
    		
    		//error cases: non-integer inputs, negative values, or 0
    		
    		if ((amount%1 == 0) && amount >0) { // if not negative or 0.. do the things
    			
    			// tip from the hint section - make a reallocated array to hold the temp value	
        		// initialize a temporary-array to store our current array
        	
        		// create a temporary array, passing in the array that is holding the binary number & adding the amount
        		// the amount value represents the number of digits that we need to add at the beginning
        		// these digits will all be 0s
        		
        		// initialize a temporary-array to store our current array
        			
        		int tempArray [] = Arrays.copyOf(arrayData, arrayData.length + amount);
        		
        		// temp array copies all of the values at a given index at their same indicies, which could lead us to having
        		// original array of 0101 appearing as 0101000 if a shift was 3, so we need to write another for loop to shift the 
        		// original numbers to the right, then write a /separate/ loop passing in the length indice difference, then fill 
        		// the new indices at 0
        		
        		
        		// write a for loop that shifts the original array values to the right side of the temp array
    	    	for (int i = tempArray.length -1; i > amount; i--) {
    	    		 tempArray[i] = arrayData[i-amount]; // we only care about the indexes that were empty when the temp array was created   		
    	    		 }
    		    		
    	    	// write a loop that enters 0s in for each new index created in the temporary
    	    	
    	    	// originally wrote this using a <= for the second piece of the loop.. but it should be < because indexes are base 0
    	    	for (int i = 0; i < amount; i++) {
    	    		tempArray[i] = 0; // assigns only the first index up to the final new index to 0
    	    	}
    	    	
    	    		// replace the values of the initial arrayData to that of the temporary arrays
        	
    	    	arrayData = tempArray;
        		
    			
    		} else {
    			System.out.println("You have entered an invalid number, please enter a number.");
    
    		}
    		
    		
    	
    		
    	}
    	
    	// add two binary numbers together - one should receive the message, other is a param.
    	// if lengths are not the same, print a message saying as much, otherwise modify the receiving binary number with the 
    	// result of the addition
    	public void add(BinaryNumber aBinaryNumber) { // interesting that in the UML, we're overriding a basic function 
    		// check if the two binary numbers have the same length
    		
    		// error checking - does the binaryNumber that we pass in have the length correctly set?
    		if ((this.length%1 != 0) || aBinaryNumber.length%1 != 0) {
    			System.out.println("Your second binary number is invalid");
    		}
    		// if the lengths are not the same, say so. 
    		
    		else if (this.getLength() != aBinaryNumber.getLength()) {
    			// we use this.getLength because we're referring to a specific object
    			System.out.println("Your binary numbers do not have the same lengths");  			
    		}
    		
    		// otherwise, add the two binary numbers together
    		else {
    			
    		 // initialize a variable to determine if an overflow occurs
    			int overFlowCheck = 0;
    			
    			// loop through the length (only need to use 1 length since they are the same), just use < and we'll be set
    			for (int i = 0; i < arrayData.length; i++) {
    				
    				// to add binary numbers.. if both integers have 1s at a given digit, the value is 0
    				// if there's a combination of 1 and 0, a value of 1 is inserted
    				// if both values are 0, then the addition resolves to 0
    			
    				// create a variable to add on to 
    				int tempNumber = overFlowCheck + this.getDigit(i) + aBinaryNumber.getDigit(i); // this accounts for overflows
    				// have to compare digits at the same indexes
    				// have to use this.getDigit to avoid after effects
    				
    				// if the digits add up to 10, a 1 will be inserted into the given digit
    				if (tempNumber >= 10) {
    					tempNumber = tempNumber-10;
    					overFlowCheck= 1; // 
    				} else {
    					overFlowCheck = 0;	
    				}
    				
    				arrayData[i]=tempNumber; // sets a new value to the correct index within the array, then i=i+1 will execute, working through the rest
    				
    	
    			}
    			
    			if (overFlowCheck != 0) {
    				overFlow = true;
    			}
    			
    		}
    	}
    	
    // add a clear overflow
    	public void clearOverflow() {
    		
    		if ((overFlow != false) || overFlow != true) {
    			
    			System.out.println("Overflow has been corrupted, it does not have a value of either true or false.");
    		} else if (overFlow == true) {
    			overFlow = false;
    		}
    		
    	}
    	

@Override
// if the number is the result of an overflow, "Overflow" should be returned
// overflow is when we assign a variable to a variable which is more than the max allowed value

		public String toString() {
    		
    		// declare/initialize a variable string that the binary number will be stored in later.
    		//String numStr = "";
    		
    		// stringbuilder returns a stringbuilder
    		
			StringBuilder numStr = new StringBuilder();
	
	
    		// if (overflow) is the same as if (overflow == true)
    		if (overFlow) {
    			return "Overflow";
    		} else {
    			
    			// write a loop to build a string based on the position of the array
    			// use length -1 because of base 0
    			for (int i = 0; i < arrayData.length; i++) {
    			//	numStr = numStr+i; // + with strings adds the next character at the end of the string
    				//numStr = numStr + arrayData[i];
    				
    				numStr.append(arrayData[i]);
    				
    			}
    		return numStr.toString(); // convert from an object to a string
    			
    			
    		} 
    		
    	}

    	
    }




