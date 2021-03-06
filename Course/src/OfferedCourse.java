import java.util.Scanner;

// written by: Jordan Petersen
// Last modified on: 10/21/21

// create an abstracted offeredCourse class

public class OfferedCourse extends Course {
	Scanner scnr = new Scanner(System.in);

	// declare private vars
	
	private String instructorName;
	private String term;
	private String classTime;
	
	// sets and gets.. again
	
	public String getInstructorName() {
		return instructorName;
	   }

	public void setInstructorName(String instructorName) {
	       this.instructorName = instructorName;
	   }
	   
	   
	public String getTerm() {
		return term;
		
	}
	
	public void setTerm(String term) {
		this.term = term;
		
	}
	
	public String getClassTime() {
		return classTime;
		
		
	}
	
	public void setClassTime(String classTime) {
		this.classTime = classTime;
		
	}
	
	//print information using super to access parent/base fields
	public void printInfo() {
		System.out.println("Course Information: ");
		System.out.println("   Course Number: " + super.getCourseNumber());
		System.out.println("   Course Title: " + super.getCourseTitle());
		
	}
	
	

}
