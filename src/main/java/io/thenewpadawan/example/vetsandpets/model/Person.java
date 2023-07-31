package io.thenewpadawan.example.vetsandpets.model;

public class Person {
	private long id;
	private String firstname;
	private String lastname;
	
	public Person() {}

	public Person(String firstname, String lastname) {
		this.firstname = firstname;
		this.lastname = lastname;
	}
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}	
}