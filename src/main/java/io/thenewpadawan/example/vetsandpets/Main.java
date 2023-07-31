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
		Pet pet2 = new Pet("Alan", "pastore scozzese", new Date());
		System.out.println("2 People, 1 Vet and 1 Pet created");
		//1) Ti do una persona
		//2) Ti do un animale
		//3) Fa si che la persona adotti l'animale
		//4) Ogni persona può adottare N animali
		//5) Non si può adottare un animale che si ha già nella propria lista
		//nota bene: la relazione deve essere persistente
		p1.adopt(pet1);
		p1.adopt(pet2);
		p1.adopt(new Pet(pet1.getName(), pet1.getBreed(), pet1.getDateOfBirth()));
		for (Pet pet : p1.getPets()) {
			System.out.println("Che bel cucciolo, come si chiama? " + pet.getName());
		}
		p1.getPets().forEach(pet -> {
			System.out.println("Che bel cucciolo, come si chiama? " + pet.getName());
		});
	}
}
