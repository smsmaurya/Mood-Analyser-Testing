package com.bridgeLabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MoodAnalyserTest {

    MoodAnalyser moodAnalyser = new MoodAnalyser();

    @Test
    public void givenMoodShouldReturnSad(){
        String mood=moodAnalyser.moodAnalyse("My mood is sad");
        Assertions.assertEquals("SAD",mood);
    }

    @Test
    public void givenMoodShouldReturnHappy(){
        String mood = moodAnalyser.moodAnalyse("My mood is happy");
        Assertions.assertEquals("HAPPY",mood);
    }

}
