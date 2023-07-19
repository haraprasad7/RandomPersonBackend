package com.app.RandomPersonController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.app.RandomPersonService.Person;
import com.app.RandomPersonService.PersonBuilder;
import com.app.RandomPersonService.RandomBuilder;


@RestController
@CrossOrigin(origins="http://localhost:4200")
@RequestMapping("/api")
public class RestAPI {
	
	@Autowired
	PersonBuilder personBuilder;

	
	@GetMapping("/persons")
	public List<Person>  randomlist(@RequestParam("number") int noOfPerson) {
		//return "checked";
		System.out.println(noOfPerson);
		return personBuilder.generatePerson(noOfPerson);
		
	}
	
	@GetMapping("/persons/{personId}")
	public Person generateOnePerson( @PathVariable("personId") int personId) {
		return personBuilder.generateOneperson(personId);
	}
	

}
