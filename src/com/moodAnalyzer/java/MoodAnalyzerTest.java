package com.moodAnalyzer.java;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * 
 * @author Kapil
 *
 */
public class MoodAnalyzerTest {
	
	/**
	 * To check the mood of the person by string entered
	 * created object of mood analyzer
	 * created a test function and imported assertions 
	 * And checking Sad or Happy
	 */
	@Test
	public void givenMessage_whenSad_shouldReturnSad() {
		MoodAnalyzer moodAnalyzer = new MoodAnalyzer();
		String mood = moodAnalyzer.analyzeMood("This is a sad message");
		assertEquals("SAD", mood);
	}
	
	@Test
	public void givenMessage_whenNotSad_shouldReturnHappy() {
		MoodAnalyzer moodAnalyzer = new MoodAnalyzer();
		String mood = moodAnalyzer.analyzeMood("This is a happy message");
		assertEquals("HAPPY", mood);
	}
}
