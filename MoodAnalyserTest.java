package com.bridgelabz.moodanalyser;

import static org.junit.Assert.*;

import org.junit.Test;

public class MoodAnalyserTest {

	@Test
	public void test() {
		MoodAnalyser obj = new MoodAnalyser();
		assertEquals("SAD",obj.analyseMood("I am in a Sad Mood"));
		assertEquals("HAPPY",obj.analyseMood("I am in Any Mood"));
	}

}
