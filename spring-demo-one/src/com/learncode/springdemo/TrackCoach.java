package com.learncode.springdemo;

public class TrackCoach implements Coach {
	
	private FortuneService fortuneService;
	
	public TrackCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Run a hard 5k";
	}

	@Override
	public String getDailyFortune() {
		return "Just do it : " + fortuneService.getFortune();
	}
	
	//add an init method
	public void startUpStuff() {
		System.out.println("Inside startup method");
	}
	
	//add shutdown method
	public void shutdownStuff() {
		System.out.println("Inside shutdown method");
	}

}
