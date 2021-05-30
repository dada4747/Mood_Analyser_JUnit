package com.bridgelabz.moodanalyser;

public class MoodAnalyser {
    String message;

    public MoodAnalyser(String message) {
        this.message = message;
    }
    MoodAnalyser(){
    }

    public String analyseMood() {
        if (message.toLowerCase().contains("sad")){
            return "SAD";
        }
        if (message.toLowerCase().contains("happy")){
            return "SAD";
        }
        if (message.toLowerCase().contains("any")){
            return "HAPPY";

        }else
            return "HAPPY";
        }
}

