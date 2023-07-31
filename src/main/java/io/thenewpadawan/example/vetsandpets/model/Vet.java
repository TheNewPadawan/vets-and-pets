package io.thenewpadawan.example.vetsandpets.model;

import java.util.ArrayList;
import java.util.List;

public class Vet extends Person {
	private List<String> specializations = new ArrayList<>();

	public Vet() {}

	public Vet(String firstname, String lastname) {
		super(firstname, lastname);
	}
	
	public Vet(String firstname, String lastname, List<String> specializations) {
		this(firstname, lastname);
		this.specializations.addAll(specializations);
	}


	public List<String> getSpecializations(){
		return specializations;
	}
}
