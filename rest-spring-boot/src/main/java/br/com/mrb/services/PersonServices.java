package br.com.mrb.services;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.stereotype.Service;

import br.com.mrb.model.Person;

@Service
public class PersonServices {
	
	private final AtomicLong couter = new AtomicLong();
	
	public Person create(Person person) {
		person.setId(couter.incrementAndGet());
		return person;
	}
	
	public Person update(Person person) {
		return person;
	}
	
	
	public void delete(String id) {
	
	}
	
	public Person findById(String id) {
		Person person = new Person();
		person.setId(couter.incrementAndGet());
		person.setFirstName("Mauro");
		person.setLastName("Braga");
		person.setAddress("Rua Araguaia");
		person.setGender("Male");
		return person; 
	}
	
	
	public List<Person> findAll() {
		
		List<Person> lista = new ArrayList<>();
		
		for(int i =0; i < 10; i++) {
			Person person = mockPerson(i);
			lista.add(person);
		}
		
		return lista; 
	}


	private Person mockPerson(int i) {
		Person person = new Person();
		person.setId(couter.incrementAndGet());
		person.setFirstName("First Name "+i);
		person.setLastName("Last Name"+i);
		person.setAddress("Address"+i);
		person.setGender("Male");
		return person; 
	}
	
	
}