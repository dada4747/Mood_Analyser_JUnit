package com.bridgelabz.moodanalyser;

public class MoodAnalyser {
    public String analyseMood(String message) {
        if (message.contains("SAD")){
            return "SAD";
        }else {
            return "HAPPY";
        }
    }
}
