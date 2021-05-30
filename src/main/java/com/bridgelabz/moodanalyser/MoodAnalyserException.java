package com.bridgelabz.moodanalyser;
public class MoodAnalyserException extends Exception {
    static ExceptionTypes message;
    enum ExceptionTypes{
         NULL_POINTER_EXCEPTION,
        EMPTY_STRING_EXCEPTION,
        UNDEFINED_MOOD_EXCEPTION
    }
    public MoodAnalyserException(ExceptionTypes message) {
        super(String.valueOf(message));
        this.message = message;
    }
}
