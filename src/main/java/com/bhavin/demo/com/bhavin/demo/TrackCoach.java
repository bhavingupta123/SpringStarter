package com.bhavin.demo.com.bhavin.demo;

public class TrackCoach implements Coach {
	
	private FortuneService fortuneservice;
	
	TrackCoach(FortuneService thefortuneservice){
		fortuneservice = thefortuneservice;
	}
	
	@Override
	public String getDailyWorkOut() {
		return "run da";
	}

	@Override
	public String getDailyFortune() {
		return fortuneservice.getFortune();
	}

}
