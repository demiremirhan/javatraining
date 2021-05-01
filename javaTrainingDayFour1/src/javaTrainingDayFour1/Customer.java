package javaTrainingDayFour1;

import java.text.DateFormat;

import javaTrainingDayFour1.Abstract.Entities;

public class Customer implements Entities {

	private int id;
	private String firstName;
	private String lastName;
	private DateFormat dateOfBirth;
	private Long nationalityId;
	
	
	public Customer(int id, String firstName, String lastName, DateFormat dateOfBirth, Long nationalityId) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
		this.nationalityId = nationalityId;
		
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public DateFormat getDateOfBirth() {
		return dateOfBirth;
	}


	public void setDateOfBirth(DateFormat dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}


	public Long getNationalityId() {
		return nationalityId;
	}


	public void setNationalityId(Long nationalityId) {
		this.nationalityId = nationalityId;
	}
}
