package com.nav.spring.test;

import java.util.List;

public class FruitBasket {
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(name + " contains \n");
		for(String s: fruits)
			sb.append(s+"\n ");
		return sb.toString();
	}

	private String name;
	private List<String> fruits;
	
	public FruitBasket(String name, List<String> fruits) {
		this.name = name;
		this.fruits = fruits;
	}

}
