import java.util.Scanner;

// written by: Jordan Petersen
// Last modified on: 10/21/21

/* Assignment 5: Course Information
 * 
 * Purpose:
 *  Given main(), define a Course base class with methods to set 
 *  and get the courseNumber and courseTitle. 
 *  Also define a derived class OfferedCourse with methods to set and get 
 *  instructorName, term, and classTime.

Ex. If the input is:

ECE287
Digital Systems Design
ECE387
Embedded Systems Design
Mark Patterson
Fall 2018
WF: 2-3:30 pm


 */
public class CourseInformation {
	
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);

		//create Courses objects
		Course myCourse = new Course();
		
		OfferedCourse myOfferedCourse = new OfferedCourse(); // we will use this to extend courses
		// initialize variables
		
		String courseNumber;
		String courseTitle; 
		String oCourseNumber;
		String oCourseTitle;
		String instructorName;
		String term;
		String classTime;
		
		// get course number and titles
		
		 courseNumber = scnr.nextLine();
	     courseTitle = scnr.nextLine();

	     // read in offered course details
	     oCourseNumber = scnr.nextLine();
	     oCourseTitle = scnr.nextLine();
	     instructorName = scnr.nextLine();       
	     term = scnr.nextLine();
	     classTime = scnr.nextLine();

	     myCourse.setCourseNumber(courseNumber);
	     myCourse.setCourseTitle(courseTitle);
	     
	     // print info from my courses
	     myCourse.printInfo();
	     
	     // set the values for the course I am taking
		
	     myOfferedCourse.setCourseNumber(oCourseNumber);
	     myOfferedCourse.setCourseTitle(oCourseTitle);
	     myOfferedCourse.setInstructorName(instructorName);
	     myOfferedCourse.setTerm(term);
	     myOfferedCourse.setClassTime(classTime);
	     myOfferedCourse.printInfo();

	     // print everything
	     System.out.println("   Instructor Name: " + myOfferedCourse.getInstructorName());
	     System.out.println("   Term: " + myOfferedCourse.getTerm());
	     System.out.println("   Class Time: " + myOfferedCourse.getClassTime());
		
		
		
		scnr.close();
	}
	
	
	
	
}
