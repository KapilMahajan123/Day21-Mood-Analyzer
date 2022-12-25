package com.moodAnalyzer.java;

import com.moodAnalyzer.java.MoodAnalysisException.ExceptionType;

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
	
	//Function to check Mood of a String Entered
	public String analyzeMood() throws MoodAnalysisException {
		try {
			if(message.length() == 0) {
				throw new MoodAnalysisException(ExceptionType.ENTERED_EMPTY, "You entered an Invalid input!\\nPlease enter a non-empty input for mood.");
			}
				
			if(message.contains("sad"))
				return "SAD";
			else
				return "HAPPY";
		} catch (NullPointerException e) {
			throw new MoodAnalysisException(ExceptionType.ENTERED_NULL, "You entered an Invalid input!\\nPlease enter a non-NULL input for mood.");
		}
	}
	
}	