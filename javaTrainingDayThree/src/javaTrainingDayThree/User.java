package javaTrainingDayThree;

public class User {
	
	private int id;
	private String firtName;
	private String lastName;
	private String email;
	
	
	
	public User(int id, String firtName, String lastName, String email) {
		super();
		this.id = id;
		this.firtName = firtName;
		this.lastName = lastName;
		this.email = email;
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getFirtName() {
		return firtName;
	}



	public void setFirtName(String firtName) {
		this.firtName = firtName;
	}



	public String getLastName() {
		return lastName;
	}



	public void setLastName(String lastName) {
		this.lastName = lastName;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}

}
