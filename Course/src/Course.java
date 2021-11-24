// written by: Jordan Petersen
// Last modified on: 10/21/21

// create a course class that sets and gets the course details
public class Course{
	//declare coursenumber/title
	
	private String courseNumber;
	private String courseTitle;
	
	//sets and gets
	
	public String getCourseNumber() {
		return courseNumber;
		
	}
	
	public void setCourseNumber(String courseNumber) {
		this.courseNumber = courseNumber;
	}
	
	public String getCourseTitle() {
		return courseTitle;
	}
	
	public void setCourseTitle(String courseTitle) {
		this.courseTitle = courseTitle;
	}
	
	
	// print errything
	public void printInfo() {
		// it's void since we're not assigning anything
		
		System.out.println("Course Information: ");
		System.out.println("   Course Number: " + courseNumber);
		System.out.println("   Course Title: " + courseTitle);
		
		
		
	}
	
	
	
}