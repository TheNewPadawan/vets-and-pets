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
		personRepository.save(model);
	}

	@Override
	public Person retrieve(long id) {
		return personRepository.findById(id); 	
	}

	@Override
	public void update(Person model) {
		personRepository.update(model);
		
	}

	@Override
	public void delete(long id) {
		personRepository.deleteById(id);		
	}

}
