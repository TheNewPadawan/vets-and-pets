package io.thenewpadawan.example.vetsandpets.model;

import java.util.ArrayList;
import java.util.List;

public class Vet {
	private long id;
	private String firstname;
	private String lastname;
	private List<String> specializations = new ArrayList<>();

	public Vet() {}

	public Vet(String firstname, String lastname) {
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

	public List<String> getSpecializations(){
		return specializations;
	}
}
