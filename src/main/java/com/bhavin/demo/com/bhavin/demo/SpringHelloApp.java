package com.bhavin.demo.com.bhavin.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringHelloApp {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		
		Coach theCoach = (Coach)context.getBean("myCoach");
		
		System.out.println(theCoach.getDailyFortune());
		
		System.out.println(theCoach.getDailyWorkOut());
		
		context.close();
	}

}
