package test;

//1. import the Scanner class to allow for users' inputs
import java.util.Scanner;

//2. Create a class to run the application
public class PeopleWeights {

  //3. Write the main method where the execution begins
  public static void main(String[] args) {
      //3a. Create an object of the Scanner class
      Scanner scnr = new Scanner(System.in);
      
      //3b. Create a double array variable to hold the numbers entered by user
      double weights[] = new double[5];
      
      //3c. Initialize the index variable i, for the loop
      int i = 0;
      
      //3d. Create a while loop that terminates when i is less than 5
      while (i < 5) {

          //3e. At each of the cycles of the loop, prompt the user to enter a number
          System.out.println("Please enter weight: " + (i+1));
          
          //3f. Receive the entered number and add to the array weights
          weights[i] = scnr.nextDouble();
          
          //3g. Increment the index variable i by 1
          i++;
      }
      
      //3h. Call the appropriate methods to perform the tasks.
      //output the weights
      System.out.print(outputWeights(weights));
      
      //output the total weight
      System.out.println("The total weight is " + totalWeight(weights));
      
      //output the average of the weights
      System.out.println("The average of the weights is " +averageWeight(weights));
      
      //output the maximum of the weights
      System.out.println("The maximum weight is " + maxWeight(weights));

  }

  
  //4. Output Weights Method
  // The method has a return type of void since it will just display the array elements
  // The method receives the array as argument
  // The method loops through the array as it prints its elements
  public static double outputWeights(double[] arr) {
      for (int i = 0; i < arr.length; i++) {
          System.out.print(arr[i] + " ");
      }
      System.out.println("");
  }

  //5. Total Weight Method
  // The method has a return type of double since it will return the sum of all the weights
  // The method receives the array as argument
  // The method loops through the array and sums all its elements.
  public static double totalWeight(double[] arr) {
      double sum = 0;
      for (int i = 0; i < arr.length; i++) {
          sum = sum + arr[i];
      }

      return sum;
  }
  
  
  //6. Average Weight Method
  // The method has a return type of double since it will return the average of all the weights
  // The method receives the array as argument
  // The method loops through the array and finds the average of all its elements.
  // by calling the totalWeight method.
  public static double averageWeight(double[] arr) {
      return totalWeight(arr) / arr.length;
  }

  //7. Maximum Weight Method
  // The method has a return type of double since it will return the max of all the weights.
  // The method receives the array as argument.
  // The method loops through the array and finds the max of all the elements.
  public static double maxWeight(double[] arr) {
      double temp = arr[0];
      for (int i = 1; i < arr.length; i++) {
          if (arr[i] > temp) {
              temp = arr[i];
          }
      }

      return temp;
  }

}
