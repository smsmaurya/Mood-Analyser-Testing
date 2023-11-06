package com.bridgeLabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MoodAnalyserTest {

    MoodAnalyser moodAnalyser = new MoodAnalyser();

    @Test
    public void givenMoodShouldReturnSad(){
        String mood=moodAnalyser.moodAnalyse("I am in sad mood");
        Assertions.assertEquals("SAD",mood);
    }

    @Test
    public void givenMoodShouldReturnHappy(){
        String mood = moodAnalyser.moodAnalyse("I am in happy mood");
        Assertions.assertEquals("HAPPY",mood);
    }

    @Test
    public void givenMoodShouldReturnSadUsingConstructor(){
        MoodAnalyser moodAnalyser1 = new MoodAnalyser("I am in sad mood");
        Assertions.assertEquals("SAD",moodAnalyser1.moodAnalyserConstructor());
    }

    @Test
    public void givenMoodShouldReturnHappyUsingConstructor(){
        MoodAnalyser moodAnalyser2 = new MoodAnalyser("I am in Happy mood");
        Assertions.assertEquals("HAPPY",moodAnalyser2.moodAnalyserConstructor());
    }



}
