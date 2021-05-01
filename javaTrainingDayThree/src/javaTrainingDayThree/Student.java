package javaTrainingDayThree;

public class Student extends User {
	
	private int progress;
	private String courseName;
	private String paymentType;
	
	
	public Student(int id, String firtName, String lastName, String email, 
			int progress, String courseName,
			String paymentType) 
	{
		super(id, firtName, lastName, email);
		this.progress = progress;
		this.courseName = courseName;
		this.paymentType = paymentType;
	}


	public int getProgress() {
		return progress;
	}


	public void setProgress(int progress) {
		this.progress = progress;
	}


	public String getCourseName() {
		return courseName;
	}


	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}


	public String getPaymentType() {
		return paymentType;
	}


	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}
	
	

}
