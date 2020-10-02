package com.bridgelabz.moodanalyser;

import static org.junit.Assert.*;

import org.junit.Test;

public class MoodAnalyserTest {

	@Test
	public void test() {
		//SAD Mood
		MoodAnalyser obj1 = new MoodAnalyser("I am in a Sad Mood");
		assertEquals("SAD",obj1.analyseMood());
		//Happy Mood
		MoodAnalyser obj2 = new MoodAnalyser("I am in Any Mood");
		assertEquals("HAPPY", obj2.analyseMood());
		MoodAnalyser obj3 = new MoodAnalyser("I am in Happy Mood");
		assertEquals("HAPPY", obj3.analyseMood());

	}

}
