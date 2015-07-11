package com.javacodegeeks.areyes1.beans;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {


	public static void main(String[] args) {
	
			ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
			Cat cat = (Cat) context.getBean("cat");
			System.out.println(cat.toString());
			Dog dog = (Dog) context.getBean("dog");			
			System.out.println(dog.toString());	
			context.close();
	}
}
