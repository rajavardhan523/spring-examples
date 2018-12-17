package org.rajavardhan.spring.tutorial.springtest;

public class PersonFactory {
	public Person createPerson() {
		System.out.println("Creating Person using Factory");
		Person person = new Person();
		person.setId(1841);
		person.setName("RV");
		return person;

	}
}
