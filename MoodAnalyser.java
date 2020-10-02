package com.bridgelabz.moodanalyser;

import com.bridgelabz.moodanalyser.MoodAnalysisException.EntryType;

public class MoodAnalyser {
	private String message;
	
	//Constructors
	public MoodAnalyser() {
		
	}

	public MoodAnalyser(String message) {
		this.message = message;
	}
	
	//Method to analyse mood
	public String analyseMood() throws MoodAnalysisException {
		try {
			if(message.length()==0)
				throw new MoodAnalysisException(EntryType.EMPTY_ENTRY,"Enter proper Mood!!");
			if(message.toLowerCase().contains("sad"))
				return "SAD";
			else
				return "HAPPY";
		}
		catch(NullPointerException e) {
			throw new MoodAnalysisException(EntryType.NULL_ENTRY,"Enter proper Mood!!");
		}
		
	}
}
