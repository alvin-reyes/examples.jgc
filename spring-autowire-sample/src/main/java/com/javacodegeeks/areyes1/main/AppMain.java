package com.javacodegeeks.areyes1.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.javacodegeeks.areyes1.beans.UserAccountService;

public class AppMain {


	private UserAccountService userAccountService;
	
	public AppMain() {
		ClassPathXmlApplicationContext context =  new ClassPathXmlApplicationContext("classpath*:/applicationContext.xml");
		UserAccountService userAccountService = (UserAccountService)context.getBean("userAccountService");
		System.out.println(userAccountService.getName());
		System.out.println(userAccountService.getDetails());
		System.out.println(userAccountService.getDescription());
		
		context.close();
	}
	
	
	public static void main(String[] args ) {
		new AppMain();
	}
}
