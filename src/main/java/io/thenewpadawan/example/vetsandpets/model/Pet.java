package io.thenewpadawan.example.vetsandpets.model;

import java.util.Date;

public class Pet {
	private long id;
	private String name;
	private String breed;
	private Date dateOfBirth;

	public Pet() {
		this.dateOfBirth = new Date();
	}

	public Pet(String name, String breed, Date dateOfBirth) {
		this.name = name;
		this.breed = breed;
		this.dateOfBirth = dateOfBirth;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}
}
