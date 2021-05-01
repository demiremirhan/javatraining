package javaTrainingDayThree;

public class Instructor extends User {
 
	private int courseTime;
	private String CourseName;
	
	public Instructor(int id, String firtName, String lastName, String email, int courseTime, String courseName) {
		super(id, firtName, lastName, email);
		this.courseTime = courseTime;
		CourseName = courseName;
		
	}

	public int getCourseTime() {
		return courseTime;
	}

	public void setCourseTime(int courseTime) {
		this.courseTime = courseTime;
	}

	public String getCourseName() {
		return CourseName;
	}

	public void setCourseName(String courseName) {
		CourseName = courseName;
	}

}
