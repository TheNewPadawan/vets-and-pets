package io.thenewpadawan.example.vetsandpets.controller;

import io.thenewpadawan.example.vetsandpets.model.Person;

public interface DefaultController {
	public void create(Person model);
	public Person retrieve(long id);
	public void update(Person model);
	public void delete(long id);
}
