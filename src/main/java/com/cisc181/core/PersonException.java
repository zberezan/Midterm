package com.cisc181.core;

public class PersonException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = -3280945791314788244L;
	public Person Person;
	public int age;
	public PersonException(Person Person){
		this.Person = Person;
	}
	public Person getPerson() {
		return Person;
	}
	public int getAge() {
		return age;
	}

}
