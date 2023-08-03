package io.thenewpadawan.example.vetsandpets.controller;

import io.thenewpadawan.example.vetsandpets.model.Person;
import io.thenewpadawan.example.vetsandpets.repository.PersonFakeRepository;

public class PersonController implements DefaultController {
	private final PersonFakeRepository personRepository;
	
	public PersonController(PersonFakeRepository personRepository) {
		this.personRepository = personRepository;
	}

	@Override
	public void create(Person model) {
		personRepository.insert(model);
	}

	@Override
	public void retrieve() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete() {
		// TODO Auto-generated method stub
		
	}

}
