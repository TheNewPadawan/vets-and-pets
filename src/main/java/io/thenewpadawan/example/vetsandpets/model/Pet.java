package io.thenewpadawan.example.vetsandpets.model;

import java.util.Date;
import java.util.Objects;

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

	@Override
	public int hashCode() {
		return Objects.hash(breed, dateOfBirth, id, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pet other = (Pet) obj;
		return Objects.equals(breed, other.breed)
				&& Objects.equals(dateOfBirth, other.dateOfBirth)
				&& (id > 0 && other.id > 0 ? id == other.id : true)
				&& Objects.equals(name, other.name);
	}
}
