package com.bridgelabz.moodanalyser;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MoodAnalyserTest {
    @Test
    public void givenSadMessage_WhenAnalysed_MessageShouldReturnSad() throws MoodAnalyserException {
        MoodAnalyser moodAnalyser = new MoodAnalyser("I am in sad Mood");
        String mood = moodAnalyser.analyseMood();
        Assertions.assertEquals("SAD", mood);
    }
   @Test
    public void givenAnyMoodMessage_WhenAnalysed_MessageShouldReturnHappy() throws MoodAnalyserException {
        MoodAnalyser moodAnalyser = new MoodAnalyser("I am in any Mood");
        String mood = moodAnalyser.analyseMood();
        Assertions.assertEquals("HAPPY", mood);
    }
    @Test
      public void givenHappyMessage_WhenAnalysed_Message_ShouldReturnSad() throws MoodAnalyserException {
          MoodAnalyser moodAnalyser = new MoodAnalyser("I am in happy Mood");
          String mood = moodAnalyser.analyseMood();
          Assertions.assertEquals("HAPPY", mood);
      }
      @Test
      public void givenNoParameterMessage_WhenAnalysed_MessageShouldReturnSad() throws MoodAnalyserException {
          MoodAnalyser moodAnalyser = new MoodAnalyser(null);
          String mood = moodAnalyser.analyseMood();
          Assertions.assertEquals("HAPPY", mood);
      }
    @Test
    public void GivenEmptyMessage_WhenAnalysed_ShouldGiveEmptyException() throws MoodAnalyserException {
        MoodAnalyser moodAnalyser = new MoodAnalyser("");
        String mood = moodAnalyser.analyseMood();
        Assertions.assertEquals("HAPPY", mood );
    }

}