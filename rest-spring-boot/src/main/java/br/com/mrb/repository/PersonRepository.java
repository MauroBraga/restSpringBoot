package br.com.mrb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.mrb.model.Person;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long>{

}