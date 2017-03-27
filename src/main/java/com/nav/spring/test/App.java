package com.nav.spring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class App {
	
	public static void main(String[] args) {
		
		//ApplicationContext context = new FileSystemXmlApplicationContext("/src/main/java/com/nav/spring/test/beans/beans.xml");
		ApplicationContext context = new ClassPathXmlApplicationContext("com/nav/spring/test/beans/beans.xml");
		Person person1 = (Person) context.getBean("person");
		//Person person2 = (Person) context.getBean("person");
		person1.setTaxId(666);;
		System.out.println(person1);
		//System.out.println(person2);
		
		
		Address address = (Address) context.getBean("address");
		System.out.println(address);
		
		FruitBasket basket = (FruitBasket) context.getBean("basket");
		System.out.println(basket);
		
		FruitBasket basket2 = (FruitBasket) context.getBean("basket2");
		System.out.println(basket2);
		
		Jungle j = (Jungle) context.getBean("jungle");
		System.out.println(j);
		
		JungleMap j2 = (JungleMap) context.getBean("jungle2");
		System.out.println(j2);
		((ClassPathXmlApplicationContext) context).close();
		
		
	}

	// NOTES:
	// Bean Scope: Singleton is default and only one bean is created
	// Bean Scope: Prototype, one object created per getBean()
	// Destroy Method not called by for prototype bean scope
}
