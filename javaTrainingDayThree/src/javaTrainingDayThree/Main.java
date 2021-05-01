package javaTrainingDayThree;

public class Main {

	public static void main(String[] args) {
		Student student = new Student(1, "emirhan","demir", " emirhandemir@aol.com" , 75, 
				"Java & react","debit" );
		Instructor instructor = new Instructor(1,"engin", "demiroğ", "engindemirog@gmail.com", 154,
				"Java & react");
		
		StudentManager studentManager = new StudentManager();
		studentManager.add(student);
		studentManager.delete(student);
		studentManager.update(student);
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.add(instructor);
		instructorManager.delete(instructor);
		instructorManager.update(instructor);
		
	}

}
