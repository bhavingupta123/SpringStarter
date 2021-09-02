package com.bhavin.demo.com.bhavin.demo;

public class CricketCoach implements Coach {
	
	private FortuneService myfortune;
	
	public CricketCoach() {
		System.out.println("cri coach default cons");
	}
	
	public void setMyfortune(FortuneService myfortune) {
		
		System.out.println("cri coach default setter");
		this.myfortune = myfortune;
	}


	@Override
	public String getDailyWorkOut() {
		// TODO Auto-generated method stub
		return "bowling boiis";
	}
	
	
	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return myfortune.getFortune();
	}

}
