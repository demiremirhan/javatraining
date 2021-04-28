package javatrainingdaytwo;

public class Main {

	public static void main(String[] args) {
		
		Category category1=new Category(1, "cat", "all");
		Category category2 = new Category(2, "cat", "diff");
		
		Course course1 = new Course();
		course1.setCourseName("Java&React");
		
		Course course2 = new Course();
		course2.setCourseName("C#&Angular");
		
		Student student = new Student();
		student.joinToCourse(course1);
		
	}

}
