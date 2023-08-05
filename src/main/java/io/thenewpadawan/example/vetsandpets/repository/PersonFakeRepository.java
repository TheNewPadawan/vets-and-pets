package io.thenewpadawan.example.vetsandpets.repository;

import java.util.*;

import io.thenewpadawan.example.vetsandpets.model.Person;

public class PersonFakeRepository {
	private Map<Long, Person> db = new HashMap<>();
	private Long k = 1L;
	
	public void save(Person p) {
		if (p.getId() == 0) {
			db.put(k, p);
			p.setId(k++);
		}
	}
	
	public Person findById(long id) {
		Person ritorno = db.get(id);
		return ritorno;
	}
	
	public void update(Person p) {
		if (p.getId() > 0
				&& db.containsKey(p.getId())) {
			db.put((Long) p.getId(), p)
					.setId(0);
		}
	}

	public void deleteById(long id) {
		if (id > 0
				&& db.containsKey(id)) {
			db.remove(id).setId(0);	
		}
	}
}
