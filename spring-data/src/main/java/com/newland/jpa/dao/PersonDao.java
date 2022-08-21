package com.newland.jpa.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.newland.jpa.entity.Person;

@Repository
public class PersonDao {

	//通过 @PersistenceContext 注解来标记成员变量!
	@PersistenceContext
	private EntityManager entityManager;

	@SuppressWarnings("unchecked")
	public List<Person> getPersons() {
		return (List<Person>) entityManager.createQuery("SELECT p  FROM Person p").getResultList();
	}

}
