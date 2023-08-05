package io.thenewpadawan.example.vetsandpets.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Person {
	private long id = 0;
	private String firstname;
	private String lastname;
	private List<Pet> pets = new ArrayList<>();
	
	public Person() {}

	public Person(String firstname, String lastname) {
		this.firstname = firstname;
		this.lastname = lastname;
	}
	
	public void adopt(Pet pet) {
		if (pet == null) {
			return;
		}
		for (int i = 0; i < pets.size(); i++) {
			if (pet.equals(pets.get(i))) {
				return;
			}
		}
		this.pets.add(pet);
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
	
	public List<Pet> getPets() {
		return pets;
	}

	@Override
	public int hashCode() {
		return Objects.hash(firstname, id, lastname, pets);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		return Objects.equals(firstname, other.firstname)
				&& (id > 0 && other.id > 0 ? id == other.id : true)
				&& Objects.equals(lastname, other.lastname)
				&& Objects.equals(pets, other.pets);
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", firstname=" + firstname + ", lastname=" + lastname + ", pets=" + pets + "]";
	}
	
	
	
	
}
