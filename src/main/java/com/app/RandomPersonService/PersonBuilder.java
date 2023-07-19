package com.app.RandomPersonService;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class PersonBuilder {
	
	public List<Person> generatePerson(int noOfPerson) {
		ArrayList<Person> personList = new ArrayList<Person> ();
		for (int i = 0; i < noOfPerson; i++) {
			Person person = new Person();
			person.setId(RandomBuilder.randomNumber(6));
			person.setMobileNumber(RandomBuilder.randomNumber(10));
			person.setAge(RandomBuilder.randomAge());
			person.setSex(RandomBuilder.randomSex());
			person.setAddress(RandomBuilder.RandomAddress());
			person.setName(RandomBuilder.StringRandomName());
			personList.add(person);
		}
		return personList;
	}
	public Person generateOneperson(int id) {
		Person person = new Person();
		person.setId(id);
		person.setMobileNumber(RandomBuilder.randomNumber(10));
		person.setAge(RandomBuilder.randomAge());
		person.setSex(RandomBuilder.randomSex());
		person.setAddress(RandomBuilder.RandomAddress());
		person.setName(RandomBuilder.StringRandomName());
		
		return person;
		
	}
	


}
