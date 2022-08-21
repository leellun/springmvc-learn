package com.newland.jpa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.newland.jpa.dao.PersonDao;
import com.newland.jpa.entity.Person;

@Service
public class PersonService {
	
	@Autowired
	private PersonDao personDao;
	
	public List<Person> getPersons(){
		return personDao.getPersons();
	}
	
}
