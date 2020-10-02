package com.bridgelabz.moodanalyser;

public class MoodAnalyser {
	private String message;
	
	//Constructors
	public MoodAnalyser() {
		
	}

	public MoodAnalyser(String message) {
		this.message = message;
	}
	
	//Method to analyse mood
	public String analyseMood() {
		if(message.toLowerCase().contains("sad"))
			return "SAD";
		else
			return "HAPPY";
		
	}

}
