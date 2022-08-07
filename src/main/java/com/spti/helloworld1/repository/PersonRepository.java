package com.spti.helloworld1.repository;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import com.spti.helloworld1.entity.Person;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public class PersonRepository {
	
	@PersistenceContext
	private EntityManager em;

	@SuppressWarnings("unchecked")

	public List<Person> getAllPersons() {
		return em.createNamedQuery("Persons.findAll").getResultList();
	}

}