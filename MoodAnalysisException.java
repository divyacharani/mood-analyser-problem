package com.bridgelabz.moodanalyser;

public class MoodAnalysisException extends Exception {
	enum EntryType {
		NULL_ENTRY,EMPTY_ENTRY;
	}
	EntryType type;
	public MoodAnalysisException(EntryType type, String message) {
		super(message);
		this.type = type;
	}
	

}
