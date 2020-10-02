package com.bridgelabz.moodanalyser;

import static org.junit.Assert.*;

import org.junit.Test;

import com.bridgelabz.moodanalyser.MoodAnalysisException.EntryType;

public class MoodAnalyserTest {

	@Test
	public void test() {

		MoodAnalyser obj1 = new MoodAnalyser(null);
		try
		{
			obj1.analyseMood();
		}
		catch(MoodAnalysisException e) {
			assertEquals(EntryType.NULL_ENTRY,e.type);			
		}
		MoodAnalyser obj2 = new MoodAnalyser("");
		try
		{
			obj2.analyseMood();
		}
		catch(MoodAnalysisException e) {
			assertEquals(EntryType.EMPTY_ENTRY,e.type);			
		}
	}
	

}
