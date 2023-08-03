package io.thenewpadawan.example.vetsandpets.controller;

import io.thenewpadawan.example.vetsandpets.model.Person;

public interface DefaultController {
	public void create(Person model);
	public void retrieve();
	public void update();
	public void delete();
}
