package com.moodAnalyzer.java;

/**
 * 
 * @author Kapil
 *
 */
public class MoodAnalyzer {
	
	//Function to Check Mood of a String Entered
	public String analyzeMood(String message) {
		if(message.contains("sad"))
			return "SAD";
		else
			return "HAPPY";
	}
}
