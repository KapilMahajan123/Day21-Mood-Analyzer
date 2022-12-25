package com.moodAnalyzer.java;

/**
 * 
 * @author Kapil
 *
 */
public class MoodAnalyzer {
	private String message;

	public MoodAnalyzer(String message) {
		this.message = message;
	}
	
	//Function to Check Mood of a String Entered
	public String analyzeMood() {
		if(message.contains("sad"))
			return "SAD";
		else
			return "HAPPY";
	}
}
