package com.moodAnalyzer.java;

/**
 * 
 * @author Kapil
 *
 */
public class MoodAnalysisException extends Exception{
	ExceptionType type;
	
	enum ExceptionType{
		ENTERED_NULL, ENTERED_EMPTY
	}

	public MoodAnalysisException() {

	}

	public MoodAnalysisException(ExceptionType type, String message) {
		super(message);
		this.type = type;
	}
}	
