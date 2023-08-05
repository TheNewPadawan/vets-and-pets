package io.thenewpadawan.example.vetsandpets;

import java.util.Date;

import io.thenewpadawan.example.vetsandpets.controller.PersonController;
import io.thenewpadawan.example.vetsandpets.model.*;
import io.thenewpadawan.example.vetsandpets.repository.PersonFakeRepository;

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
		
		//1) Creare un person controller
		//2) Creare repository
		//3) Creare un CRUD completo
		//3.1) Creare metodo create
		//3.2) Creare metodo retrieve
		//3.3) Creare metodo update
		//3.4) Creare metodo delete
		//4) Creare relativi metodi nel repository ed implementarli nei punti 3.x
		PersonFakeRepository personFakeRepository = new PersonFakeRepository();
		PersonController personController = new PersonController(personFakeRepository);
		personController.create(p1);
		Person pReturn = personController.retrieve(p1.getId());
		if (!p1.equals(pReturn)) {
			System.out.println("Salvataggio sul DB non andato a buon fine");
		}
		personController.create(p2);
		pReturn = personController.retrieve(p2.getId());
		if (p1.equals(pReturn)) {
			System.out.println("Salvataggio sul DB non andato a buon fine, errore con ID");
		}
		if (!p2.equals(pReturn)) {
			System.out.println("Salvataggio sul DB non andato a buon fine, errore con ID");
		}
		if (!p1.equals(personController.retrieve(p1.getId()))) {
			System.out.println("Oggetto uno perso, non più nel DB");
		}
		pReturn = personController.retrieve(p1.getId());
		personController.create(p1);
		Person p1Updated = new Person(p1.getFirstname(), p1.getLastname());
		p1Updated.setId(p1.getId());
		p1Updated.setFirstname("Luana");
		personController.update(p1Updated);
		pReturn = personController.retrieve(p1Updated.getId());
		//TEST:
		//1) Verificare che l'oggetto p1Update abbia lo stesso id che aveva p1
		if (p1.getId() == pReturn.getId() ) {
			System.out.println("Gli oggetti hanno lo stesso id");
		}
		//2) Oggetto test p1 non deve più esistere 
		if (p1.equals(pReturn)) {
			System.out.println("Salvataggio sul DB non andato a buon fine, errore con ID");
		}
		//3) Oggetto test p1Updated deve esistere 
		if (!p1.equals(pReturn)) {
			System.out.println("Salvataggio sul DB andato a buon fine, nome: " + pReturn.getFirstname());
		}
		personController.update(p1);
		pReturn = personController.retrieve(p1.getId());
		if (p1.equals(pReturn)) {
			System.out.println("non deve essere possibile richiamare un'update così semplicemente");
		}
		//TODO: in qualche modo, ora l'update della prossima riga lo faccio rifunzionare
		p1.setId(p1Updated.getId());
		personController.update(p1);
		pReturn = personController.retrieve(p1.getId());
		
		//Test delete
		personController.delete(p1.getId());
		//1) Faccio una retrieve su quell'id 
		pReturn = personController.retrieve(p1.getId());
		if(pReturn == null) {
			System.out.println("L'oggetto con questo id non è più disponibile");
		}
	}
}
