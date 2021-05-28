package com.bridgelabz.moodanalyser;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MoodAnalyserTest {
    @Test
    public void testMoodAnalysys(){
        MoodAnalyser moodAnalyser=new MoodAnalyser();
        String mood = moodAnalyser.analyseMood("This is SAD Message");
        Assertions.assertEquals("SAD",mood);
    }
}