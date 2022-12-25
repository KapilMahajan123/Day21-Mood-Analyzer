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
		MoodAnalyzer moodAnalyzer = new MoodAnalyzer("This is a sad message");
		String mood = moodAnalyzer.analyzeMood();
		assertEquals("SAD", mood);
	}
	
	@Test
	public void givenMessage_whenNotSad_shouldReturnHappy() {
		MoodAnalyzer moodAnalyzer = new MoodAnalyzer("This is a happy message");
		String mood = moodAnalyzer.analyzeMood();
		assertEquals("HAPPY", mood);
	}
	
	@Test
	public void givenMessage_whenNull_shouldThrowException() {
		MoodAnalyzer moodAnalyzer = new MoodAnalyzer(null);
		String mood = moodAnalyzer.analyzeMood();
		assertEquals("HAPPY", mood);
	}
}
