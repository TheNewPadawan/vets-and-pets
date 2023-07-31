package io.thenewpadawan.example.vetsandpets;

import java.util.Date;

import io.thenewpadawan.example.vetsandpets.model.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1 = new Person("Nico", "Rogai");
		Person p2 = new Vet("lamb", "fulg");
		Vet v1 = new Vet("marco", "rai");
		Pet pet1 = new Pet("kaila", "labrador", new Date());
		System.out.println("2 People, 1 Vet and 1 Pet created");
	}
}
