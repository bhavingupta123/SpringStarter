package com.bhavin.demo.com.bhavin.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		
		CricketCoach theCoach = (CricketCoach)context.getBean("mycricketcoach");
		
		System.out.println(theCoach.getDailyFortune());
		System.out.println(theCoach.getDailyWorkOut());
		
		context.close();
	}

}
