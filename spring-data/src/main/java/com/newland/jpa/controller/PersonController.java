package com.newland.jpa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.newland.jpa.entity.Person;
import com.newland.jpa.service.PersonService;

@Controller
public class PersonController {
	@Autowired
	private PersonService personService;

	@ResponseBody
	@RequestMapping("/persons")
	public List<Person> persons() {
		return personService.getPersons();
	}
}
