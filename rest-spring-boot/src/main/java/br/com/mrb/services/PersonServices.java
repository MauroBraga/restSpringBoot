package br.com.mrb.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.mrb.exception.ResourceNotFoundExcpetion;
import br.com.mrb.model.Person;
import br.com.mrb.repository.PersonRepository;

@Service
public class PersonServices {
	
	@Autowired
	private PersonRepository repository;
	
	public Person create(Person person) {
		return repository.save(person);
	}
	
	public Person update(Person person) {
		return repository.save(person); 
	}
	
	
	public void delete(Long id) {
		Person entity =repository.findById(id).orElseThrow(() -> new ResourceNotFoundExcpetion("Not Records found for this ID"));
		repository.delete(entity);
	}
	
	public Person findById(Long id) {
		return repository.findById(id).orElseThrow(() -> new ResourceNotFoundExcpetion("Not Records found for this ID")); 
	}
	
	
	public List<Person> findAll() {
		return repository.findAll(); 
	}
	
	
}