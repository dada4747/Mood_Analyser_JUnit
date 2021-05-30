package com.bridgelabz.moodanalyser;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MoodAnalyserTest {
    @Test
    public void givenSadMessage_WhenAnalysed_MessageShouldReturnSad(){
        MoodAnalyser moodAnalyser = new MoodAnalyser("I am in sad Mood");
        String mood = moodAnalyser.analyseMood();
        Assertions.assertEquals("SAD", mood);
    }
    @Test
    public void givenAnyMoodMessage_WhenAnalysed_MessageShouldReturnHappy(){
        MoodAnalyser moodAnalyser = new MoodAnalyser("I am in any Mood");
        String mood = moodAnalyser.analyseMood();
        Assertions.assertEquals("HAPPY", mood);
    }
    @Test
    public void givenHappyMessage_WhenAnalysed_Message_ShouldReturnSad(){
        MoodAnalyser moodAnalyser = new MoodAnalyser("I am in happy Mood");
        String mood = moodAnalyser.analyseMood();
        Assertions.assertEquals("SAD", mood);
    }

}