package com.nav.spring.test;

public class PersonFactory {
	
	// this must be non static
	// but a factory method in the class must be static
	public Person createPerson(int id, String name){
		System.out.println("Using Factory to create Person");
		return new Person(id, name);
	}

}
