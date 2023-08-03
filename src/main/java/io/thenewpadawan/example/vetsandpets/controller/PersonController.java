package io.thenewpadawan.example.vetsandpets.controller;

import io.thenewpadawan.example.vetsandpets.repository.PersonFakeRepository;

public class PersonController implements DefaultController {
	private final PersonFakeRepository personRepository;
	
	public PersonController(PersonFakeRepository personRepository) {
		this.personRepository = personRepository;
	}

	@Override
	public void create() {
		// TODO Auto-generated method stub
		
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
