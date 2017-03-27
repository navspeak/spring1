package com.nav.componentscan;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class App {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("com/nav/spring/test/beans/beanDiscovery.xml");

		Logger logger = (Logger)context.getBean("logger");

		logger.writeConsole("Hello there");
		logger.writeFile("Hi again");

		Robot robot = (Robot)context.getBean("robot");

		robot.speak();


		((ClassPathXmlApplicationContext)context).close();
	}

}
