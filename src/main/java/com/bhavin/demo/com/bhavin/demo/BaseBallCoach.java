package com.bhavin.demo.com.bhavin.demo;

public class BaseBallCoach implements Coach {
	
	private FortuneService fortuneservice;
	
	BaseBallCoach(FortuneService thefortuneservice){
		fortuneservice = thefortuneservice;
	}
	
	@Override
	public String getDailyWorkOut() {	
		return "spend 30";
	}

	@Override
	public String getDailyFortune() {
		
		return fortuneservice.getFortune();
	}
}