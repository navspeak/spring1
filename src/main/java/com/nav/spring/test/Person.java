package com.nav.spring.test;

public class Person {
	private int id;
	private String name;
	private Address address;
	
	public Address getAddress() {
		return address;
	}

	
	public void setAddress(Address address) {
		this.address = address;
	}


	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", address=" + address
				+ ", taxId=" + taxId + "]";
	}

	private int taxId;
	


	public Person() {
	}

	
	public Person(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public static Person getInstance(int id, String name){
		System.out.println("Creating person using Factory Method");
		return new Person(id, name);
	}
	
	public void onCreate(){
		System.out.println("Person Created " + this);
	}

	public void onDestroy(){
		System.out.println("Person Created " + this);
	}
	public void speak(){
		System.out.println("Hello!");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int getTaxId() {
		return taxId;
	}

	public void setTaxId(int taxId) {
		this.taxId = taxId;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}

}
