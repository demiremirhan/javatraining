package javatrainingdaytwo;

public class Student {
	public void joinToCourse(Course course) {
		System.out.println(course.getCourseName()+"  registered.");
	}
	public void completeCourse(Course course) {
		System.out.println(course.getCourseName()+"  completed.");
	}
}
