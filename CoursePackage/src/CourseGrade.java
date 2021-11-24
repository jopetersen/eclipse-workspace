import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.io.IOException;

public class CourseGrade {
   public static void main(String[] args) throws IOException {
      Scanner scnr = new Scanner(System.in);
      double n;
      int average;
      String grade = null;

      // For input of filename
      String infoFileName;
      // For input of StudentInfo
      FileInputStreams infoStream;
      
      // For output of report
      String reportFileName = "report1.txt";
      FileOutputStream reportStream;
      FileOutputStream reportWriter;

      //variables to hold data from the input file
      String firstNames;
      String lastNames;
      int midterm1Scores;
      int midterm2Scores;
      int finalScores;

      // For computing averages at end of program
      double midterm1Sum;
      double midterm2Sum;
      double finalSum;

      // Get the name of the student information file
      infoStream = scnr.next();

      // Read the student information
      while(infoStream) {
         lastNames = infoStream.nextInt();
         firstNames = infoStream.nextInt();
         midterm1Scores = infoStream.nextInt();
         midterm2Scores = infoStream.nextInt();
         finalScores = infoStream.nextInt();
      }

     
      // Output the data and letter grade for each student
      // (n is the value left from the previous loop)
      for (int i = 0; i < n; ++i) {

         // Compute the letter grade
         average = (midterm1Scores
                    + midterm2Scores
                    + finalScores) / 3;
         if (average >= 90) {
            grade = 'A';
         }
         else if (average >= 80) {
            grade = 'B';
         }
         else if (average >= 70) {
            grade = 'C';
         }
         else if (average >= 60) {
            grade = 'D';
         }
         else {
            grade = 'F';
         }

         // Output the data and letter grade
         reportStream.printf("%s\t%s\t%d\t%d\t%d\t%s\n",
                             lastNames, firstNames,
                             midterm1Scores, midterm2Scores,
                             finalScores, grade);
      }

      // Compute the average for each exam
      
      for (int i = 0; i < n; ++i) {
         midterm1Sum += midterm1Scores;
         midterm2Sum += midterm2Scores;
         finalSum += finalScores;
      }

      reportStream.printf("\nAverages: Midterm1 %.2f, Midterm2 %.2f, Final %.2f\n",
           midterm1Sum / n, midterm2Sum / n, finalSum / n);

  
   }
}