package com.nav.spring.test;

import java.util.List;

public class Jungle {
	
	private Animal largest;
	private List<Animal> animals;
	
	public Animal getLargest() {
		return largest;
	}

	public void setLargest(Animal largest) {
		this.largest = largest;
	}

	public List<Animal> getAnimals() {
		return animals;
	}

	public void setAnimals(List<Animal> animals) {
		this.animals = animals;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Largest animal is :").append(largest).append("\n Others are \n");
		for(Animal s: animals)
			sb.append(s+"\n ");
		return sb.toString();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
